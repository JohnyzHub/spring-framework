package com.myspring.core.springcore.lc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author johnybasha
 *
 */
@Configuration
public class CustomConfig {

	public CustomConfig() {
		super();
	}

	@Bean
	public TicketReservation getReservation() {
		TicketReservation reservation = new TicketReservation();
		reservation.setNumber(2);
		reservation.setName("Basha");
		return reservation;
	}

}
