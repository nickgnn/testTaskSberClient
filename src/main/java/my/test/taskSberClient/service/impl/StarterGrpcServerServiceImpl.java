package my.test.taskSberClient.service.impl;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import my.test.taskSberClient.service.StarterGrpcServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class StarterGrpcServerServiceImpl implements StarterGrpcServerService {
    private GreetingServiceImpl greetingService;

    @Autowired
    public StarterGrpcServerServiceImpl(GreetingServiceImpl greetingService) {
        this.greetingService = greetingService;
    }

    @Override
    public void startServer() throws IOException, InterruptedException{
        Server server = ServerBuilder.forPort(8080)
                .addService(greetingService).build();

        System.out.println("Starting server...");
        server.start();
        System.out.println("Server started!");
        server.awaitTermination();
    }
}
