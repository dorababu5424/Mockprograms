package org.day1;

import java.awt.List;
import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class Singleton {
	
	public static void main(String[] args) {
		
		Pojo p  = new Pojo();
		p.setEmpid(2000);
		p.setEmpname("Dorababu");
		p.setEmpphone(9491945424l);
		p.setSal(235.6);
		
		Pojo p1 =new Pojo();
		p1.setEmpid(20047235);
		p1.setEmpname("mounika");
		p1.setEmpphone(9491945424l);
		p1.setSal(5665546);
		
		
		LinkedList li = new LinkedList();
		li.add(p1);
		li.add(p);
		
		for (int i = 0; i < li.size(); i++) {
			
			Pojo p3 = (Pojo) li.get(i);
			System.out.println(p3.getEmpid());
			System.out.println(p3.getEmpname());
			System.out.println(p3.getEmpphone());
			
			
		}
		
		Map<Integer, Pojo> mp = new HashMap<Integer, Pojo>();
		mp.put(1, p);
		mp.put(2, p1);
		
		Set<java.util.Map.Entry<Integer, Pojo>> se = mp.entrySet();
		
	
		
		
		
		
		
		
		
	}

}
