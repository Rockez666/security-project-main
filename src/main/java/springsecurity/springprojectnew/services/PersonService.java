package springsecurity.springprojectnew.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import springsecurity.springprojectnew.Repository.PersonRepository;
import springsecurity.springprojectnew.command.RegisterRequest;
import springsecurity.springprojectnew.entity.Person;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final PersonRepository personRepository;


    public void registerPerson(RegisterRequest request) {
        String username = request.getUsername();
        String password = request.getPassword();

        Person person = new Person(username, password);
        personRepository.save(person);

    }

}
