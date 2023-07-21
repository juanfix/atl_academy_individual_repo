package atl.academy.atl_academy_individual_repo.validators;

import atl.academy.atl_academy_individual_repo.newsletter.validators.EmailValidator;
import org.junit.Test;
import static org.junit.Assert.*;

public class EmailValidatorTest {

    @Test
    public void emailMustHaveAtSign() {
        EmailValidator validator = new EmailValidator();
        boolean result = validator.isValid("sdfkjakjfkas");
        assertFalse(result);
    }

    @Test
    public void emailMustHaveOnlyOneAtSign() {
        EmailValidator validator = new EmailValidator();
        boolean result = validator.isValid("sdfkj@akjf@kas");
        assertFalse(result);
    }


    @Test
    public void emailMustHaveOneDot() {
        EmailValidator validator = new EmailValidator();
        boolean result = validator.isValid("hola@mail");
        assertFalse(result);
    }

}
