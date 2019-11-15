package com.qf.demo.controller;

import com.qf.demo.pojo.JdRoom;
import com.qf.demo.pojo.JdUser;
import com.qf.demo.service.JdRoomService;
import com.qf.demo.service.JdUserService;
import com.qf.demo.vo.UserVo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller

public class UserController {
    public static final Logger logger= LogManager.getLogger(UserController.class);

    @Autowired
    private JdUserService userService;
    @Autowired
    private JdRoomService roomService;
    //显示页面
    @RequestMapping(value="/{page}",method = RequestMethod.GET)
    public String showItem_list(@PathVariable("page") String page){
        return page;
    }
    //处理用户登录
    @RequestMapping(value = "/dengLogin",method = RequestMethod.GET)
    public String dengLu(UserVo userVo,Model model,HttpSession session){
        try{
            /*认证过程、创建令牌*/
            UsernamePasswordToken token = new UsernamePasswordToken (userVo.getUname (),userVo.getUpassword ());
            int type=userService.findUserType (userVo.getUname(),userVo.getUpassword());
            Subject subject = SecurityUtils.getSubject ();
            session.setAttribute("uname",userVo.getUname());
            subject.login (token);
                if (subject.isAuthenticated ()) {
                    if(type==4){
                        return "index";
                    }else {
                        List<JdRoom> jdRoom =roomService.selectRoom ();
                        model.addAttribute ( "room",jdRoom );
                        model.addAttribute ("userName",userVo.getUname () );
                        return "index2";
                    }
                }
            }catch(AuthenticationException e){
                logger.info ("认证失败！");
            }
        return "login";
    }

    @RequestMapping("/unauth")/*无权访问时显示界面*/
    public String showUnAuth(){
        return "unauth";
    }

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String userInsert(Model model){
        List<JdUser> jdUsers = userService.selectByExample ();
        model.addAttribute ( "user",jdUsers );
        return "tables";
    }

    @RequiresPermissions ( value = {"role_list"})
    @RequestMapping(value = "/findPermission",method = RequestMethod.GET)
    public String findPermission(Model model){
        List<JdUser> permission = userService.findPermission ();
        model.addAttribute ("permissions",permission);
        return "jurisdiction";
    }
    //注册
    @RequestMapping(value = "insert")
    public String insert(JdUser jdUser){
        userService.insert(jdUser);
        logger.info("jduser"+jdUser);

        return "login";
    }

    //查房间信息
    @RequestMapping(value = "roomselect",method = RequestMethod.GET)
    public String selectByExample3(Model model){
        List<JdRoom> users=userService.roomselect();
        logger.info(users+"+=======================================================");
        //  ResponseEntity responseEntity = new ResponseEntity(users, HttpStatus.OK);
        model.addAttribute("result3",users);
        return "roomManager";
    }
    //全查用户信息
    @RequestMapping(value = "/userselect",method = RequestMethod.GET)
    public String selectByExample(Model model){
        List<JdUser> users=userService.selectByExample();
        //  ResponseEntity responseEntity = new ResponseEntity(users, HttpStatus.OK);
        model.addAttribute("result",users);
        return "userManager";
    }
    //全查职工信息
    @RequestMapping(value = "/userselect2",method = RequestMethod.GET)

    public String selectByExample2(Model model){
        List<JdUser> users=userService.selectByExample2();
        //  ResponseEntity responseEntity = new ResponseEntity(users, HttpStatus.OK);
        model.addAttribute("result2",users);
        return "staffManager";
    }



    //删除用户信息
    @RequiresPermissions ( value = {"user_add"})
    @RequestMapping("userdelete")
    public String deleteUserById(int uid){
        userService.deleteUserById(uid);
        return "redirect:userselect";
    }

    //跳转修改页面
    @RequiresPermissions ( value = {"user_update"})
    @RequestMapping("/update")
    public String updatepage(int uid,Model model){
        JdUser jdUser =userService.selectUserById(uid);
        model.addAttribute("user",jdUser);
        logger.info(uid);
        logger.info(jdUser);
        return "updatepage";
    }

    //修改用户信息
    @RequestMapping("userupdate")
    public String updateByPrimaryKeySelective(JdUser jdUser){
        logger.info(jdUser);
        boolean b = userService.updateByPrimaryKeySelective(jdUser);
        logger.info(b+"=======================");
        return "redirect:userselect";
    }

    //跳转员工修改页面
    @RequiresPermissions ( value = {"staff_update"})
    @RequestMapping("staffupdatepage")
    public String updatepage2(int uid,Model model){
        JdUser jdUser =userService.selectUserById(uid);
        model.addAttribute("user",jdUser);
        logger.info(uid);
        logger.info(jdUser);
        return "updatepage2";
    }

    //修改用户信息
    @RequestMapping("staffupdate")
    public String updateByPrimaryKeySelective2(JdUser jdUser){
        logger.info(jdUser);
        boolean b = userService.updateByPrimaryKeySelective(jdUser);
        logger.info(b+"=======================");
        return "redirect:userselect2";
    }

    //跳转员工权限修改页面
    @RequiresPermissions ( value = {"staff_update"})
    @RequestMapping("staffupdatepage2")
    public String updatestaff(int uid,Model model){
        JdUser jdUser =userService.selectUserById(uid);
        model.addAttribute("user",jdUser);
        logger.info(uid);
        logger.info(jdUser);
        return "updatepage3";
    }

    //修改用户权限信息
    @RequestMapping("staffupdate2")
    public String updateStaff(JdUser jdUser){
        logger.info(jdUser);
        boolean b = userService.updateStaff(jdUser);
        logger.info(b+"=======================");
        return "redirect:userselect2";
    }


    //清除用户登陆
    @RequestMapping("outlogin")
    public String outlogin(HttpSession session){
        try {
            Subject subject=SecurityUtils.getSubject();
            subject.logout();
            session.removeAttribute("uname");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "index";
    }

    @RequestMapping("/zengJia")
    public String zengJia(@RequestParam("uid") int uid, @RequestParam("rid") int rid, Model model){
        System.out.println("=================4talkjhjdgasigd===============================");
        userService.addRoleName(uid,rid);
        List<JdUser> userRole=userService.assignRole(uid);
        model.addAttribute("userRole",userRole);
        List<JdUser> notUserRole=userService.notAssignRole(uid);
        model.addAttribute("notUserRole",notUserRole);
        model.addAttribute("uid",uid);
        return "assignRole";
    }

    @RequestMapping("/jianShao")
    public String jianShao(@RequestParam ("userId") int uid,@RequestParam("roleId") int rid,Model model){
        System.out.println("==========adjka=============");
        userService.deleteRoleName(uid,rid);
        List<JdUser> userRole=userService.assignRole(uid);
        model.addAttribute("userRole",userRole);
        List<JdUser> notUserRole=userService.notAssignRole(uid);
        model.addAttribute("notUserRole",notUserRole);
        model.addAttribute("uid",uid);
        return "assignRole";
    }







}
