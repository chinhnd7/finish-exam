package net.luvina.courseapi.service;

import lombok.RequiredArgsConstructor;
import net.luvina.courseapi.dto.UserDto;
import net.luvina.courseapi.dto.UserResponseDto;
import net.luvina.courseapi.entity.User;
import net.luvina.courseapi.error.ErrorCodes;
import net.luvina.courseapi.error.ServiceRuntimeException;
import net.luvina.courseapi.factory.UserFactory;
import net.luvina.courseapi.mapper.UserMapper;
import net.luvina.courseapi.repository.UserRepository;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {

	private final UserRepository userRepository;
	private final UserFactory userFactory;
	private final UserMapper userMapper;

	public User findByEmail(String email) {
		return userRepository.findByEmail(email).orElse(null);
	}

	@Transactional()
	public UserResponseDto createUser(UserDto userDto) throws RuntimeException {
		if (findByEmail(userDto.getEmail()) == null) {
			User user = userFactory.createUser(userDto);
			User createdUser = userRepository.save(user);
			UserResponseDto userResponse = userMapper.convertToUserResponseDto(createdUser);
			return userResponse;
		} else {
			throw new ServiceRuntimeException(HttpStatus.BAD_REQUEST, ErrorCodes.USER_E001,
					"Email has already been taken");
		}
	}

}
