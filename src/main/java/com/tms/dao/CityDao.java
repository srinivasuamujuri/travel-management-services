package com.tms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tms.model.CityDetails;

import jakarta.transaction.Transactional;

@Transactional
public interface CityDao extends JpaRepository<CityDetails, Integer> {

	CityDetails findByCityNameIgnoreCase(String cityName);

}
