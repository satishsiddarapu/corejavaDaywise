package com.destination.ArthematicOprators.sep18;

  class ArthematicOperators {
	void add(int a ,int b) {
		int res1=a+b;
		System.out.println("addition result is:"+(res1));
		System.out.println("==========");
	}
	void sub(int a,int b) {
		int res2=a-b;
		System.out.println("subtaction result is:"+(res2));
		System.out.println("==========");
	}
	void mul(int a,int b) {
		int res3=a*b;
		System.out.println("multiplication result is:"+(res3));
		System.out.println("==========");
	}
	void div(int a,int b) {
		int res4=a/b;
		System.out.println("division result is:"+(res4));
		System.out.println("==========");

	}
	void mod(int a,int b) {
		int res5=a%b;
		System.out.println("modulo division result is:"+(res5));
		System.out.println("==========");

	}
	
public class ArthematicOperatorsExample{
	public static void main(String[] args) {
		int a=100;
		int b=50;
		ArthematicOperators ao=new ArthematicOperators();
			ao.add(a, b);
			ao.sub(a, b);
			ao.mul(a, b);
			ao.div(a, b);
			ao.mod(a, b);
			
		
		
	}

}
}


