package com.project.paket_wisata.controller;

import java.util.List;

import com.project.paket_wisata.service.loginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import com.project.paket_wisata.model.paket;
import com.project.paket_wisata.model.pelanggan;
import com.project.paket_wisata.service.pwService;

@RestController
@RequestMapping("/pw")
@CrossOrigin

public class pwController {
	
	@Autowired
	pwService pwService;

	@Autowired
	loginService loginService;
	
	@GetMapping("/allpaket")
	public @ResponseBody List<paket> findAll() {
		
		return pwService.getAllPaket();
		
	}
	
	//login
	
	//list all paket
	
	///register user
	@PostMapping("/register")
	public ResponseEntity register(
			@RequestBody pelanggan pelanggan
	){
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(16);
		pelanggan.setPassword(encoder.encode(pelanggan.getPassword()));
		String status = loginService.register(pelanggan);
		return ResponseEntity.ok(status);
	}
	
	//booking
	
	//get all transaksi by id user

}
