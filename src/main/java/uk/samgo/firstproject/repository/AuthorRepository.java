package uk.samgo.firstproject.repository;

import org.springframework.data.repository.CrudRepository;
import uk.samgo.firstproject.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
