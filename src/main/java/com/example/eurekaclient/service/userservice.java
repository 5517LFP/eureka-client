package com.example.eurekaclient.service;

import com.example.eurekaclient.dao.userdao;
import com.example.eurekaclient.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userservice {

    @Autowired
    userdao userdao;

   public String getuserbyid(){
       User user=userdao.getuserbyid();
       return user.toString();
   }


}
