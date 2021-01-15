package com.creditservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.creditservice.domain.CreditHistory;
import com.creditservice.domain.RecommendedPack;
import com.creditservice.service.CreditService;

@RestController
@RequestMapping("/api/credit")
public class CreditController {

	@Autowired
	CreditService mCreditService;
	

	@GetMapping(path = "/")
	public String welcome() {

		return "Welcome";
	}
	
	
	@GetMapping(path = "/creditHistory/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CreditHistory> creditHistory(@PathVariable("userId") String userId) {

		List<CreditHistory> myCreditList = mCreditService.getCreditHistory(userId);
		return myCreditList;

	}
	
	@GetMapping(path = "/getRecommendedPacks", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<RecommendedPack> getRecommendedPacks() {

		List<RecommendedPack> myRecommendedPack = mCreditService.getRecommendedPacks();
		return myRecommendedPack;

	}
}
