package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.model.TicketBooking;
import com.test.service.TicketBookingService;

@RestController
public class TicketBookingController {

	@Autowired
	private TicketBookingService ticketBookingService;
	
	@PostMapping("/saveTicket")
	public TicketBooking saveTicketBooking(@RequestBody TicketBooking ticketBooking) {
		TicketBooking tcbook = ticketBookingService.saveTicketBooking(ticketBooking);
	    return tcbook;
	}
}
