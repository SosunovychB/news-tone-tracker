package news.tone.tracker.validation.password;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;

public class PasswordValidator implements ConstraintValidator<Password, String> {
    private static final String PASSWORD_PATTERN = "^(?=.*[a-z])(?=.*[A-Z])"
            + "(?=.*\\d)(?=.*[@#$%^&+=]).{8,}$";

    @Override
    public boolean isValid(String password, ConstraintValidatorContext context) {
        return Pattern.compile(PASSWORD_PATTERN).matcher(password).matches();
    }
}
