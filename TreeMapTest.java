package com.monocept.test;

import java.util.*;

public class TreeMapTest {

	public static void main(String[] args) {
		//creating
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	    //updating  
		map.put(100,"Amit");    
	      map.put(102,"Ravi");    
	      map.put(101,"Vijay");    
	      map.put(103,"Rahul");    
	        
	      //reading
	      for(Map.Entry m:map.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      } 
	      
	      //deleting
	      map.clear();
	      System.out.println(map);
	      

	}

}
