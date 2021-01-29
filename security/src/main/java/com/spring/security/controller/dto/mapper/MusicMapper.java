package com.spring.security.controller.dto.mapper;

import com.spring.security.controller.dto.MusicDto;
import com.spring.security.entity.Music;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class MusicMapper {

    public Music map (MusicDto musicDto){
        return Music.builder()
                .id(musicDto.getId())
                .artist(musicDto.getArtist())
                .title(musicDto.getTitle())
                .year(musicDto.getYear())
                .build();
    }

    public MusicDto map (Music music){
        return MusicDto.builder()
                .id(music.getId())
                .artist(music.getArtist())
                .title(music.getTitle())
                .year(music.getYear())
                .build();
    }
}
