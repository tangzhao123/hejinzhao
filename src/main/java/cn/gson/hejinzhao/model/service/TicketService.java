package cn.gson.hejinzhao.model.service;

import cn.gson.hejinzhao.model.mapper.TicketMapper;
import cn.gson.hejinzhao.model.pojos.Station;
import cn.gson.hejinzhao.model.pojos.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TicketService {

    @Autowired
    TicketMapper ticketMapper;

    //查询所有的车站
    public List<Station> findAllStation(){
        return ticketMapper.allStation();
    }

    //查询票价
    public int findAllFare(int count){
        return ticketMapper.findAllFare(count);
    }

    //新增售票记录表
    public void addTicket(Ticket ticket){
        ticketMapper.addTicket(ticket);
    }

    //查询售票记录表
    public List<Ticket> allTicket(){
        return ticketMapper.allTicket();
    }
}
