package org.saraCode.dao;

import java.util.List;

public interface IFacilityDAO {

	
	public void addNewFacility(String name, String location, String phone, Integer numOfRooms);
	public void removeFacility(Integer facilityId);
	public List<String> getFacilityDetails(Integer facilityId);
	public List<String> listFacilities();
	void updateFacility(Boolean available, Integer facilityId);
	void updateOccupiedRooms(Integer change, Integer ID);
	void setNumberOfRooms(Integer Id, Integer newRoomsNum);
	void setPhone(Integer Id, String newPhone);
	void setName(Integer Id, String newName);
	Integer getNumberOfRooms(Integer SearchID);
	String getLocation(Integer SearchID);
	String getName(Integer SearchID);
	Boolean getIsFacilityAvailablw(Integer facilityId);
	Integer latestFacility();
	void setLocation(Integer Id, String newLocation);
	public Integer getOccupiedRooms(Integer facilityId);
	public String getPhone(Integer facilityId);
}
