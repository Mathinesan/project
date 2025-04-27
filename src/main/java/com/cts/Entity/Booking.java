
package com.cts.Entity;

import java.sql.Date;
import java.util.List;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name="Booking")
public class Booking {
	
	//BookingID, UserID, RoomID, CheckInDate, CheckOutDate, Status, PaymentID)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bookingId;
	@ManyToOne
	@JoinColumn(name="userid")
	private User userId;
	private int roomId;
	private Date checkInDate;
	private Date checkOutDate;
	private String status;
	private int paymentId;
	
	@OneToOne()
	@JoinColumn(name="paymentid")
	private List<Payment> Payment;
	

}
