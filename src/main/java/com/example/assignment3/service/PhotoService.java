package com.example.assignment3.service;

import com.example.assignment3.model.Photo;
import com.example.assignment3.repository.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhotoService {

    @Autowired
    private PhotoRepository photoRepository;
    public List<Photo> getAllPhoto() {
        return photoRepository.getAllPhoto();
    }

    public Photo getPhotoById(int id) {
        return photoRepository.getPhotoByID(id);
    }

    public Photo savePhoto(Photo photo) {
        return photoRepository.savePhoto(photo);
    }

    public Photo updatePhoto(int id, Photo photo) {
        return photoRepository.updatePhoto(id, photo);
    }

    public Photo deletePhoto(int id) {
        return photoRepository.deletePhoto(id);
    }
}
