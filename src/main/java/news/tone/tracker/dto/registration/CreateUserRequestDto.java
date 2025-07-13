package news.tone.tracker.dto.registration;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import news.tone.tracker.validation.password.Password;
import news.tone.tracker.validation.passwordmatcher.PasswordMatcher;

@Data
@PasswordMatcher
public class CreateUserRequestDto {
    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;
    @Email
    private String email;
    @Password
    private String password;
    @Password
    private String repeatPassword;
}
