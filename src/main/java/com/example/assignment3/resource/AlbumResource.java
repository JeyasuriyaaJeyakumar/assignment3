package com.example.assignment3.resource;

import com.example.assignment3.model.Album;
import com.example.assignment3.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/albums")

public class AlbumResource {
    @Autowired
    private AlbumService albumService;

    //POST  methods
    @PostMapping
    public Album saveAlbum(@RequestBody Album album){
        return albumService.saveAlbum(album);
    }
    @GetMapping
    public List<Album> getAllAlbum(){
        return albumService.getAllAlbum();
    }

    @GetMapping("/find")
    public List<Album> getAlbumByID(@RequestParam(name = "id")String id){
        return albumService.getAlbumById(id);
    }

    //PUT methods
    @PutMapping
    public Album updateAlbum(@RequestBody Album album){
        return albumService.updateAlbum(album);
    }

    //DELETE methods
    @DeleteMapping
    public void deleteAlbum(@RequestParam(name = "id")String id){
         albumService.deleteAlbum(id);
    }


    /*

    @GetMapping("/album/{id}")
    public Album getAlbumById(@PathVariable("id") int id){
        return albumService.getAlbumById(id);
    }




     */
}
