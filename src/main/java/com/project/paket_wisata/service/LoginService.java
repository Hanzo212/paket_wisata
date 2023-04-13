package com.project.paket_wisata.service;

import com.project.paket_wisata.model.Pelanggan;
import com.project.paket_wisata.repo.PelangganRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
	@Autowired
	PelangganRepository pelangganRepository;

	public String login() {
		return null;

	}

	public String register(Pelanggan pelanggan) {
		pelangganRepository.save(pelanggan);
		return "success";
	}

}
