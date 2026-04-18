package guru.springframework.spring7webapp.services;

import guru.springframework.spring7webapp.domain.Author;
import guru.springframework.spring7webapp.repositories.AuthorRepository;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class AuthorServiceImpl implements AuthorService {

    public final AuthorRepository authorRepository;


    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Iterable<Author> findAll() {
        return this.authorRepository.findAll();
    }
}
