package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Lottery;

public interface LotteryRepository extends JpaRepository<Lottery, Long> {

	boolean existsByNumber(Integer num);
}

