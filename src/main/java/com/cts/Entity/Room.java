
package com.cts.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Room")
public class Room {

	//RoomID, HotelID, Type, Price, Availability, Features
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roomId;
	@ManyToOne
	@JoinColumn(name = "hotel_Id")
	private int hotelId;
	private String type;
	private int price;
	private String availability;
	private String features;
	
	@OneToMany(mappedBy = "bookingid")
	private List<Booking> Bookings;
	
}
