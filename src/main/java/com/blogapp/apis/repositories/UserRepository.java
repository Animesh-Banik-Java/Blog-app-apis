package com.blogapp.apis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogapp.apis.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
