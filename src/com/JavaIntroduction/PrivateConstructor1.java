package com.JavaIntroduction;

class Private1{
	
	public int sample;
	public int sample1;
	
	private Private1()// using singleton degisn pattern
	{
		System.out.println("This is private Connstructor");
	}
	
	private Private1(int sample1)
	{
		this.sample1=sample1;
	}
	
	public void method()
	{
		sample=20;
		System.out.println("method executing, sample value : "+sample);
	}
	public static Private1 obj=null; 
	
	public static Private1 getObjec() 
	{
		if(obj==null)
		{
			obj=new Private1(); 		
		}                 
		return obj;
	}
	/*declared a static variable by using class data type, and also declare a static method by 
	  using class data type. if obj=null an instance of private1 class assigned to obj ,if 
	  obj!=null,return existing instance, but it creates instance only once and it can be used by
	   every instance of class.
	 
	  */
	public void method2()
	{
		sample=40;
		System.out.println("This is method2, sample value : "+sample);
	}
    public static Private1 pri=null; 
	
	public static Private1 getObjt() 
	{
		if(pri==null)
		{
			pri=new Private1(100); 		
		}                 
		return pri;
	}
	public void methodForParameterizedCons()
	{
		System.out.println("method for parameterized constructor , sample1 value : "+sample1);
	}
	
}


public class PrivateConstructor1 {

	public static void main(String[] args) {
		Private1 obj=Private1.getObjec();
		obj.method();
		System.out.println(" ");
		Private1 obj1=Private1.getObjec();
		obj1.method2();
		System.out.println(" ");
		Private1 ano=Private1.getObjt();
		ano.methodForParameterizedCons();

	}

}
