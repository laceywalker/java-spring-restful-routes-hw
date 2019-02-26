package com.example.OneToManyHW.repositories;

import com.example.OneToManyHW.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
