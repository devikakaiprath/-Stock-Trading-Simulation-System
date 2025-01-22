package com.stocktrading.simulation.repository;

import com.stocktrading.simulation.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Define custom query methods if needed
}
