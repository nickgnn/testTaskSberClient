package my.test.taskSberClient.controller;

import my.test.taskSberClient.service.ServerApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientRestController {
    private ServerApiService apiService;

    @Autowired
    public ClientRestController(ServerApiService apiService) {
        this.apiService = apiService;
    }


    @RequestMapping(value = "/sendMessage", method = {RequestMethod.POST, RequestMethod.GET})
    public String sendMessage(String message) {
        message = "--------My-First-MESSAGE-----------------";

        return apiService.sendMessageXML(message);
    }
}
