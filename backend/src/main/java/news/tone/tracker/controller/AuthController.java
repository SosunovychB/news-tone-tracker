package news.tone.tracker.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import news.tone.tracker.dto.CreateUserRequestDto;
import news.tone.tracker.dto.UserDto;
import news.tone.tracker.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    private final UserService userService;

    @PostMapping("/registration")
    public UserDto registerNewUser(@RequestBody @Valid CreateUserRequestDto createUserRequestDto) {
        return userService.registerNewUser(createUserRequestDto);
    }
}
