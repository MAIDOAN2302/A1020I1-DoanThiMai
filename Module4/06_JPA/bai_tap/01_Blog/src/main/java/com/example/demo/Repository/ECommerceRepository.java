package com.example.demo.Repository;

import com.example.demo.model.ECommerce;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ECommerceRepository extends JpaRepository<ECommerce, Integer> {
}
