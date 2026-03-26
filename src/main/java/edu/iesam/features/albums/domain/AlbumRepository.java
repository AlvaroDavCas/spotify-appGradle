package edu.iesam.features.albums.domain;

import java.util.ArrayList;

public interface AlbumRepository {

    ArrayList<Album> getAlbums();
    public void saveAlbum(Album album);
    public void deleteAlbum(String albumId);
    Album getAlbum(String id);
}
