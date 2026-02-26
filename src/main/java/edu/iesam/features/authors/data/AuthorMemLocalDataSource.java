package edu.iesam.features.authors.data;

import edu.iesam.features.authors.domain.Author;

import java.util.ArrayList;

public class AuthorMemLocalDataSource {

    private static AuthorMemLocalDataSource instance = null;

    public ArrayList<Author> authorsMemStorage = new ArrayList<>();

    public AuthorMemLocalDataSource() {
        initData();
    }

    private void initData(){
        Author author1 = new Author("1", "Alan Walker", "24-08-1997", "noruego");
        authorsMemStorage.add(author1);

        Author author2 = new Author("2", "Alan Walker", "24-08-1997", "britanica");
        authorsMemStorage.add(author2);
    }

    public ArrayList<Author> findAll(){
        return authorsMemStorage;
    }

    public static AuthorMemLocalDataSource newInstance() {
        if (instance == null) {
            instance = new AuthorMemLocalDataSource();
        }
        return instance;
    }

    public void save(Author author) {
        authorsMemStorage.add(author);
    }

}
