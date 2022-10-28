package com.example.assignment3.repository;

import com.example.assignment3.model.Album;
import com.example.assignment3.model.Comment;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AlbumRepository {
    List<Album> albumList = new ArrayList();
    public List<Album> getAllAlbum() {
        return albumList;
    }

    public Album getAlbumById(int id) {
        for (Album album:albumList){
            if (album.getId() == id){
                return album;
            }
        }
        return null;
    }

    public Album saveAlbum(Album album) {
        album.setId(albumList.size() +1);
        albumList.add(album);
        return album;
    }

    public Album updateAlbum(int id, Album album) {
        for (Album a:albumList){
            if (a.getId() == id){
                a.setName(album.getName());
                a.setCoverPhotoUrl(album.getCoverPhotoUrl());
                a.setCreatedBy(album.getCreatedBy());
                a.setDateCreated(album.getDateCreated());
                return a;
            }
        }
        return null;
    }

    public Album deleteAlbum(int id) {
        Album deletedAlbum = null;
        for (Album a:albumList){
            if(a.getId() == id){
                deletedAlbum = a;
                albumList.remove(a);
                return deletedAlbum;
            }
        }
        return deletedAlbum;
    }
}
