package com.spring.security.service.impl;

import com.spring.security.controller.dto.MusicDto;
import com.spring.security.controller.dto.mapper.MusicMapper;
import com.spring.security.entity.Music;
import com.spring.security.repository.MusicRepository;
import com.spring.security.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MusicServiceImpl implements MusicService {

    private final MusicRepository musicRepository;
    private final MusicMapper musicMapper;

    @Autowired
    public MusicServiceImpl(MusicRepository musicRepository, MusicMapper musicMapper) {
        this.musicRepository = musicRepository;
        this.musicMapper = musicMapper;
    }

    @Override
    public void addMusic(MusicDto musicDto) {
        musicRepository.save(musicMapper.map(musicDto));
    }

    @Override
    public Music getMusicByID(Long id) {
        return musicRepository.findById(id).orElseThrow();
    }

    @Override
    public void updateMusic(Long id, MusicDto musicDto) {
        musicRepository.saveAndFlush(musicMapper.map(musicDto));
    }
}
