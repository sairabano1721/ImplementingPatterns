package org.saraCode.dao;

import org.saraCode.model.FacilityMaintainence;
import org.saraCode.model.RequestType;

public interface IFacilityMaintenanceDAO {

	void addFacilityMaintenance(RequestType requestType, Integer facilityId, Integer roomNum, Boolean status);

	FacilityMaintainence getFacilityMaintenance(Integer facilityId, Integer roomNum);

	void removeFacilityMaintenance(Integer facilityId, Integer roomNum);

	void updateFacilityMaintenance(Integer facilityId, Integer roomNum, RequestType requestType);

}
