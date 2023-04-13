package com.project.paket_wisata.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.paket_wisata.model.paket;

public interface pwRepoPaket extends JpaRepository<paket, String>{
	
	@Query(value="SELECT nama_paket, harga_paket from paket order by nama_paket", nativeQuery=true)
	List<paket> findAllPaket();

}
