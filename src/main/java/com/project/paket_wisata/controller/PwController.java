package com.project.paket_wisata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.paket_wisata.model.Paket;
import com.project.paket_wisata.service.PwService;

@RestController
@RequestMapping("/pw")
public class PwController {
	
	@Autowired
	PwService pwService;
	
	//list all paket
	@GetMapping("/allpaket")
	public @ResponseBody List<Paket> findAll() {
		
		return pwService.getAllPaket();
		
	}
	
	//login
	
	///register user
	
	//booking
	
	//get all transaksi by id user

}
