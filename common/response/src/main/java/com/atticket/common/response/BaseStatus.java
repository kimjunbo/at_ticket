package com.atticket.common.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum BaseStatus {

	/**
	 * 200 - Success (성공)
	 * */
	SUCCESS(200, "요청에 성공하셨습니다."),
	NO_RESULT(200, "조회된 데이터가 없습니다."),

	/**
	 * 400 - Bad Request(요청값 에러 관련)
	 * */
	TEST_ERROR(400, "테스트 에러메세지입니다."),
	NO_KEYWORD(400, "키워드를 입력해주세요."),

	/**
	 * 401 - Unauthorized (인증 에러 관련)
	 * */
	NO_TOKEN(401, "사용자 토큰이 존재하지 않습니다."),
	INVALID_TOKEN(401, "사용자 토큰이 유효하지 않습니다."),

	/**
	 * 403 - Forbidden (권한 에러 관련)
	 * */
	REQUIRED_ADMIN_AUTH(403, "관리자 권한이 필요합니다."),
	INVALID_AUTH(403, "접근 권한이 없습니다."),

	/**
	 * 404 - Not Found (요청한 리소스 없음)
	 * */
	INVALID_CATEGORY(404, "유효하지 않은 카테고리입니다."),
	INVALID_SUB_CATEGORY(404, "유효하지 않은 서브카테고리입니다."),
	SUB_CATEGORY_DOES_NOT_IN_CATEGORY(404, "서브 카테고리가 카테고리에 속하지 않습니다."),
	INVALID_REGION(404, "유효하지 않은 지역입니다."),
	INVALID_SORT_OPT(404, "유효하지 않은 정렬옵션입니다."),

	/**
	 * 500 - Server Error (서버 에러)
	 * */
	UNEXPECTED_ERROR(500, "예상치 못한 에러가 발생했습니다.");

	private final int code;

	private final String message;
}
