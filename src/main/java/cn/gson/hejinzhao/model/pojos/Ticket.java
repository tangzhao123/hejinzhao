package cn.gson.hejinzhao.model.pojos;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Timestamp;

public class Ticket {

    private int ticketId; //序号
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Timestamp ticketDate;//售票时间
    private int ticketStart;//起点站
    private int ticketEnd;//终点站
    private int ticketPrice;//金额
    private String ticketPayment;//支付方式
    private String ticketStartName;
    private String ticketEndName;

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public Timestamp getTicketDate() {
        return ticketDate;
    }

    public void setTicketDate(Timestamp ticketDate) {
        this.ticketDate = ticketDate;
    }

    public int getTicketStart() {
        return ticketStart;
    }

    public void setTicketStart(int ticketStart) {
        this.ticketStart = ticketStart;
    }

    public int getTicketEnd() {
        return ticketEnd;
    }

    public void setTicketEnd(int ticketEnd) {
        this.ticketEnd = ticketEnd;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public String getTicketPayment() {
        return ticketPayment;
    }

    public void setTicketPayment(String ticketPayment) {
        this.ticketPayment = ticketPayment;
    }

    public String getTicketStartName() {
        return ticketStartName;
    }

    public void setTicketStartName(String ticketStartName) {
        this.ticketStartName = ticketStartName;
    }

    public String getTicketEndName() {
        return ticketEndName;
    }

    public void setTicketEndName(String ticketEndName) {
        this.ticketEndName = ticketEndName;
    }

    public Ticket() {
    }

    public Ticket(int ticketStart, int ticketEnd, int ticketPrice, String ticketPayment) {
        this.ticketStart = ticketStart;
        this.ticketEnd = ticketEnd;
        this.ticketPrice = ticketPrice;
        this.ticketPayment = ticketPayment;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId=" + ticketId +
                ", ticketDate=" + ticketDate +
                ", ticketStart=" + ticketStart +
                ", ticketEnd=" + ticketEnd +
                ", ticketPrice=" + ticketPrice +
                ", ticketPayment='" + ticketPayment + '\'' +
                '}';
    }
}
