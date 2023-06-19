package atl.academy.atl_academy_individual_repo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PasswordController {
    @GetMapping("/generatePassword")
    public static String generatePassword () {
        String secretWord = "SeCrE_Vlas;";
        return secretWord += (int)(Math.random()*1000000+1);
    }

    @GetMapping("/hello")
    public static String saludar () {
        return "Hola como estas";
    }
}
