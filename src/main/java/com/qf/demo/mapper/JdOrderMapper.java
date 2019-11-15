package com.qf.demo.mapper;

import com.qf.demo.pojo.JdOrder;
import com.qf.demo.pojo.JdOrderExample;
import java.util.List;

import com.qf.demo.pojo.JdUser;
import org.apache.ibatis.annotations.Param;

public interface JdOrderMapper {


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





}