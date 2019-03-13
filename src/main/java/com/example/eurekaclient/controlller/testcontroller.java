package com.example.eurekaclient.controlller;

import com.example.eurekaclient.service.userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testcontroller {

    @Autowired
    private userservice userservi;

    @Value("${server.port}")
    private String serverport;

    @RequestMapping("/getuser")
    public String getuserbyid(){
       String uu= userservi.getuserbyid();
        return "返回的结果是："+uu+serverport+"-------";






    }
}
