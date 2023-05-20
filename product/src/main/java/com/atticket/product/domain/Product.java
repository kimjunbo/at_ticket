package com.atticket.product.domain;

import java.time.LocalDate;
import java.time.LocalTime;

import com.atticket.product.type.AgeLimit;
import com.atticket.product.type.Category;
import com.atticket.product.type.SubCategory;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class Product {

	//상품 id
	private Long id;

	//이름
	private String name;

	//설명
	private String explain;

	//도메인 카테고리
	private Category category;

	//도메인별 세부 장르
	private SubCategory subCategory;

	//러닝 타임
	private LocalTime runningTime;

	//인터 미션
	private LocalTime interMission;

	//상연 시작 일자
	private LocalDate startDate;

	//상연 종료 일자
	private LocalDate endDate;

	//이미지
	private String image;

	//나이 제한
	private AgeLimit ageLimit;

	//장소 Id
	private Place place;

	public void setId(Long id) {
		this.id = id;
	}
}
