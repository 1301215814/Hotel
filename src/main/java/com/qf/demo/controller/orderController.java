package com.qf.demo.controller;

import com.qf.demo.pojo.JdOrder;
import com.qf.demo.pojo.JdUser;
import com.qf.demo.service.OrderService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;

import java.util.List;

@Controller
public class orderController {
    private static final Logger logger = LogManager.getLogger(orderController.class);
    @Autowired
    private OrderService orderService;
    //添加订单
    @RequestMapping("insertOrder")
    public String insertOrder(JdOrder jdOrder, BindingResult bindingResult){
        orderService.insertOrder(jdOrder);
        logger.info("jdOrder"+jdOrder);

        return "index";
    }


    //全查订单信息
    @RequiresPermissions( value = {"room_add"})
    @RequestMapping("orderselect")
    public String selectByExample(Model model){
        List<JdOrder> orders=orderService.orderselect();
        logger.info(orders+"-------------------------------------------------------");
        //  ResponseEntity responseEntity = new ResponseEntity(users, HttpStatus.OK);
        model.addAttribute("orders",orders);
        return "orderManager";
    }

    //全查订单信息
    @RequestMapping("orderselect2")
    public String selectByExample2(Model model){
        List<JdOrder> orders=orderService.orderselect();
        logger.info(orders+"-------------------------------------------------------");
        //  ResponseEntity responseEntity = new ResponseEntity(users, HttpStatus.OK);
        model.addAttribute("orders",orders);
        return "users1";
    }

    //删除订单信息
    @RequiresPermissions( value = {"room_delete"})
    @RequestMapping("deleteOrderById")
    public String deleteOrderById(int oid){
        orderService.deleteOrderById(oid);
        return "redirect:orderselect";
    }


    //跳转修改页面
    @RequiresPermissions( value = {"room_update"})
    @RequestMapping("/updateOrder")
    public String updatepage(int oid,Model model){
        JdOrder jdOrder =orderService.selectOrderById(oid);
        model.addAttribute("order",jdOrder);
        logger.info(oid);
        logger.info(jdOrder);
        return "updatepage6";
    }

    //修改订单信息
    @RequiresPermissions( value = {"room_update"})
    @RequestMapping("/updateOrder2")
    public String updateOrder(JdOrder jdOrder){
        logger.info(jdOrder+"***********");
        boolean b = orderService.updateOrder(jdOrder);
        logger.info(b+"=======================");
        return "redirect:orderselect";
    }













/*    //全查用户信息
    @RequestMapping(value = "/orders/select",method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<JdOrder>> orders(){
        List<JdOrder> orders = orderService.selectByExample();
        ResponseEntity responseEntity = new ResponseEntity(orders, HttpStatus.OK);
        return responseEntity;
    }
    //添加订单信息
    @RequestMapping(value = "order/insert",method = RequestMethod.POST)
    public ResponseEntity<JdOrder> insertOrder(JdOrder jdOrder){
        if (!StringUtils.isEmpty(jdOrder.getOname())){
            JdOrder jdOrder1 = orderService.selectOrderByName(jdOrder.getOname());
            if (jdOrder1==null){
                orderService.insertOrder(jdOrder);
                return new ResponseEntity<JdOrder>(jdOrder,HttpStatus.OK);
            }else {
                return new ResponseEntity<JdOrder>(HttpStatus.CONFLICT);
            }
        }else {
            return new ResponseEntity<JdOrder>(HttpStatus.BAD_REQUEST);
        }
    }

    //删除订单信息
    @RequestMapping(value = "/order/delete/{oid}",method = RequestMethod.DELETE)
    public ResponseEntity deleteOrderById(@PathVariable("oid")int oid){
        JdOrder jdOrder = orderService.selectOrderById(oid);
        if (jdOrder==null){
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }else {
            boolean b = orderService.deleteOrderById(oid);
            return new ResponseEntity(HttpStatus.OK);
        }

    }*/
}
