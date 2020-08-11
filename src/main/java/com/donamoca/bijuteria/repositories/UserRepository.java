package com.donamoca.bijuteria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.donamoca.bijuteria.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
