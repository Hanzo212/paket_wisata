package com.project.paket_wisata.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Pelanggan {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_pelanggan")
	private int id_pelanggan;
	@Column(name = "password")
	private String password;
	@Column(name="nama_pelanggan")
	private String nama_pelanggan;
	@Column(name="email_pelanggan")
	private String email_pelanggan;
	@Column(name="no_rek")
	private int no_rek;

}
