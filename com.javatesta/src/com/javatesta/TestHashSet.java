package com.javatesta;
import java.util.HashSet;
public class TestHashSet 
{
  public static void main(String[] args) 
  {
	HashSet<Integer> set=new HashSet<>();
	   set.add(10);
	   set.add(20);
	   set.add(30);
	   set.add(30);
	   //HashSet key ander data ko serach karne key liye contains name ka method huta hai
	   //search---->contains
	   if(set.contains(80)) 
	   {
		  System.out.println("set contains is 30"); 
	   }
	   if(!set.contains(60)) 
	   {
		  System.out.println("dosenot contains"); 
	   }
  }
}
