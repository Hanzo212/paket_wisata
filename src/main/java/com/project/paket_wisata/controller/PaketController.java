package com.project.paket_wisata.controller;

import java.util.List;

import com.project.paket_wisata.model.Paket;
import com.project.paket_wisata.model.Pelanggan;
import com.project.paket_wisata.service.PwService;
import com.project.paket_wisata.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/pw")
@CrossOrigin

public class PaketController {

	@Autowired
	PwService pwService;

	@Autowired
	LoginService loginService;

	// list all paket
	@GetMapping("/allpaket")
	public @ResponseBody List<Paket> findAll() {

		return pwService.getAllPaket();

	}

	// login

	/// register user
	@PostMapping("/register")
	public ResponseEntity register(
			@RequestBody Pelanggan pelanggan) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(16);
		pelanggan.setPassword(encoder.encode(pelanggan.getPassword()));
		String status = loginService.register(pelanggan);
		return ResponseEntity.ok(status);
	}

	// booking

	// get all transaksi by id user

}
