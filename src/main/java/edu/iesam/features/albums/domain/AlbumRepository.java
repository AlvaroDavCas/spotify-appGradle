package edu.iesam.features.albums.domain;

import edu.iesam.features.authors.domain.Author;

import java.util.ArrayList;

public interface AlbumRepository {

    ArrayList<Album> getAlbums();
    public void saveAlbum(Album album);
}
