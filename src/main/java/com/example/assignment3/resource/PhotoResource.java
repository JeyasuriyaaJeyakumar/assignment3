package com.example.assignment3.resource;

import com.example.assignment3.model.Photo;
import com.example.assignment3.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class PhotoResource {
    @Autowired
    private PhotoService photoService;

    @GetMapping("/photo")
    public List<Photo> getAllPhoto(){
        return photoService.getAllPhoto();
    }

    @GetMapping("/photo/{id}")
    public Photo getPhotoById(@PathVariable("id") int id){
        return photoService.getPhotoById(id);
    }
    //POST  methods
    @PostMapping("/photo")
    public Photo savePhoto(@RequestBody Photo photo){
        return photoService.savePhoto(photo);
    }

    //PUT methods
    @PutMapping("/photo/{id}")
    public Photo updatePhoto(@PathVariable("id") int id, @RequestBody Photo photo){
        return photoService.updatePhoto(id, photo);
    }

    //DELETE methods
    @DeleteMapping("/photo")
    public Photo deletePhoto(@RequestParam(name = "id")int id){
        return photoService.deletePhoto(id);
    }
}
