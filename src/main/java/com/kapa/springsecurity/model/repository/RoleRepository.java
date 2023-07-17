package com.kapa.springsecurity.model.repository;

import com.kapa.springsecurity.model.entity.Role;
import com.kapa.springsecurity.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}