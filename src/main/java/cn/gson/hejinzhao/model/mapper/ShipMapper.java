package cn.gson.hejinzhao.model.mapper;

import cn.gson.hejinzhao.model.pojos.Registration;
import cn.gson.hejinzhao.model.pojos.Ship;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ShipMapper {

    //查询所有的关系
    public List<Ship> findAllShip();

    public void addRegistration(Registration registration);

    public List<Registration> findAllRegistration(String search);
}
