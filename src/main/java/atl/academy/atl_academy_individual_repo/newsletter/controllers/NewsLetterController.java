package atl.academy.atl_academy_individual_repo.newsletter.controllers;

import atl.academy.atl_academy_individual_repo.newsletter.entities.Prospect;
import atl.academy.atl_academy_individual_repo.newsletter.repository.EmailRepository;
import atl.academy.atl_academy_individual_repo.newsletter.validators.EmailValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NewsLetterController {

    @Autowired
    EmailRepository emailRepository;

    @GetMapping("api/newsletter")
    public List<String> getProspect() {
        return emailRepository.getEmail();
    }

    @PostMapping("api/newsletter")
    public String register(@RequestBody Prospect prospect){
        EmailValidator emailValidator = new EmailValidator();
        if(!emailValidator.isValid(prospect.getEmail())){
            return "Invalid email";
        }

        emailRepository.saveEmail(prospect.getEmail());

        return "Created: " + prospect.getEmail();
    }

    @DeleteMapping("api/newsletter/{idEmail}")
    public String delete(@PathVariable Long idEmail){

        emailRepository.deleteEmail(idEmail);

        return "Deleted";
    }

}
