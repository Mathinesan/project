package com.cts.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Hotel")
public class Hotel {
	
	//HotelID, Name, Location, ManagerID, Amenities, Rating
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long hotelId;
	private String name;
	private String location;
	private int managerId;
	private String amenities;
	private int rating;
	
	@OneToMany(mappedBy="hotel")
	private List<Room> Room;
	
	@OneToMany(mappedBy="hotel")
	private List<Review> Review;
	

}