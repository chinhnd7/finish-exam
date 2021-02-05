package net.luvina.courseapi.mapper;

import org.springframework.stereotype.Component;

import net.luvina.courseapi.dto.UserDto;
import net.luvina.courseapi.dto.UserResponseDto;
import net.luvina.courseapi.entity.Student;
import net.luvina.courseapi.entity.Teacher;
import net.luvina.courseapi.entity.User;

@Component
public class UserMapper {

    public User convertToTeacher(UserDto userDto){
        Teacher teacher = new Teacher();
        teacher.setEmail(userDto.getEmail());
        teacher.setName(userDto.getName());
        teacher.setPassword(userDto.getPassword());
        teacher.setExperiences(userDto.getTeacher().getExperiences());
        teacher.setPhone(userDto.getTeacher().getPhone());

        return teacher;
    }

    public User convertToStudent(UserDto userDto){
        Student student = new Student();
        student.setEmail(userDto.getEmail());
        student.setName(userDto.getName());
        student.setPassword(userDto.getPassword());
        student.setYear(userDto.getStudent().getYear());

        return student;
    }

	public UserResponseDto convertToUserResponseDto(User createdUser) {
		UserResponseDto responseDto = new UserResponseDto();
		responseDto.setEmail(createdUser.getEmail());
		responseDto.setName(createdUser.getName());
		return responseDto;
	}
}
