package com.example.assignment3.service;

import com.example.assignment3.model.Album;
import com.example.assignment3.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AlbumService {

    @Autowired
    private AlbumRepository albumRepository;

    public Album saveAlbum(Album album) {
        return albumRepository.save(album);
    }
    public List<Album> getAllAlbum() {
        return albumRepository.findAll();
    }
    public Album updateAlbum(Album album) {
        return albumRepository.save(album);
    }


    public void deleteAlbum(String id) {
          albumRepository.deleteById(id);
    }

    public List<Album> getAlbumById(String id) {
        return albumRepository.findAllById(id);
    }
    /*

    public Album getAlbumById(int id) {
        return albumRepository.getAlbumById(id);
    }




     */
}
