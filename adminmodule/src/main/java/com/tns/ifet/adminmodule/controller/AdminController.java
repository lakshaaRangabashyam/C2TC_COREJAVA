package com.tns.ifet.adminmodule.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.tns.ifet.adminmodule.entity.Admin;
import com.tns.ifet.adminmodule.service.AdminService;

public class AdminController {
	 private final AdminService adminService;

	    public AdminController(AdminService adminService) {
	        this.adminService = adminService;
	    }

	    @PostMapping
	    public ResponseEntity<Admin> createAdmin(@RequestBody Admin admin) {
	        return ResponseEntity.ok(adminService.createAdmin(admin));
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<Admin> getAdminById(@PathVariable Long id) {
	        return ResponseEntity.ok(adminService.getAdminById(id));
	    }

	    @GetMapping
	    public ResponseEntity<List<Admin>> getAllAdmins() {
	        return ResponseEntity.ok(adminService.getAllAdmins());
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<Admin> updateAdmin(@PathVariable Long id, @RequestBody Admin adminDetails) {
	        return ResponseEntity.ok(adminService.updateAdmin(id, adminDetails));
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<String> deleteAdmin(@PathVariable Long id) {
	        adminService.deleteAdmin(id);
	        return ResponseEntity.ok("Admin deleted successfully.");
	    }

	    @PostMapping("/login")
	    public ResponseEntity<Admin> login(@RequestParam String username, @RequestParam String password) {
	        return ResponseEntity.ok(adminService.authenticate(username, password));
	    }
	}
}
