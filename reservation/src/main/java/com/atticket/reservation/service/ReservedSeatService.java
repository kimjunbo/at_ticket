package com.atticket.reservation.service;

import com.atticket.reservation.domain.PreReservedSeat;
import com.atticket.reservation.domain.ReservedSeat;
import com.atticket.reservation.repository.PreReservedSeatRepository;
import com.atticket.reservation.repository.ReservedSeatRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ReservedSeatService {
	private final ReservedSeatRepository reservedSeatRepository;

	private final PreReservedSeatRepository preReservedSeatRepository;

	/**
	 * 공연의 예매된 좌석 리스트 조회
	 *
	 * @param showId
	 * @return
	 */
	public List<ReservedSeat> getReservedSeatsByShowId(Long showId) {
		return reservedSeatRepository.findByShowId(showId);
	}

	public List<PreReservedSeat> getPreReservedSeatsByShowId(Long showId) {
		return preReservedSeatRepository.findByShowId(showId);
	}

	/**
	 * 공연 좌석 예약여부 조회
	 */
	public boolean existsReservedSeat(Long showId, List<Long> seatId) {
		return reservedSeatRepository.existsByShowIdAndSeatIdIn(showId, seatId);
	}

	/**
	 * 공연 좌석 예약하기
	 */
	public void registerReservedSeat(Long showId, List<Long> seatIds) {
		List<ReservedSeat> reservedSeats = seatIds.stream().map(seatId ->
			ReservedSeat.builder()
				.showId(showId)
				.seatId(seatId)
				.build()
		).collect(Collectors.toList());
		reservedSeatRepository.saveAll(reservedSeats);
	}
}
