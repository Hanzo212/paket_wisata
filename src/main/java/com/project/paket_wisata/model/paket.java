package com.project.paket_wisata.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class paket {
	
	@Id
	@Column(name = "id_paket")
	private int id_paket;
	@Column (name="nama_paket")
	private String nama_paket;
	@Column(name="harga_paket")
	private Double harga_paket;
}
