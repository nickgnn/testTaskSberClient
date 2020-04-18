package my.test.taskSberClient.model;

import javax.xml.bind.annotation.*;
import java.time.LocalDateTime;

@XmlRootElement
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "message")
public class Message {
    @XmlElement
    private int RqUID;

    @XmlElement
    private LocalDateTime RqTm;

    @XmlElement
    private String CurName;

    @XmlElement
    private Double CurValue;

    public Message() {
    }

    public Message(int rqUID, LocalDateTime rqTm, String curName, Double curValue) {
        RqUID = rqUID;
        RqTm = rqTm;
        CurName = curName;
        CurValue = curValue;
    }

    @XmlElement
    public int getRqUID() {
        return RqUID;
    }

    public void setRqUID(int rqUID) {
        RqUID = rqUID;
    }

    @XmlElement
    public LocalDateTime getRqTm() {
        return RqTm;
    }

    public void setRqTm(LocalDateTime rqTm) {
        RqTm = rqTm;
    }

    @XmlElement
    public String getCurName() {
        return CurName;
    }

    public void setCurName(String curName) {
        CurName = curName;
    }

    @XmlElement
    public Double getCurValue() {
        return CurValue;
    }

    public void setCurValue(Double curValue) {
        CurValue = curValue;
    }
}
