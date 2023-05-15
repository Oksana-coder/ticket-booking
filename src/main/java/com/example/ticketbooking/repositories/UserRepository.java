package com.example.ticketbooking.repositories;

import com.example.ticketbooking.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
