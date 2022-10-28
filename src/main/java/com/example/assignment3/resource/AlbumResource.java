package com.example.assignment3.resource;

import com.example.assignment3.model.Album;
import com.example.assignment3.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")

public class AlbumResource {
    @Autowired
    private AlbumService albumService;

    @GetMapping("/album")
    public List<Album> getAllAlbum(){
        return albumService.getAllAlbum();
    }

    @GetMapping("/album/{id}")
    public Album getAlbumById(@PathVariable("id") int id){
        return albumService.getAlbumById(id);
    }
    //POST  methods
    @PostMapping("/album")
    public Album saveAlbum(@RequestBody Album album){
        return albumService.saveAlbum(album);
    }

    //PUT methods
    @PutMapping("/album/{id}")
    public Album updateAlbum(@PathVariable("id") int id, @RequestBody Album album){
        return albumService.updateAlbum(id, album);
    }

    //DELETE methods
    @DeleteMapping("/album")
    public Album deleteAlbum(@RequestParam(name = "id")int id){
        return albumService.deleteAlbum(id);
    }
}
