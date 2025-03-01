package news.tone.tracker.controller;

import java.util.List;
import lombok.RequiredArgsConstructor;
import news.tone.tracker.dto.UserDto;
import news.tone.tracker.model.User;
import news.tone.tracker.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/my-profile")
    @PreAuthorize("hasRole('USER')")
    @ResponseStatus(HttpStatus.OK)
    public UserDto getMyProfile(Authentication authentication) {
        User user = (User) authentication.getPrincipal();
        return userService.getUserByEmail(user.getEmail());
    }

    @GetMapping
    @PreAuthorize("hasRole('ADMIN')")
    @ResponseStatus(HttpStatus.OK)
    public List<UserDto> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    @ResponseStatus(HttpStatus.OK)
    public UserDto getUserById(@PathVariable long id) {
        return userService.getUserById(id);
    }
}
