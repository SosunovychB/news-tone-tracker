package news.tone.tracker.dto.login;

import jakarta.validation.constraints.Email;
import lombok.Data;
import news.tone.tracker.validation.password.Password;

@Data
public class UserLoginRequestDto {
    @Email
    private String email;
    @Password
    private String password;
}
