package com.example.demospringjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demospringjpa.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
