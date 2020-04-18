package my.test.taskSberClient.service.impl;

import my.test.taskSberClient.model.Message;
import my.test.taskSberClient.service.UnmarshallServiceJAXB;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

@Service
public class UnmarshallServiceJAXBImpl implements UnmarshallServiceJAXB {
    @Value("${xmlPath}")
    private String xmlPath;

    @Override
    public Message unmarshall() throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Message.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        Message message = (Message) unmarshaller.unmarshal(new File(xmlPath));

        return message;
    }
}
