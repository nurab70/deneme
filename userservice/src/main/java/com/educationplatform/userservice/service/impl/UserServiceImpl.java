package com.educationplatform.userservice.service.impl;

import com.educationplatform.userservice.dto.UserDto;
import com.educationplatform.userservice.entity.User;
import com.educationplatform.userservice.exception.ResourceNotFoundException;
import com.educationplatform.userservice.mapper.UserMapper;
import com.educationplatform.userservice.repository.UserRepository;
import com.educationplatform.userservice.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    @Override
    public UserDto createUser(UserDto userDto){

        User user= UserMapper.mapToUser(userDto);
        User savedUser = userRepository.save(user);

        return UserMapper.mapToUserDto(savedUser);
    }

    @Override
    public UserDto getUserById(Long userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User is not exist with given id:" + userId));

        return UserMapper.mapToUserDto(user);
    }

    @Override
    public List<UserDto> getAllUsers() {
        List<User> users = userRepository.findAll();

        return users.stream().map((user) -> UserMapper.mapToUserDto(user))
                .collect(Collectors.toList());
    }

    @Override
    public UserDto updateUser(Long userId, UserDto updateUser) {
        User user = userRepository.findById(userId).orElseThrow(
                () -> new ResourceNotFoundException("User is not exists by the given id:" + userId)
        );

        user.setName(updateUser.getName());
        user.setSurname(updateUser.getSurname());
        user.setUserType(updateUser.getUserType());
        user.setEmail(updateUser.getEmail());
        user.setPassword(updateUser.getPassword());
        user.setPhone(updateUser.getPhone());
        User updatedUserObj = userRepository.save(user);

        return UserMapper.mapToUserDto(updatedUserObj);
    }

    @Override
    public void deleteUser(Long userId) {
        User user = userRepository.findById(userId).orElseThrow(
                () -> new ResourceNotFoundException("User is not exists by the given id:" + userId)
        );
        userRepository.deleteById(userId);
    }

}
