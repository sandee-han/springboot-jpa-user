package com.example.springbootjpa.repository;

import com.example.springbootjpa.domain.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
