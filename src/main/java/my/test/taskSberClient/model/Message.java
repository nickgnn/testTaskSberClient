package my.test.taskSberClient.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "SimpleMessage")
public class Message {
    @XmlElement
    private long RqUID;

    @XmlElement
    private String RqTm;

    @XmlElementWrapper(name = "Currency")
    @XmlElements({
            @XmlElement(name = "CurName", type = String.class),
            @XmlElement(name = "CurValue", type = Double.class)
    })
    private List currency;

    public Message() {
    }

    public Message(long rqUID, String rqTm, List currency) {
        this.RqUID = rqUID;
        this.RqTm = rqTm;
        this.currency = currency;
    }

    @XmlElement
    public long getRqUID() {
        return RqUID;
    }

    @XmlElement
    public String getRqTm() {
        return RqTm;
    }

    public List getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        return "Message{" +
                "RqUID=" + RqUID +
                ", RqTm='" + RqTm + '\'' +
                ", currency=" + currency +
                '}';
    }
}
