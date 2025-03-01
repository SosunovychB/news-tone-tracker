package news.tone.tracker.validation.passwordmatcher;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import news.tone.tracker.dto.registration.CreateUserRequestDto;

public class PasswordMatcherValidator
        implements ConstraintValidator<PasswordMatcher, CreateUserRequestDto> {
    @Override
    public boolean isValid(CreateUserRequestDto requestDto, ConstraintValidatorContext context) {
        return requestDto != null
                && requestDto.getPassword() != null
                && requestDto.getRepeatPassword() != null
                && requestDto.getPassword().equals(requestDto.getRepeatPassword());
    }
}
