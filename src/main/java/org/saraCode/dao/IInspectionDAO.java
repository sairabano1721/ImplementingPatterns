package org.saraCode.dao;

import org.saraCode.model.Inspection;
import org.saraCode.model.RequestType;

public interface IInspectionDAO {

	void updateInspection(Integer facilityId, Integer roomNum, String requestType);

	void addInspection(Integer roomNum, Integer facilityId, Boolean status, RequestType requestType);

	void removeInspection(Integer facilityId, Integer roomNum);

	Inspection getInspection(Integer facilityId, Integer roomNum);

}
