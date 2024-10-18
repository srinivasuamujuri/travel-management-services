package com.tms.common;

public interface CommonConstants {
	
	public interface ResponseStatus {
		String SUCCESS = "Success";
		String FAIL = "Fail";
	}
	
	public interface Token {
		String INVALIDTOKEN = "Token is Invalid";
	}
	
	public interface City {
		String SAVE = "City name saved successfully";
		String UPDATE = "City name Updated Successfully";
		String ACTIVATEUSER = "City Activated successfully";
		String MEMBER = "Member";
		String ERROR = "Error while saving the City details";
		String DELETED = "Deleted City Details sucessfully";
		String UNABLETODELETE = "Oops, Unable to Delete City";
		String CITYEXIST = "City name existing already";
		String CITYNOTEXIST = "CIty name not existing";
		String LISTNOTFOUND = "City List Not Found";
		String LISTFOUND = "City List Found";
		String INPUTERROR = "Invalid request parameters";
	}

}
