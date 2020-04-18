package my.test.taskSberClient.service.impl;

import my.test.taskSberClient.service.ServerApiService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@PropertySource("classpath:application.properties")
public class ServerApiServiceImpl implements ServerApiService {
    private RestTemplate restTemplate;

    @Value("${serverUrl}")
    private String serverPath;

    public ServerApiServiceImpl(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    @Override
    public String sendMessageXML(String message) {
        String URL = serverPath + "/api/getMessages/messageXML";
        return restTemplate.postForObject(URL, message, String.class);
    }
}
