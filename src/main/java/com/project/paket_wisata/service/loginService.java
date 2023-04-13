package com.project.paket_wisata.service;

import com.project.paket_wisata.repo.PelangganRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.paket_wisata.model.pelanggan;

@Service
public class loginService {
	@Autowired
	PelangganRepository pelangganRepository;
	public String login() {
		return null;
		
	}
	
	public String register(pelanggan pelanggan) {
		pelangganRepository.save(pelanggan);
		return "success";
	}

}
