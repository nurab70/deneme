package com.educationplatform.userservice.service;

import com.educationplatform.userservice.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto userDto);

    UserDto getUserById(Long userId);
    List<UserDto> getAllUsers();

    UserDto updateUser(Long userId, UserDto updateUser);

    void deleteUser(Long userId);
}
