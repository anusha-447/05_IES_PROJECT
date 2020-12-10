package com.ies.kentucky.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ies.kentucky.admin.entity.CitizenInformation;
import com.ies.kentucky.admin.repository.CitizenRepository;

@Service
public class CitizenServiceImpl implements ICitizenService {

	@Autowired
	private CitizenRepository crepo;
	@Override
	public boolean registerCitizen(CitizenInformation citizenInfo) {
	
			CitizenInformation status=crepo.save(citizenInfo);
			return citizenInfo.getCitizen_id()!=null;
		}
	}


