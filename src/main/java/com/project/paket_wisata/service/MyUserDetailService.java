package com.project.paket_wisata.service;

import com.project.paket_wisata.model.Pelanggan;
import com.project.paket_wisata.model.PelangganDetail;
import com.project.paket_wisata.repo.PelangganRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    private PelangganRepository pelangganRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Pelanggan pelanggan = pelangganRepository.findByEmailPelanggan(username);
        if (pelanggan != null) {
            return new PelangganDetail(pelanggan);
        }
        throw new UsernameNotFoundException("User Not found");
    }
}
