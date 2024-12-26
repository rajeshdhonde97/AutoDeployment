package com.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.model.TicketBooking;

@Repository
public interface TicketBookingRepository extends JpaRepository<TicketBooking, Integer>{

}
