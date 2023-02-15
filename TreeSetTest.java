package com.monocept.test;

import java.util.Iterator;
import java.util.TreeSet;


public class TreeSetTest {

	public static void main(String[] args) {
		//Creating
		TreeSet<Integer> set=new TreeSet<Integer>();
		
		//updating
        set.add(24);    
        set.add(66);    
        set.add(12);    
        set.add(15);
        
        
        //reading
        Iterator<Integer> itr = set.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
        
        //deleting
        set.remove(66);
        
        System.out.println(set);

	}

}
