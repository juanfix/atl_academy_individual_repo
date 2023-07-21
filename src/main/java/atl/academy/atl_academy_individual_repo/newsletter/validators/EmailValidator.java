package atl.academy.atl_academy_individual_repo.newsletter.validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {


    public boolean isValid(String email){
        String regex = "^(?=.*@)(?=.*\\..+[^.])[^@]*@[^@]+\\.[^@]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
