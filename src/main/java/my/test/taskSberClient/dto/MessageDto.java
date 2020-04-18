package my.test.taskSberClient.dto;

import java.util.List;

public class MessageDto {
    private long RqUID;
    private String RqTm;
    private List currency;

    public long getRqUID() {
        return RqUID;
    }

    public void setRqUID(long rqUID) {
        RqUID = rqUID;
    }

    public String getRqTm() {
        return RqTm;
    }

    public void setRqTm(String rqTm) {
        RqTm = rqTm;
    }

    public List getCurrency() {
        return currency;
    }

    public void setCurrency(List currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "MessageDto{" +
                "RqUID=" + RqUID +
                ", RqTm='" + RqTm + '\'' +
                ", currency=" + currency +
                '}';
    }
}
