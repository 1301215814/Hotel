package com.qf.demo.controller;


import com.qf.demo.pojo.JdPermission;
import com.qf.demo.service.JdPermissionService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class PermissionController {
    public static final Logger logger= LogManager.getLogger(PermissionController.class);

    @Autowired
    private JdPermissionService permissionService;

    @RequiresPermissions( value = {"role_list"})
    @RequestMapping(value = "/findper")
    public String updatePermission(@RequestParam("uid") int uid, Model model){
        List<JdPermission> permission = permissionService.findPermissionById (uid);
        List<JdPermission> notPermission = permissionService.findNotPermissionById ( uid );
        model.addAttribute ("permissions",permission);
        model.addAttribute ("notper",notPermission);
        model.addAttribute ("userId",uid);
        return "permission";
    }
}
