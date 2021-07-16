package com.codegym.repository;

import com.codegym.model.BorrowCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BorrowCardRepository extends JpaRepository<BorrowCard, Integer> {
}
