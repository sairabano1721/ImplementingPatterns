package org.saraCode.service;

import org.saraCode.dao.IInspectionDAO;
import org.saraCode.dao.InspectionDAO;
import org.saraCode.model.Inspection;
import org.saraCode.model.RequestType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InspectionService {

	@Autowired
	private IInspectionDAO inspectionDAO;

	public void addInspection(Integer roomNum, Integer facilityId, Boolean status, RequestType requestType) {
		getDAOObject(inspectionDAO);
		inspectionDAO.addInspection(roomNum, facilityId, status, requestType);
	}

	public Inspection getInspection(Integer facilityId, Integer roomNum) {
		getDAOObject(inspectionDAO);
		return inspectionDAO.getInspection(facilityId, roomNum);

	}

	public void removeInspection(Integer facilityId, Integer roomNum) {
		getDAOObject(inspectionDAO);
		inspectionDAO.removeInspection(facilityId, roomNum);
	}

	public void updateInspection(Integer facilityId, Integer roomNum, String requestType) {
		getDAOObject(inspectionDAO);
		inspectionDAO.updateInspection(facilityId, roomNum, requestType);
	}

	private void getDAOObject(IInspectionDAO inspectionDAO) {
		if (inspectionDAO == null) {
			inspectionDAO = new InspectionDAO();
		}
	}

}
