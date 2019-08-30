package com.hcl.parking.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class ParkingAllocation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer parkingAllocationId;
	private Integer parkingId;
	private Integer userId;
	private LocalDateTime availableDate;
	private LocalDateTime bookedDate;

}