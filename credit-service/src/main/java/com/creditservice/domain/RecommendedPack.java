package com.creditservice.domain;

public class RecommendedPack {

	private int amount;
	private boolean isTruelyUnlimitedPack;
	private int dataInGbPerDay;
	private int validityInDays;
	private int smsPerDay;
	private String otherOffers;

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public boolean isTruelyUnlimitedPack() {
		return isTruelyUnlimitedPack;
	}

	public void setTruelyUnlimitedPack(boolean isTruelyUnlimitedPack) {
		this.isTruelyUnlimitedPack = isTruelyUnlimitedPack;
	}

	public int getDataInGbPerDay() {
		return dataInGbPerDay;
	}

	public void setDataInGbPerDay(int dataInGbPerDay) {
		this.dataInGbPerDay = dataInGbPerDay;
	}

	public int getValidityInDays() {
		return validityInDays;
	}

	public void setValidityInDays(int validityInDays) {
		this.validityInDays = validityInDays;
	}

	public int getSmsPerDay() {
		return smsPerDay;
	}

	public void setSmsPerDay(int smsPerDay) {
		this.smsPerDay = smsPerDay;
	}

	public String getOtherOffers() {
		return otherOffers;
	}

	public void setOtherOffers(String otherOffers) {
		this.otherOffers = otherOffers;
	}

}
