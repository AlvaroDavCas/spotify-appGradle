package edu.iesam.features.songs.presentation;

import edu.iesam.features.songs.data.SongDataRepository;
import edu.iesam.features.songs.data.SongMemLocalDataSource;
import edu.iesam.features.songs.domain.DeleteSongsUseCase;
import edu.iesam.features.songs.domain.GetSongsUseCase;
import edu.iesam.features.songs.domain.SaveSongsUseCase;
import edu.iesam.features.songs.domain.Song;

import java.util.ArrayList;

public class SongView {

    public static void printSongs() {
        GetSongsUseCase getSongsUseCase = new GetSongsUseCase(new SongDataRepository(SongMemLocalDataSource.newInstance()));

        ArrayList<Song> songs = getSongsUseCase.execute();

        System.out.println(songs);
    }

    public static void saveSongs() {
        Song newSong = new Song("2", "Animals", "Martin Garris", "EDM", "2:30");

        SaveSongsUseCase saveAuthorsUseCase = new SaveSongsUseCase(new SongDataRepository(SongMemLocalDataSource.newInstance()));

        saveAuthorsUseCase.execute(newSong);
    }

    public static void deleteSongs(String songId) {
        DeleteSongsUseCase deleteSongsUseCase = new DeleteSongsUseCase(
                new SongDataRepository(SongMemLocalDataSource.newInstance()));

        deleteSongsUseCase.execute(songId);
    }
}
