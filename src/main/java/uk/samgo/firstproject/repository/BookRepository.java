package uk.samgo.firstproject.repository;

import org.springframework.data.repository.CrudRepository;
import uk.samgo.firstproject.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
