package com.example.demo;


import com.example.demo.dao.Userinfodao;
import com.example.demo.po.Userinfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
 public class SpringbootmybatisApplicationTests {
	@Autowired
	private Userinfodao userinfodao;

	@Test
	public void contextLoads() {
	}

	/**
	 * 按条件查询
	 */
	@Test
	public void run1(){
		Userinfo findbyid = userinfodao.findbyid(2);
		System.out.println(findbyid);
	}
	/**
	 * 查询全部
	 */
	@Test
	public void run2(){
		List<Userinfo> list = userinfodao.list();
		System.out.println(list);
	}
	/**
	 * 添加
	 */
	@Test
	public void run3(){
		Userinfo userinfo = new Userinfo();
		userinfo.setName("zhang");
		userinfo.setSex("vn");
		int insert = userinfodao.insert(userinfo);
		System.out.println(insert);
	}

	/**
	 * 修改
	 */
	@Test
	public void run4(){
		Userinfo userinfo = new Userinfo();
		userinfo.setId(1);
		userinfo.setName("wang");

		int insert = userinfodao.update(userinfo);
		System.out.println(insert);
	}
	/**
	 * 删除
	 */
	@Test
	public void run5(){


		int insert = userinfodao.delete(1);
		System.out.println(insert);
	}

}
