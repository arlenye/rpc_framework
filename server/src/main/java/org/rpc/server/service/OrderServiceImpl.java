package org.rpc.server.service;

public class OrderServiceImpl implements OrderService{

	public String getOrder(Long orderId) {
		 return "this is order:" + orderId;
	}

}
