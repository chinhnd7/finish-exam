package net.luvina.courseapi.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import net.luvina.courseapi.dto.CourseReqSearchDto;
import net.luvina.courseapi.dto.CourseResDto;
import net.luvina.courseapi.service.CourseService;

@RestController
@RequestMapping("/api/v1/courses")
@RequiredArgsConstructor
public class CourseController {

	private final CourseService courseService;

	@GetMapping
	@ApiOperation("Get courses")
	@ApiResponses({ @ApiResponse(code = 200, message = "Get courses successfully") })
	public ResponseEntity<List<CourseResDto>> getCourses(@RequestParam(required = false) String keyword,
			String sortBy) {
		CourseReqSearchDto courseDto = new CourseReqSearchDto();
		courseDto.setKeyword(keyword);
		courseDto.setSortBy(sortBy);
		List<CourseResDto> response = courseService.getCourses(courseDto);
		System.out.println("keyword:   " + keyword);
		System.out.println("sortBy:   " + sortBy);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

}
