package com.example.assignment3.resource;

import com.example.assignment3.model.Photo;
import com.example.assignment3.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/photos")
public class PhotoResource {
    @Autowired
    private PhotoService photoService;

    //POST  methods
    @PostMapping
    public Photo savePhoto(@RequestBody Photo photo){
        return photoService.savePhoto(photo);
    }
    @GetMapping
    public List<Photo> getAllPhoto(){
        return photoService.getAllPhoto();
    }

    //PUT methods
    @PutMapping
    public Photo updatePhoto(@RequestBody Photo photo){
        return photoService.updatePhoto(photo);
    }
    /*

    @GetMapping("/photo/{id}")
    public Photo getPhotoById(@PathVariable("id") int id){
        return photoService.getPhotoById(id);
    }




    //DELETE methods
    @DeleteMapping("/photo")
    public Photo deletePhoto(@RequestParam(name = "id")int id){
        return photoService.deletePhoto(id);
    }

     */
}
