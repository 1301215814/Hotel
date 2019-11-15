package com.qf.demo.shiro;

import com.qf.demo.pojo.JdPermission;
import com.qf.demo.pojo.JdUser;
import com.qf.demo.service.JdPermissionService;
import com.qf.demo.service.JdUserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyShiroRealm extends AuthorizingRealm{
    public static final Logger logger= LogManager.getLogger(MyShiroRealm.class);
    /*注入业务对象*/
    @Autowired
    private JdUserService userService;
    @Autowired
    private JdPermissionService permissionService;


    @Override/*授权*/
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String  principal=(String) principalCollection.getPrimaryPrincipal ();
        logger.info (principal);
        List<JdPermission> permByLoginName = permissionService.findPermByLoginName (principal);
        if(permByLoginName!=null){
            Set<String> perms = new HashSet<> ();
            for (JdPermission perm:permByLoginName){
                perms.add (perm.getPerName ());
                logger.info (perm);
            }
            SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo ();
            authorizationInfo.setStringPermissions (perms);
            return authorizationInfo;
        }
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
       /*获取用户信息*/
        String principal = (String)token.getPrincipal ();
        JdUser jdUser = userService.findUserByName (principal);
        if(jdUser!=null){
            String pw=jdUser.getUpassword ();
            SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo (principal,pw,this.getName ());
            return authenticationInfo;
        }
        return null;
    }
}
