package my.test.taskSberClient.service.impl;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import my.test.taskSberClient.service.StarterGrpcServerService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class StarterGrpcServerServiceImpl implements StarterGrpcServerService {
    @Value("${server.port}")
    private String serverPort;

    @Override
    public void startServer() throws IOException, InterruptedException{
        Server server = ServerBuilder.forPort(Integer.valueOf(serverPort))
                .addService(new GreetingServiceImpl()).build();

        System.out.println("Starting server...");
        server.start();
        System.out.println("Server started!");
        server.awaitTermination();
    }
}
