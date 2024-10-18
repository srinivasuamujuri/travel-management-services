package com.tms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tms.common.CommonConstants.City;
import com.tms.dao.CityDao;
import com.tms.model.CityDetails;
import com.tms.model.TMSResponse;
import com.tms.model.TMSResponse.Status;
import com.tms.service.CityService;
import com.tms.utils.DateUtils;
import com.tms.utils.TMSUtils;

@Service
public class CityServiceImpl implements CityService {
	
	@Autowired
	CityDao cityDao;

	@Override
	public TMSResponse saveCityDetails(CityDetails cityDetails) {
		
		TMSResponse response = new TMSResponse();
		
		if(cityDetails.getCityName() == null || cityDetails.getCityName() == "" ) {
			response.setDetails("Invalid request parameters of cityName: " + cityDetails.getCityName());
			//response.setDetails(City.INPUTERROR);
			return response;
		}
		try {
			CityDetails cityNameDBObj = cityDao.findByCityNameIgnoreCase(cityDetails.getCityName());
			if(cityNameDBObj != null) {
				response.setDetails(City.CITYEXIST);
			} else {
				cityDetails.setCreatedOn(DateUtils.getTodayDate());
				cityDetails.setUpdatedOn(DateUtils.getTodayDate());
				cityDetails.setActive(true);
				response.setData(cityDao.save(cityDetails));
				response.setDetails(City.SAVE);
			}
			response.setStatus(Status.OK);
			
		} catch (Exception e) {
			
			response.setDetails(City.ERROR);
			String errorMsg = TMSUtils.getSQLException(e);
			errorMsg = (errorMsg == null) ? e.getLocalizedMessage() : errorMsg;
			response.setErrorMessage(errorMsg);
			response.setStatus(Status.FAILED);
		}
		
		return response;
	}

}
