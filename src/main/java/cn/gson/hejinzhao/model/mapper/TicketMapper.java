package cn.gson.hejinzhao.model.mapper;

import cn.gson.hejinzhao.model.pojos.Station;
import cn.gson.hejinzhao.model.pojos.Ticket;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TicketMapper {

    //查询所有的车站
    public List<Station> allStation();

    //查询票价
    public int findAllFare(int count);

    //新增售票记录表
    public void addTicket(Ticket ticket);

    //查询售票记录表
    public List<Ticket> allTicket();
}
