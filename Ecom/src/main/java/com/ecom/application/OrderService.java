package com.ecom.ecom;

import java.util.List;

public class OrderService {
	 public List<Order > getAllOrders ()
	    {
	        List<Order> orders = new ArrayList<Order>();	
	        Order o1 = new Order ("item1", "A@gmail.com",1);
	        Order o2 = new Order ("item2","K@gmail.com",3);
	        students.add(o1);
	        students.add(o2);
	        return orders;
	    }	
}
