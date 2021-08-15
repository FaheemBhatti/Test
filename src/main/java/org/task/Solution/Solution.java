package org.task.Solution;

import java.util.Date;

public class Solution {

	private int sum; 
	private int counter; 
	private int withdrawBalance; 
	private int balanceAfterDeduction;
	private int feeMonths;
	private int[] a;
	private Date[] dateArray;
	private String computedNumber;
	private Date[] d;
	private int count;

	public Solution(int[] a , Date[] d) {
		this.a = a;
		this.d = d;
		this.counter = 12;
		this.withdrawBalance = 0;
		this.sum = 0;
	}

	public int process() {
		depositCalc(a);
		withdrawCalc(a);
		monthCalc(d);
		return feeCalc(getCounter());

	}

	private int feeCalc( int numOfMonths) {
		balanceAfterDeduction = getSum() - (5 * numOfMonths);
		return balanceAfterDeduction;
	}

	private void depositCalc(int[] transaction) {
		for(int a: transaction) {
			sum = sum + a;
		}
		
	}

	private void withdrawCalc(int[] arrayForTransactions) {
		for(int a: arrayForTransactions) {
			if(a>0) 
				continue;
			else 
				withdrawBalance = withdrawBalance - a;
		}
		
	}

	private void monthCalc(Date[] date) {

		for(int i=0;i<date.length; i++) {
			//count = 0;
			int date1 = date[i].getMonth();
			for(int j=0;j<date.length; j++) {
				int date2 = date[j].getMonth();
				if(date1 == date2) {
					count++;
				}

				if(count == 3 && getWithdrawBalance()==100) {
					counter = counter--;
				}
			}
		}
		
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int getWithdrawBalance() {
		return withdrawBalance;
	}

	public void setWithdrawBalance(int withdrawBalance) {
		this.withdrawBalance = withdrawBalance;
	}

	public int getBalanceAfterDeduction() {
		return balanceAfterDeduction;
	}

	public void setBalanceAfterDeduction(int balanceAfterDeduction) {
		this.balanceAfterDeduction = balanceAfterDeduction;
	}

	public int getFeeMonths() {
		return feeMonths;
	}

	public void setFeeMonths(int feeMonths) {
		this.feeMonths = feeMonths;
	}

	public int[] getA() {
		return a;
	}

	public void setA(int[] a) {
		this.a = a;
	}

	public Date[] getDateArray() {
		return dateArray;
	}

	public void setDateArray(Date[] dateArray) {
		this.dateArray = dateArray;
	}

	public String getComputedNumber() {
		return computedNumber;
	}

	public void setComputedNumber(String computedNumber) {
		this.computedNumber = computedNumber;
	}

	public Date[] getD() {
		return d;
	}
	
	public void setCounter(int counter) {
		this.counter = counter;
	}
	
	public int getCounter() {
		return counter;
	}

	public void setD(Date[] d) {
		this.d = d;
	}

	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}
}
