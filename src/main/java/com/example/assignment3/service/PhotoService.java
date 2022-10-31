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

    public Photo savePhoto(Photo photo) {
        return photoRepository.save(photo);
    }

    public List<Photo> getAllPhoto() {
        return photoRepository.findAll();
    }
    public Photo updatePhoto(Photo photo) {
        return photoRepository.save(photo);
    }
    /*


    public Photo getPhotoById(int id) {
        return photoRepository.getPhotoByID(id);
    }



    public Photo deletePhoto(int id) {
        return photoRepository.deletePhoto(id);
    }

     */
}
