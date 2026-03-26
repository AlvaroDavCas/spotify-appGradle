package edu.iesam.features.albums.domain;

import edu.iesam.mocks.AlbumMockRepository;
import edu.iesam.mocks.EmptyAlbumMockRepository;
import edu.iesam.mocks.NullAlbumMockRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GetAlbumsUseCaseTest {

    public GetAlbumsUseCase getAlbumsUseCase;
    public AlbumMockRepository albumMockRepository;
    public EmptyAlbumMockRepository emptyAlbumMockRepository;
    public NullAlbumMockRepository nullAlbumMockRepository;

    @BeforeEach
    void setUp() {

    }

    /*
    Tipo test: devuelve 'algo'
    test que devuelve listado de datos
     */

    @Test
    public void shouldReturnAlbumListWhenExecuteUseCase(){
        //Given: Inicializamos variables
        albumMockRepository = new AlbumMockRepository();
        getAlbumsUseCase = new GetAlbumsUseCase(albumMockRepository);
        //When: Ejecutamos el caso de uso
        ArrayList<Album> albums = getAlbumsUseCase.execute();
        //Then: Asserts
        assertEquals(3, albums.size());
        assertEquals("1", albums.get(0).getId());
    }

    /*
    Tipo test: devuelve 'algo'
    test que devuelve un listado vacio
    */

    @Test
    public void shouldReturnEmptyAlbumListWhenExecuteUseCase(){
        //Given: Inicializamos variables
        emptyAlbumMockRepository = new EmptyAlbumMockRepository();
        getAlbumsUseCase = new GetAlbumsUseCase(emptyAlbumMockRepository);
        //When: Ejecutamos el caso de uso
        ArrayList<Album> albums = getAlbumsUseCase.execute();
        //Then: Asserts
        assertEquals(0, albums.size());
    }


    /*
    tipo test: Devuelve 'algo'
    test que devuelve un nulo
    */

    @Test
    public void shouldReturnNullAlbumListWhenExecuteUseCase(){
        //Given: Inicializamos variables
        nullAlbumMockRepository = new NullAlbumMockRepository();
        getAlbumsUseCase = new GetAlbumsUseCase(nullAlbumMockRepository);
        //When: Ejecutamos el caso de uso
        ArrayList<Album> albums = getAlbumsUseCase.execute();
        //Then: Asserts
        assertNull(albums);
    }
}