package com.tka.july8;

public class cheakprimeornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int num=10;
		  boolean isprime=true;
		  if(num <=1) {
			isprime=false;
		  } 
				 for(int i=2;i<num;i++) {
					if(num%i==0) {
						isprime=false;
						break;
					}
				 }
				 if(isprime) {
					 System.out.println(num+"number is prime");
					 
				 }
				 else {
					 System.out.println(num+"number is not prime");
				 }
				 
			 }
			    }
	
