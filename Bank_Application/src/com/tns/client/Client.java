package com.tns.client;

import com.tns.application.MMCurrentAcc;
import com.tns.application.MMSavingAcc;
import com.tns.application.MMBankFactory;
import com.tns.framework.CurrentAcc;
import com.tns.framework.SavingAcc;
import com.tns.framework.BankFactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankFactory s=new MMBankFactory();
		SavingAcc p=new MMSavingAcc(12345678,"Vinay",10000,true);
		CurrentAcc n=new MMCurrentAcc(1245679,"Tharun",15000,1000);
		System.out.println("Saving account ");
		p.withdraw(p.getCharge());
		System.out.println("Current account");
		n.withdraw(n.getaccBal());
		System.out.println(s.getNewSavingAcc(1234566, "Sharan", 12000, true));
		System.out.println(s.getNewCurrentAcc(1234565, "Darshan", 10000, 500));
		
		System.out.println(p);
		System.out.println(n);
		}

	}

