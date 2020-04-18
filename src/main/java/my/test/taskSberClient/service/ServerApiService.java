package my.test.taskSberClient.service;

import my.test.taskSberClient.dto.MessageDto;

public interface ServerApiService {
    MessageDto sendMessageXML(MessageDto messageDto);
}
