package com.tms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
//@AllArgsConstructor
//@NoArgsConstructor
@ToString
@Entity
@Table (name = "CityDetails")
public class CityDetails extends BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cityId;
	
//	@NotNull(message = "city name should not be null")
//	@NotBlank(message = "city name should not be Blank")
//	@NotEmpty(message = "city name should not be Empty")
	private String cityName;
	

	
	
	
	
	

}
