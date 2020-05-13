package guru.springframework.webapp.repositories;
import guru.springframework.webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthoerRepository extends CrudRepository<Author, Long> {
}
