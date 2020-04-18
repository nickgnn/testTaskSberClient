package my.test.taskSberClient.service;

import my.test.taskSberClient.model.Message;

import javax.xml.bind.JAXBException;

public interface UnmarshallServiceJAXB {
    Message unmarshall() throws JAXBException;
}
