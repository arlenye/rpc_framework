package org.rpc.client.invoke;

import org.rpc.client.framework.ClientProxy;
import org.rpc.server.service.OrderService;

public class ClientMainApp {

	 public static void main(String[] args) throws Exception {
	        OrderService service = ClientProxy.consume(OrderService.class, "127.0.0.1", 8083);
	        for (int i = 0; i < 5; i++) {
	            String order = service.getOrder(1001L);
	            System.out.println(order);
	            Thread.sleep(1000);
	        }
	    }


}
