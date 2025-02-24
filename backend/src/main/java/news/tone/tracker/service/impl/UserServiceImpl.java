package news.tone.tracker.service.impl;

import java.util.List;
import lombok.RequiredArgsConstructor;
import news.tone.tracker.dto.CreateUserRequestDto;
import news.tone.tracker.dto.UserDto;
import news.tone.tracker.exceptiion.EntityNotFoundException;
import news.tone.tracker.mapper.UserMapper;
import news.tone.tracker.model.User;
import news.tone.tracker.repository.RoleRepository;
import news.tone.tracker.repository.UserRepository;
import news.tone.tracker.service.UserService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    @Override
    public UserDto registerNewUser(CreateUserRequestDto createUserRequestDto) {
        User user = userMapper.createUserRequestToUser(createUserRequestDto);
        User savedUser = userRepository.save(user);
        return userMapper.userToDto(savedUser);
    }

    @Override
    public List<UserDto> getAllUsers() {
        return userRepository.findAll().stream()
                .map(userMapper::userToDto)
                .toList();
    }

    @Override
    public UserDto getUserById(long id) {
        User user = userRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("User with id " + id + " was not found"));
        return userMapper.userToDto(user);
    }
}
