package my.test.taskSberClient.controller;

import my.test.taskSberClient.model.Message;
import my.test.taskSberClient.service.ServerApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class ClientRestController {
    private ServerApiService apiService;

    @Autowired
    public ClientRestController(ServerApiService apiService) {
        this.apiService = apiService;
    }


    @RequestMapping(value = "/sendMessage", method = {RequestMethod.POST, RequestMethod.GET})
    public Message sendMessage(Message message) {
        message = new Message(12, LocalDateTime.now(), "USD", 5000.00);

        return apiService.sendMessageXML(message);
    }
}
