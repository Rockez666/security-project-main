package springsecurity.springprojectnew.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import springsecurity.springprojectnew.command.RegisterRequest;
import springsecurity.springprojectnew.entity.Person;
import springsecurity.springprojectnew.services.PersonService;

@Controller
@RequestMapping("/people")
@RequiredArgsConstructor
public class PeopleController {
    private final PersonService personService;


    @PostMapping("/register")
    ResponseEntity<String> register(@RequestBody RegisterRequest request) {
        personService.registerPerson(request);
        return ResponseEntity.ok("Registered");
    }
}
