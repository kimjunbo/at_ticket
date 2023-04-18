package com.atticket.show.dto.response;

import java.util.List;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class GetRemainSeatsCntResDto {
	//회차별 공연 잔여 좌석수 조회 ResponseDto

	private final List<RemainSeat> remainSeatList;

	@Getter
	@Builder
	//잔여좌석
	public static class RemainSeat {

		//공연 Id
		private final String showId;

		//좌석 등급
		private final String seatGrade;

		//남은 좌석 수
		private final int remainSeatCnt;

	}

}