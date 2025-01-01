package springsecurity.springprojectnew.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springsecurity.springprojectnew.entity.Person;

import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person, Long> {
    Optional<Person> findByUsername(String username);
}
