package com.educationplatform.userservice.mapper;

import com.educationplatform.userservice.dto.UserDto;
import com.educationplatform.userservice.entity.User;

public class UserMapper {
    public  static UserDto mapToUserDto(User user){
        return new UserDto(
                user.getId(),
                user.getName(),
                user.getSurname(),
                user.getUserType(),
                user.getEmail(),
                user.getPassword(),
                user.getPhone()
        );
    }

    public static User mapToUser(UserDto userDto){
        return new User(
                userDto.getId(),
                userDto.getName(),
                userDto.getSurname(),
                userDto.getUserType(),
                userDto.getEmail(),
                userDto.getPassword(),
                userDto.getPhone()
        );
    }

}