package com.spring.security.controller;

import com.spring.security.controller.dto.MusicDto;
import com.spring.security.controller.dto.mapper.MusicMapper;
import com.spring.security.service.MusicService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class MusicController {

    private final MusicService musicService;
    private final MusicMapper musicMapper;

    public MusicController(MusicService musicService, MusicMapper musicMapper) {
        this.musicService = musicService;
        this.musicMapper = musicMapper;
    }

    @GetMapping("/music/{id}")
    public MusicDto getMusicById(@PathVariable Long id){
        return musicMapper.map(musicService.getMusicByID(id));
    }

    @PostMapping("/music")
    public void addMusic(@RequestBody MusicDto musicDto){
        musicService.addMusic(musicDto);
    }

    @PutMapping("/music/{id}")
    public void updateMusic(@PathVariable Long id, @RequestBody MusicDto musicDto){
        musicService.updateMusic(id, musicDto);
    }
}
