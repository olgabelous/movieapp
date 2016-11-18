package by.epam.movieapp.repository;

import by.epam.movieapp.model.Genre;
import by.epam.movieapp.repository.exception.RepositoryException;

import java.util.List;

/**
 * @author Olga Shahray
 */
public interface IGenreRepository {

    void save(Genre genre) throws RepositoryException;

    void update(Genre genre) throws RepositoryException;

    // false if not found
    boolean delete(int id) throws RepositoryException;

    List<Genre> getAll() throws RepositoryException;

}
