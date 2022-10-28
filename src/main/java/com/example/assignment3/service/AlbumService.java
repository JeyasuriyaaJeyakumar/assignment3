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
    public List<Album> getAllAlbum() {
        return albumRepository.getAllAlbum();
    }

    public Album getAlbumById(int id) {
        return albumRepository.getAlbumById(id);
    }

    public Album saveAlbum(Album album) {
        return albumRepository.saveAlbum(album);
    }

    public Album updateAlbum(int id, Album album) {
        return albumRepository.updateAlbum(id, album);
    }

    public Album deleteAlbum(int id) {
        return albumRepository.deleteAlbum(id);
    }
}
