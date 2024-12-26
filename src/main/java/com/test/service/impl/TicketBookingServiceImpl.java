package com.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.model.TicketBooking;
import com.test.repository.TicketBookingRepository;
import com.test.service.TicketBookingService;

@Service
public class TicketBookingServiceImpl implements TicketBookingService{

	@Autowired
	private TicketBookingRepository ticketBookingRepository;
	
	@Override
	public TicketBooking saveTicketBooking(TicketBooking ticketBooking) {
		TicketBooking tbook = ticketBookingRepository.save(ticketBooking);
		return tbook;
	}

}
