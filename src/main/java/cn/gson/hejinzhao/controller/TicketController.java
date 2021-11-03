package cn.gson.hejinzhao.controller;

import cn.gson.hejinzhao.model.pojos.Station;
import cn.gson.hejinzhao.model.pojos.Ticket;
import cn.gson.hejinzhao.model.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class TicketController {

    @Autowired
    TicketService ticketService;

    //查询所有的车站
    @RequestMapping("ticket-list")
    public List<Station> findAllStation(){
        return ticketService.findAllStation();
    }

    //查询票价
    @RequestMapping("fare-list")
    public int findAllFare(int count){
        return ticketService.findAllFare(count);
    }

    //新增售票记录表
    @RequestMapping("add-ticket")
    public String addTicket(@RequestBody Ticket ticket){
        System.err.println(ticket);
        try {
            ticketService.addTicket(ticket);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
    }

    //查询售票记录表
    @RequestMapping("all-ticket")
    public List<Ticket> allTicket(){
        return ticketService.allTicket();
    }
}
