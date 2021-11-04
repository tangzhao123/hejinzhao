package cn.gson.hejinzhao.controller;

import cn.gson.hejinzhao.model.pojos.Registration;
import cn.gson.hejinzhao.model.pojos.Ship;
import cn.gson.hejinzhao.model.service.ShipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class ShipController {

    @Autowired
    ShipService shipService;

    //查询所有的关系
    @RequestMapping("ship-list")
    public List<Ship> findAllShip(){
        return shipService.findAllShip();
    }

    //新增入院记录
    @RequestMapping("add-ship")
    public String addRegistration(@RequestBody Registration registration){
        System.err.println(111);
        System.err.println(registration);
        try {
            shipService.addRegistration(registration);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
    }

    @RequestMapping("registration-lit")
    public List<Registration> findAllRegistration(String search){
        return shipService.findAllRegistration(search);
    }
}
