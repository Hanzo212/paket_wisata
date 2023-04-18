package com.project.paket_wisata.controller;

import java.util.List;

import com.project.paket_wisata.dto.LoginDTO;
import com.project.paket_wisata.model.Paket;
import com.project.paket_wisata.model.Pelanggan;
import com.project.paket_wisata.model.PelangganDetail;
import com.project.paket_wisata.service.PwService;
import com.project.paket_wisata.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/pw")
@CrossOrigin

public class PaketController {

	@Autowired
	PwService pwService;

	@Autowired
	LoginService loginService;

	private static final Logger LOG = LoggerFactory.getLogger("CEK LOGIN");

	// list all paket
	@GetMapping("/allpaket")
	public @ResponseBody List<Paket> findAll() {

		return pwService.getAllPaket();

	}

	// login
	@PostMapping("/auth/login")
	public ResponseEntity<String> login(
			@RequestBody LoginDTO loginDTO
			){
		String status = loginService.login(loginDTO);
		return ResponseEntity.ok(status);
	}

	/// register user
	@PostMapping("/auth/register")
	public ResponseEntity<String> register(
			@RequestBody Pelanggan pelanggan) {
		String status = loginService.register(pelanggan);
		return ResponseEntity.ok(status);
	}

	@PostMapping("/auth/cek")
	public ResponseEntity<Boolean> cek(@AuthenticationPrincipal PelangganDetail pelanggan){
		if (pelanggan != null) {
			LOG.info(pelanggan.toString());
			LOG.info(pelanggan.getUsername());
			return ResponseEntity.ok(true);
		}
		return ResponseEntity.ok(false);
	}

	// booking

	// get all transaksi by id user

}
