package com.example.calculationmicroservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.calculationmicroservice.model.Lottery;

public interface LotteryRepository extends JpaRepository<Lottery, Long> {
}
