package com.ps.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ps.blog.entities.Role;


public interface RoleRepo  extends JpaRepository<Role, Integer>{

}