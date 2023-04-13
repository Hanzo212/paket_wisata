package com.project.paket_wisata.service;

import com.project.paket_wisata.dto.LoginDTO;
import com.project.paket_wisata.model.Pelanggan;
import com.project.paket_wisata.repo.PelangganRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {
	@Autowired
	PelangganRepository pelangganRepository;

	BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(16);

	private static final Logger LOGGER = LoggerFactory.getLogger(LoginService.class);

	public String login(LoginDTO loginDTO) {
		List<Pelanggan> pelanggans = pelangganRepository.findByEmailPelanggan(loginDTO.getEmail());
		LOGGER.info(pelanggans.get(0).toString());
		return null;

	}

	public String register(Pelanggan pelanggan) {
		pelanggan.setPassword(encoder.encode(pelanggan.getPassword()));
		pelangganRepository.save(pelanggan);
		return "success";
	}

}
