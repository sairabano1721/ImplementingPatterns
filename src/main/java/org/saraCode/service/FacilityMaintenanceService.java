package org.saraCode.service;

import org.saraCode.dao.FacilityMaintenanceDAO;
import org.saraCode.dao.IFacilityMaintenanceDAO;
import org.saraCode.model.FacilityMaintainence;
import org.saraCode.model.RequestType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacilityMaintenanceService {

	@Autowired
	private IFacilityMaintenanceDAO facilityMaintenanceDAO;

	public void addFacilityMaintenance(RequestType requestType, Integer facilityId, Integer roomNum, Boolean status) {

		getDAOObject(facilityMaintenanceDAO);

		facilityMaintenanceDAO.addFacilityMaintenance(requestType, facilityId, roomNum, status);
	}

	public FacilityMaintainence getFacilityMaintenance(Integer facilityId, Integer roomNum) {
		getDAOObject(facilityMaintenanceDAO);
		return facilityMaintenanceDAO.getFacilityMaintenance(facilityId, roomNum);
	}

	public void removeFacilityMaintenance(Integer facilityId, Integer roomNum) {
		getDAOObject(facilityMaintenanceDAO);
		facilityMaintenanceDAO.removeFacilityMaintenance(facilityId, roomNum);
	}

	public void updateFacilityMaintenance(Integer facilityId, Integer roomNum, RequestType requestType) {
		getDAOObject(facilityMaintenanceDAO);
		facilityMaintenanceDAO.updateFacilityMaintenance(facilityId, roomNum, requestType);
		;
	}

	private void getDAOObject(IFacilityMaintenanceDAO facilityMaintenanceDAO) {
		if (facilityMaintenanceDAO == null) {
			facilityMaintenanceDAO = new FacilityMaintenanceDAO();
		}
	}

}
