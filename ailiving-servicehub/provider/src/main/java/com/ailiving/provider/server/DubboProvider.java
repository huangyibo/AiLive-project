package com.ailiving.provider.server;

import com.ailiving.api.IDubboProvider;
import com.ailiving.api.Response;
import com.alibaba.dubbo.config.annotation.Service;

@Service(
        version = "1.0.0",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class DubboProvider implements IDubboProvider {
    @Override
    public Response sayHello() {
        return new Response("connect success!!");
    }
}
