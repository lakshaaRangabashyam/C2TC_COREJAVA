package com.tns.ifet.adminmodule.service;

public interface AdminService {
	Admin createAdmin(Admin admin);
    Admin getAdminById(Long id);
    List<Admin> getAllAdmins();
    Admin updateAdmin(Long id, Admin adminDetails);
    void deleteAdmin(Long id);
    Admin authenticate(String username, String password);
}
}
