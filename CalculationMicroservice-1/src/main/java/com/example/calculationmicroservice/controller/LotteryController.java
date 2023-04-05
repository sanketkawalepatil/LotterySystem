package com.example.calculationmicroservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.calculationmicroservice.model.Lottery;
import com.example.calculationmicroservice.repo.LotteryRepository;

@RestController
public class LotteryController {
   @Autowired
   private LotteryRepository lotteryRepository;

   @Autowired
   private RestTemplate restTemplate;

   @Scheduled(cron = "0 0 0 * * *")
   public void generateLotteryIds() {
      // generate lottery ids
      List<Integer> lotteryIds = new ArrayList<>();
      // add the lottery ids to the database
      for (Integer lotteryId : lotteryIds) {
         lotteryRepository.save(new Lottery(lotteryId));
      }
      // send the lottery ids to the Winner Microservice
      restTemplate.postForObject("http://winner-service/api/lottery", lotteryIds, Void.class);
   }
}
