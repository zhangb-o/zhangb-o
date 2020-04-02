package com.example.demo.dao;

import com.example.demo.po.Userinfo;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface Userinfodao {

    @Select("select * from user_info where id=#{id}")
    public Userinfo findbyid(Integer id);
    @Select("select * from user_info")
    public List<Userinfo> list();

    @Insert("insert into user_info(name,sex) values(#{name},#{sex})")
    public int insert(Userinfo userinfo);

    @Update("update user_info set name=#{name} where id=#{id}")
    public int update(Userinfo userinfo);

    @Delete("delete  from user_info where id=#{id}" )
    public int delete(Integer id);
}
