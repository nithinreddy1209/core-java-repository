package com.JavaIntroduction;

public class MainAccount {

	public static void main(String[] args) {
		Account another=new Account(50000);
		Account acc1=new Account("45763","Rahul");
		Account acc2=new Account("86456","krishna",30000);;
		
		acc1.getBalance();
		acc1.credit(20000);
		acc1.debit(10000);
		acc1.transferTo(another,5000 );
		
		
		acc2.credit(20000);
		acc2.debit(10000);
        acc2.transferTo(another, 15000);
        
        
        System.out.println(acc1.toString());
        System.out.println("");
        System.out.println(acc2.toString());
        System.out.println(" ");
        System.out.println("Balance of ToAccount : "+(another.myBalance+acc1.addBalance+acc2.addBalance));
        
        
        
        
        
	}

}
