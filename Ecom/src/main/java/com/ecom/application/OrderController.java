package com.ecom.ecom;

@path(/student)
public class OrderController {

	OrderService orderService = new OrderService ();	

	@GET
	@path(/getOrderDetails)
	@Produces({MediaType.APPLICATION_JSON})
	 public List<Order> getAllOrders(@Context HttpHeaders headers)
	 {
		List<Order> order = orderService.getAllOrders();
		return order ;
	 }
	
	
	
	@POST
	@path(/addOrderDetails)
	@Produces(MediaType.APPLICATION_JSON)
	public String addOrder(Order order)
	{
		
	    return studentService.addOrder(order);

	}

	@PUT
	@Path("/{itemName}")
	@Produces(MediaType.APPLICATION_JSON)
	
	public Order updateOrder(@PathParam("itemName")String itemName,Order order)
	{
		order.setItemName(itemName);
		return orderService.update(order);
	}

	@DELETE
	@Path("/{itemName}")
	@Produces(MediaType.APPLICATION_JSON)
	
	public String removeOrder(@PathParam("itemName") int itemName)
	{
	return orderService.delete(itemName);

	}
}
