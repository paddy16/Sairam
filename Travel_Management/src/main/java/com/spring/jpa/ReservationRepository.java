
package com.spring.jpa;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Integer>{

	List<Reservation> findByCustIdOrderByDepartureDateAsc(int custId);
	
	Reservation findByReservationId(int reservationId);
}
