package com.example.demo.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
// Jpa repository takes in... 1. type of object we want to work with
// 2. The id for the type that we want
public interface UserRepository extends JpaRepository<User, Long> {

}

// UserRepository: Naming convention for anything that accesses your database
// when working w/ JPA
