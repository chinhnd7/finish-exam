package net.luvina.courseapi.factory;

import lombok.RequiredArgsConstructor;
import net.luvina.courseapi.dto.UserDto;
import net.luvina.courseapi.entity.User;
import net.luvina.courseapi.enums.UserType;
import net.luvina.courseapi.mapper.UserMapper;

import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserFactory {

    private final UserMapper userMapper;

    public User createUser(UserDto userDto) {
        User user = null;
        if (UserType.STUDENT.toString().equals(userDto.getMode())) {
            user = userMapper.convertToStudent(userDto);
        } else if (UserType.TEACHER.toString().equals(userDto.getMode())) {
            user = userMapper.convertToTeacher(userDto);
        }
        return user;
    }

}
