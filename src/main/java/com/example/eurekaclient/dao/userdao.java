package com.example.eurekaclient.dao;

import com.example.eurekaclient.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface userdao {

    @Select("SELECT * FROM USER WHERE ID=1")
    public User getuserbyid();
}
