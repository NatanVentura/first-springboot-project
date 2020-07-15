package com.natan.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.natan.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
