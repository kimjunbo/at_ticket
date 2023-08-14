package com.atticket.reservation.dto.request;

import java.util.List;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterReservationReqDto {

	@NotNull
	private String paymentId;

	@NotNull
	private Long showId;

	@NotNull
	private List<Long> seatIds;
}
