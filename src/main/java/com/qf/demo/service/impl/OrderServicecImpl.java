package com.qf.demo.service.impl;


import com.qf.demo.mapper.JdOrderMapper;
import com.qf.demo.pojo.JdOrder;
import com.qf.demo.pojo.JdUser;
import com.qf.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServicecImpl implements OrderService {

    @Autowired
    private JdOrderMapper orderMapper;



    @Override
    public void insertOrder(JdOrder jdOrder) {
        orderMapper.insertOrder(jdOrder);
    }



    @Override
    public List<JdOrder> orderselect() {
        return orderMapper.orderselect();
    }

    @Override
    public boolean deleteOrderById(int oid) {
        return orderMapper.deleteOrderById (oid);
    }

    @Override
    public JdOrder selectOrderById(int oid) {
        return orderMapper.selectOrderById(oid);
    }

    @Override
    public boolean updateOrder(JdOrder jdOrder) {
        return orderMapper.updateOrder(jdOrder);
    }

    /*@Override
    public List<JdOrder> selectByExample() {
        JdOrderExample example = new JdOrderExample();
        List<JdOrder> allOrders = orderMapper.selectByExample(example);
        return allOrders;
    }

    @Override
    public JdOrder selectOrderById(int oid) {
        return orderMapper.selectOrderById(oid);
    }

    @Override
    public JdOrder selectOrderByName(String uname) {
        return null;
    }



    @Override
    public boolean deleteOrderById(int oid) {
        return orderMapper.deleteOrderById(oid);
    }*/
}
