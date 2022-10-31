package com.example.assignment3.model;


import org.springframework.data.annotation.Id;

public class Photo {
    @Id
    private String id;
    private int albumId;
    private String coverPhotoUrl;
    private String createdBy;
    private String dateCreated;

    public Photo(int albumId, String coverPhotoUrl, String createdBy, String dateCreated) {
        this.albumId = albumId;
        this.coverPhotoUrl = coverPhotoUrl;
        this.createdBy = createdBy;
        this.dateCreated = dateCreated;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public String getcoverPhotoUrl() {
        return coverPhotoUrl;
    }

    public void setcoverPhotoUrl(String photoUrl) {
        this.coverPhotoUrl = photoUrl;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }
}
