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

    @GetMapping("/find")
    public List<Photo> getPhotoById(@RequestParam(name = "id")String id){
        return photoService.getPhotoById(id);
    }

    //PUT methods
    @PutMapping
    public Photo updatePhoto(@RequestBody Photo photo){
        return photoService.updatePhoto(photo);
    }
    //DELETE methods
    @DeleteMapping
    public void deletePhoto(@RequestParam(name = "id")String id){
          photoService.deletePhoto(id);
    }

}
