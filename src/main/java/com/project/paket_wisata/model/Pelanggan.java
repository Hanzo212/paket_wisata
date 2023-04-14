package com.project.paket_wisata.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Pelanggan {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_pelanggan")
	private int id_pelanggan;
	@Column(name = "password")
	private String password;
	@Column(name="nama_pelanggan")
	private String namaPelanggan;
	@Column(name="email_pelanggan")
	private String emailPelanggan;
	@Column(name="no_rek")
	private int no_rek;

}
