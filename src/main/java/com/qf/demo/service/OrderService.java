package com.qf.demo.service;

import com.qf.demo.pojo.JdOrder;
import com.qf.demo.pojo.JdUser;

import java.util.List;

public interface OrderService {

    //添加订单信息
    public void insertOrder(JdOrder jdOrder);

    //全查订单信息
    public List<JdOrder> orderselect();

    //根据id删除
    public boolean deleteOrderById(int oid);

    //根据id查
    public JdOrder selectOrderById(int oid);
    //修改信息
    public boolean updateOrder(JdOrder jdOrder);



   /* //全查订单信息
    public List<JdOrder> selectByExample();
    //根据id查
    public JdOrder selectOrderById(int oid);
    //根据uname查
    public JdOrder selectOrderByName(String uname);

    //删除订单
    public boolean deleteOrderById(int oid);*/






}
