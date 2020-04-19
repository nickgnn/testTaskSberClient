package my.test.taskSberClient.service.impl;

import com.example.grpc.GreetingServiceGrpc;
import com.example.grpc.MyRequest;
import com.example.grpc.MyResponse;
import io.grpc.stub.StreamObserver;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl extends GreetingServiceGrpc.GreetingServiceImplBase {
    @Override
    public void getCurName(MyRequest request, StreamObserver<MyResponse> responseObserver) {
        System.out.println(request);

        String iso4217 = "Hello there, " + request.getCurName();

        MyResponse response = MyResponse.newBuilder().setIso4217(iso4217).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
