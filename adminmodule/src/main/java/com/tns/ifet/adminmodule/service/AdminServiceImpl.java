package com.tns.ifet.adminmodule.service;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.tns.ifet.adminmodule.entity.Admin;
import com.tns.ifet.adminmodule.repository.AdminRepository;

import java.util.List;
import java.util.Optional;

public class AdminServiceImpl {
	private final AdminRepository adminRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    public AdminServiceImpl(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
        this.passwordEncoder = new BCryptPasswordEncoder();
    }

    @Override
    public Admin createAdmin(Admin admin) {
        admin.setPassword(passwordEncoder.encode(admin.getPassword())); // Encrypt password
        return adminRepository.save(admin);
    }

    @Override
    public Admin getAdminById(Long id) {
        return adminRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Admin not found with ID: " + id));
    }

    @Override
    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }

    @Override
    public Admin updateAdmin(Long id, Admin adminDetails) {
        Optional<Admin> optionalAdmin = adminRepository.findById(id);
        if (optionalAdmin.isPresent()) {
            Admin existingAdmin = optionalAdmin.get();
            existingAdmin.setUsername(adminDetails.getUsername());
            existingAdmin.setEmail(adminDetails.getEmail());

            if (!adminDetails.getPassword().isEmpty()) {
                existingAdmin.setPassword(passwordEncoder.encode(adminDetails.getPassword()));
            }

            return adminRepository.save(existingAdmin);
        } else {
            throw new RuntimeException("Admin not found with ID: " + id);
        }
    }

    @Override
    public void deleteAdmin(Long id) {
        if (adminRepository.existsById(id)) {
            adminRepository.deleteById(id);
        } else {
            throw new RuntimeException("Admin not found with ID: " + id);
        }
    }

    @Override
    public Admin authenticate(String username, String password) {
        Optional<Admin> optionalAdmin = adminRepository.findByUsername(username);
        if (optionalAdmin.isPresent() && passwordEncoder.matches(password, optionalAdmin.get().getPassword())) {
            return optionalAdmin.get();
        } else {
            throw new RuntimeException("Invalid username or password");
        }
    }
}
}
