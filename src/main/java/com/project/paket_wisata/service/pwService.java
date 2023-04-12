package com.project.paket_wisata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.paket_wisata.model.paket;
import com.project.paket_wisata.repo.pwRepo;

@Service
public class pwService {
	
	@Autowired
	pwRepo pwRepo;
	
	public List<paket> getAllPaket(){
		List<paket> x = pwRepo.findAll();
		
		return x;
		
	}
	
	

}
