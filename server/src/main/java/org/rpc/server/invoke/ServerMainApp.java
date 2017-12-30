package org.rpc.server.invoke;

import org.rpc.server.framework.ServerReflect;
import org.rpc.server.service.OrderService;
import org.rpc.server.service.OrderServiceImpl;

public class ServerMainApp {

	public static void main(String[] args) throws Exception {
        OrderService service = new OrderServiceImpl();
        ServerReflect.provider(service, 8083);
    }

}
