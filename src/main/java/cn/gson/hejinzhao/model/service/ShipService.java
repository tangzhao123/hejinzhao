package cn.gson.hejinzhao.model.service;

import cn.gson.hejinzhao.model.mapper.ShipMapper;
import cn.gson.hejinzhao.model.pojos.Registration;
import cn.gson.hejinzhao.model.pojos.Ship;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ShipService {
    @Autowired
    ShipMapper shipMapper;
    //查询所有的关系
    public List<Ship> findAllShip(){
        return shipMapper.findAllShip();
    }

    public void addRegistration(Registration registration){
        shipMapper.addRegistration(registration);
    }

    public List<Registration> findAllRegistration(String search){
        return shipMapper.findAllRegistration(search);
    }
}
