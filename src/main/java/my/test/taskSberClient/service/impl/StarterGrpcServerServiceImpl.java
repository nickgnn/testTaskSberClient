package my.test.taskSberClient.service.impl;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import my.test.taskSberClient.service.StrarterGrpcServerService;

public class StrarterGrpcServerServiceImpl implements StrarterGrpcServerService {
    @Override
    public void startServer() {
        Server server = ServerBuilder.forPort(8080)
                .addService(new GreetingServiceImpl()).build();

        System.out.println("Starting server...");
        server.start();
        System.out.println("Server started!");
        server.awaitTermination();
    }
}
