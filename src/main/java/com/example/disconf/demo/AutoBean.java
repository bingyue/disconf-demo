package com.example.disconf.demo;

import java.io.Serializable;

import com.baidu.disconf.client.common.annotations.DisconfItem;

public class AutoBean implements Serializable{
	private static final long serialVersionUID = 8966987814882800930L;
	/**
	 * 配置项
	 */
	private String moneyInvest;
	/**
	 * 配置项
	 * 		使用配置项时需要加 @DisconfItem(key = "discountRate")注解，有轻微的代码侵入
	 */
	private String discountRate;
	/**
	 * autoconfig.properties
	 */
	private String auto;
	/**
	 * autoconfig2.properties
	 */
	private String auto2;
	
	
	
	@Override
	public String toString() {
		return "AutoBean [moneyInvest=" + moneyInvest + ", discountRate=" + discountRate + ", auto=" + auto + ", auto2="
				+ auto2 + "]";
	}
	
	 @DisconfItem(key = "discountRate")
	public String getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(String discountRate) {
		this.discountRate = discountRate;
	}

	
	public String getMoneyInvest() {
		return moneyInvest;
	}
	public void setMoneyInvest(String moneyInvest) {
		this.moneyInvest = moneyInvest;
	}
	public String getAuto() {
		return auto;
	}
	public void setAuto(String auto) {
		this.auto = auto;
	}
	public String getAuto2() {
		return auto2;
	}
	public void setAuto2(String auto2) {
		this.auto2 = auto2;
	}
	
}
