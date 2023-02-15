package com.monocept.test;

import java.util.*;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		//creating
		LinkedHashSet<String> set=new LinkedHashSet();  
        
		//updating
		set.add("One");    
        set.add("Two");    
        set.add("Three");   
        set.add("Four");  
        set.add("Five");
        
        //reading
        Iterator<String> i=set.iterator();  
        while(i.hasNext())  
        {  
        System.out.println(i.next());  
        }
        
        //deleting
        set.clear();
        
        System.out.println(set);
	}

}
