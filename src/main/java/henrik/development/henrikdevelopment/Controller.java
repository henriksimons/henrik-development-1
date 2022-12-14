package henrik.development.henrikdevelopment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private PersonService personService;

    @GetMapping("/persons")
    public List<Person> getPersons(){
        return personService.findAll();
    }

}
