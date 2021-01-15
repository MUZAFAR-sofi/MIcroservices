package com.creditservice.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.creditservice.domain.CreditHistory;
import com.creditservice.domain.RecommendedPack;
@Service
public class CreditService {
	
	/**
	 * 
	 * @param pUserId
	 * @return
	 */
	public List<CreditHistory> getCreditHistory(String pUserId)
	{
		CreditHistory myCreditHistory1 = new CreditHistory();
		myCreditHistory1.setAmount(100);
		myCreditHistory1.setUserName("User1");
		myCreditHistory1.setDateofCredit(formatDate());
		myCreditHistory1.setCredited(true);
		
		CreditHistory myCreditHistory2 = new CreditHistory();
		myCreditHistory2.setAmount(200);
		myCreditHistory2.setUserName("User2");
		myCreditHistory2.setDateofCredit(formatDate());
		myCreditHistory2.setDebited(true);
		
		CreditHistory myCreditHistory3 = new CreditHistory();
		myCreditHistory3.setAmount(300);
		myCreditHistory3.setUserName("User3");
		myCreditHistory3.setDateofCredit(formatDate());
		myCreditHistory3.isDebited();
	
		List<CreditHistory> myCreditHistories = new ArrayList<CreditHistory>();
		myCreditHistories.add(myCreditHistory1);
		myCreditHistories.add(myCreditHistory2);
		myCreditHistories.add(myCreditHistory3);
		
		return myCreditHistories;
		
	}
	private String formatDate()
	{
		String pattern = "dd-MMM - hh:mm a";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = null;

		date = simpleDateFormat.format(new Date());
		System.out.println(date);

		return date;

	}
	public List<RecommendedPack> getRecommendedPacks() {
		
		List<RecommendedPack> myRecommendedPackList = new ArrayList<RecommendedPack>();
		
		RecommendedPack myRecommendedPack1  = new RecommendedPack();
		
		myRecommendedPack1.setAmount(449);
		myRecommendedPack1.setDataInGbPerDay(3);
		myRecommendedPack1.setOtherOffers("NA");
		myRecommendedPack1.setSmsPerDay(100);
		myRecommendedPack1.setTruelyUnlimitedPack(true);
		myRecommendedPack1.setValidityInDays(28);
		
		RecommendedPack myRecommendedPack2  = new RecommendedPack();
		myRecommendedPack2.setAmount(448);
		myRecommendedPack2.setDataInGbPerDay(2);
		myRecommendedPack2.setOtherOffers("NA");
		myRecommendedPack2.setSmsPerDay(200);
		myRecommendedPack2.setTruelyUnlimitedPack(true);
		myRecommendedPack2.setValidityInDays(28);
		
		RecommendedPack myRecommendedPack3  = new RecommendedPack();
		myRecommendedPack3.setAmount(999);
		myRecommendedPack3.setDataInGbPerDay(5);
		myRecommendedPack3.setOtherOffers("NA");
		myRecommendedPack3.setSmsPerDay(400);
		myRecommendedPack3.setTruelyUnlimitedPack(true);
		myRecommendedPack3.setValidityInDays(84);
		
		myRecommendedPackList.add(myRecommendedPack1);
		myRecommendedPackList.add(myRecommendedPack2);
		myRecommendedPackList.add(myRecommendedPack3);
		
		
		return myRecommendedPackList;
	}

}
