package com.codegym.service;

import com.codegym.model.ImageComment;

import java.util.List;

public interface ImageService {
    List<ImageComment> findAll();
    List<ImageComment> findAll(List<Long> ids);
}
