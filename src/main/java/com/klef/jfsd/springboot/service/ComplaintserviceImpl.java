package com.klef.jfsd.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Complaint;
import com.klef.jfsd.springboot.repository.ComplaintRepository;



@Service
public class ComplaintserviceImpl implements ComplaintService{

	@Autowired
	private ComplaintRepository complaintRepository;
	
	@Override
	public Complaint addcmp(Complaint complaint) {
		return complaintRepository.save(complaint);
	}

	
}
