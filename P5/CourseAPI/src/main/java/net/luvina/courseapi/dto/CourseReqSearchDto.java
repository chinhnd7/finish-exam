package net.luvina.courseapi.dto;

import lombok.Data;

@Data
public class CourseReqSearchDto {

	private String keyword;
	private String sortBy;
}
