package com.cts.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "User")
public class User {

	// UserID, Name, Email, Password, Role, ContactNumber
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	private String name;
	private String email;
	private String password;
	private String Role;
	private String contactNumber;
	
	@OneToMany(mappedBy ="user")
	private List<Booking> Booking;
	
	@OneToMany(mappedBy="user")
	private List<Payment> Payment;	
	
	@OneToMany(mappedBy="user")
	private List<Review> Review;
}