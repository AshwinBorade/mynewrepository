package com.accessspecifier1;

public class testaccessspecifier {
	public static void main(String[] args) {
		defaultaccessspecifier obj=new defaultaccessspecifier();
		obj.display();
		
		//privateaccessspecifier obj=new privateaccessspecifier();
		//System.out.println("this is private"+obj.a);
		
		protectedaccessspecifier obj2=new protectedaccessspecifier();
		obj2.display2();
	}

}
