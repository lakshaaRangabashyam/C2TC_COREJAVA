package com.tns.ifet.adminmodule.repository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
    Optional<Admin> findByUsername(String username); {

}
