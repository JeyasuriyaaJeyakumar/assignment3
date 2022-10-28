package com.example.assignment3.repository;

import com.example.assignment3.model.Photo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository

public class PhotoRepository {

    List<Photo> photoList = new ArrayList();
    public List<Photo> getAllPhoto() {
        return photoList;
    }

    public Photo getPhotoByID(int id) {
        for (Photo photo:photoList){
            if (photo.getId() == id){
                return photo;
            }
        }
        return null;
    }

    public Photo savePhoto(Photo photo) {
        photo.setId(photoList.size() +1);
        photoList.add(photo);
        return photo;
    }

    public Photo updatePhoto(int id, Photo photo) {
        for (Photo p:photoList){
            if (p.getId() == id){
                p.setAlbumId(photo.getAlbumId());
                p.setcoverPhotoUrl(photo.getcoverPhotoUrl());
                p.setCreatedBy(photo.getCreatedBy());
                p.setDateCreated(photo.getDateCreated());
                return p;
            }
        }
        return null;
    }

    public Photo deletePhoto(int id) {
        Photo deletedPhoto = null;
        for (Photo p:photoList){
            if(p.getId() == id){
                deletedPhoto = p;
                photoList.remove(p);
                return deletedPhoto;
            }
        }
        return deletedPhoto;
    }
}
