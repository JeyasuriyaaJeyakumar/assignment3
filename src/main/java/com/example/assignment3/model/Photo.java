package com.example.assignment3.model;

public class Photo {
    private int id;
    private int albumId;
    private String coverPhotoUrl;
    private String createdBy;
    private String dateCreated;

    public Photo(int id, int albumId, String coverPhotoUrl, String createdBy, String dateCreated) {
        this.id = id;
        this.albumId = albumId;
        this.coverPhotoUrl = coverPhotoUrl;
        this.createdBy = createdBy;
        this.dateCreated = dateCreated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
