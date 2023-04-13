package com.project.paket_wisata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.paket_wisata.model.Paket;
import com.project.paket_wisata.repo.PwRepoPaket;

@Service
public class PwService {
	
	@Autowired
	PwRepoPaket pwRepo;
	
	public List<Paket> getAllPaket(){
		List<Paket> x = pwRepo.findAll();
		
		return x;
		
	}
	
	

}
