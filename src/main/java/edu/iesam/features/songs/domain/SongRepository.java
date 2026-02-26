package edu.iesam.features.songs.domain;

import edu.iesam.features.authors.domain.Author;

import java.util.ArrayList;

public interface SongRepository {

    public ArrayList<Song> getSongs();
    public void saveSong(Song song);

}
