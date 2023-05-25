package com.JavaIntroduction;

class Private2{
	
	public int ordId,cusId;
	
	public Private2()
	{
		
		this(1111);
	}
	
	private Private2(int ordId)
	{
		this(ordId,2222);
	}
	
	private Private2(int ordId,int cusId)
	{
		this.ordId=ordId;
		this.cusId=cusId;
		System.out.println("order id :"+ordId+"  "+" customer id : "+cusId);
	}
}

public class PrivateConstructor2 {

	public static void main(String[] args) {
		Private2 obj=new Private2();

	}

}
