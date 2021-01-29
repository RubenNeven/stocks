package com.spring.security.service;

import com.spring.security.controller.dto.MusicDto;
import com.spring.security.entity.Music;

import java.util.Optional;

public interface MusicService {
    void addMusic(MusicDto musicDto);

    Music getMusicByID(Long id);

    void updateMusic(Long id, MusicDto musicDto);
}
