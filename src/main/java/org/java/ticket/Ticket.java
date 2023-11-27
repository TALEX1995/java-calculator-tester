package org.java.ticket;

public class Ticket {
	private int km;
	private int age;
	
	public Ticket(int km, int age) throws Exception{
		setKm(km);
		setAge(age);
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) throws Exception {
		if(km <= 0){
			throw new Exception("Errore: I km non possono essere inferiori a 1");
		}
		
		this.km = km;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception {
		if(age <= 0){
			throw new Exception("Errore: L'età non può essere inferiore a 1");
		}
		this.age = age;
	}
	
	public float ticketPrice() {
		float priceTicket = km * 0.21f;
		
		if(age < 18) {
			float discount = priceTicket * 0.2f;
		    priceTicket -= discount;
		}
		
		if(age > 65) {
			float discount = priceTicket * 0.4f;
		    priceTicket -= discount;
		}
		
		return priceTicket;
	}
	
}
