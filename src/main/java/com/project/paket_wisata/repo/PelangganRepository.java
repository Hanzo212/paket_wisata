package com.project.paket_wisata.repo;

import com.project.paket_wisata.model.Pelanggan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PelangganRepository extends JpaRepository<Pelanggan, Integer> {
    List<Pelanggan> findByEmailPelanggan(String email);
}
