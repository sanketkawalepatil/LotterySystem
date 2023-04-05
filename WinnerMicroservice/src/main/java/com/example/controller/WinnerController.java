package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Lottery;
import com.example.repo.LotteryRepository;

@RestController
@RequestMapping("/api")
public class WinnerController {
   @Autowired
   private LotteryRepository lotteryRepository;

   @PostMapping("/lottery")
   public void addLotteryIds(@RequestBody List<Integer> lotteryIds) {
      for (Integer lotteryId : lotteryIds) {
         lotteryRepository.save(new Lottery(lotteryId));
      }
   }

   @GetMapping("/check-number/{num}")
   public boolean checkNumber(@PathVariable("num") Integer num) {
      return lotteryRepository.existsByNumber(num);
   }
}
