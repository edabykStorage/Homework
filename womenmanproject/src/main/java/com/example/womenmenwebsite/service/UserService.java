package com.example.womenmenwebsite.service;

import com.example.womenmenwebsite.dto.request.UserCreateRequestDto;
import com.example.womenmenwebsite.mapper.UserMapper;
import com.example.womenmenwebsite.repository.UserRepository;
import com.example.womenmenwebsite.repository.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User save(User user) {
        return userRepository.save(user);
    }

    public User update(User user) {
        return userRepository.save(user);
    }

    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public Boolean isExistUser(String username, String password) {
        return userRepository.isExistUser(username, password);
    }

    public Optional<User> findByUsernameAndPassword(String username, String password) {
        return userRepository.findOptionalByUsernameAndPassword(username, password);
    }

    public User save(UserCreateRequestDto dto) {
        User user = UserMapper.INSTANCE.toUser(dto);
        userRepository.save(user);
        return user;
    }
}
