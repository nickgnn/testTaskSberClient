package my.test.taskSberClient.controller;

import my.test.taskSberClient.dto.MessageDto;
import my.test.taskSberClient.model.Message;
import my.test.taskSberClient.service.ServerApiService;
import my.test.taskSberClient.service.UnmarshallServiceJAXB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.JAXBException;

@RestController
public class ClientRestController {
    private ServerApiService apiService;
    private UnmarshallServiceJAXB unmarshallServiceJAXB;

    @Autowired
    public ClientRestController(ServerApiService apiService, UnmarshallServiceJAXB unmarshallServiceJAXB) {
        this.apiService = apiService;
        this.unmarshallServiceJAXB = unmarshallServiceJAXB;
    }

    @RequestMapping(value = "/send", method = {RequestMethod.POST, RequestMethod.GET})
    public MessageDto sendMessage() throws JAXBException {
        Message message = unmarshallServiceJAXB.unmarshall();
        MessageDto messageDto = new MessageDto();

        messageDto.setRqUID(message.getRqUID());
        messageDto.setRqTm(message.getRqTm());
        messageDto.setCurrency(message.getCurrency());

        return apiService.sendMessageXML(messageDto);
    }
}
