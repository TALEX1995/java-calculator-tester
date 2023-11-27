package org.java.ticket;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TicketTest {
	
	Ticket ticket = null;
	
	@BeforeEach
	public void init() {
		ticket = null;
	}
	
	@Test
	public void negativeTicketKm() {
		int km = -5;
		int age = 24;
		
		assertThrows(Exception.class, () -> ticket = new Ticket(km, age), "Eccezione attesa");	
	}
	
	@Test
	public void negativeTicketAge() {
		int km = 20;
		int age = -4;
		
		assertThrows(Exception.class, () -> ticket = new Ticket(km, age), "Eccezione attesa");	
	}
	
	@Test
	public void fullPriceTicket() throws Exception {
		int km = 20;
		int age = 25;
		
		float expectedResult = km * 0.21f;
		
		ticket = new Ticket(km, age);
		float result = ticket.ticketPrice();
		
		assertEquals(expectedResult, result, "I prezzi dei due bigliatti non corrispondono");
	}
	
	@Test
	public void underPriceTicket() throws Exception {
		int km = 20;
		int age = 16;
		float fullTicketPrice = km * 0.21f;
		float expectedResult = fullTicketPrice - (fullTicketPrice * 0.2f);
		
		ticket = new Ticket(km, age);
		float result = ticket.ticketPrice();
		
		assertEquals(expectedResult, result, "I prezzi dei due bigliatti non corrispondono");
	}
	
	@Test
	public void overPriceTicket() throws Exception {
		int km = 20;
		int age = 70;
		float fullTicketPrice = km * 0.21f;
		float expectedResult = fullTicketPrice - (fullTicketPrice * 0.4f);
		
		ticket = new Ticket(km, age);
		float result = ticket.ticketPrice();
		
		assertEquals(expectedResult, result, "I prezzi dei due bigliatti non corrispondono");
	}
	
}
