package com.qf.demo.config;


import com.qf.demo.shiro.MyShiroRealm;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class ShiroConfig {

    @Bean
    public ShiroFilterFactoryBean shiroFilterFactoryBean(@Qualifier("securityManager") DefaultWebSecurityManager securityManager){
        ShiroFilterFactoryBean filterFactoryBean=new ShiroFilterFactoryBean ();
        /*配置安全管理器*/
        filterFactoryBean.setSecurityManager (securityManager);
        /*设置shiro鉴权的过滤链*/
        Map<String, String> map = new HashMap<> ();
        map.put ("/index2","authc");/*必须登录后，方可访问*/
        map.put ("/cart","authc");
        map.put("/orderselect2","authc");
        filterFactoryBean.setFilterChainDefinitionMap (map);
        filterFactoryBean.setLoginUrl ("/login");//设置登录页
        filterFactoryBean.setUnauthorizedUrl ("/unauth");//权限不足提示页
        return filterFactoryBean;
    }

    /*创建shiro的安全管理器*/
    @Bean("securityManager")
    public DefaultWebSecurityManager webSecurityManager(@Qualifier("myRealm")AuthorizingRealm myRealm){
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager ();
        securityManager.setRealm (myRealm);
        return securityManager;
    }

    @Bean("myRealm")/*自定义认证授权的安全策略*/
    public MyShiroRealm getMyShiroRealm(){
        return new MyShiroRealm ();
    }
    /**
     * 开启Shiro注解(如@RequiresRoles,@RequiresPermissions),
     * 需借助SpringAOP扫描使用Shiro注解的类,并在必要时进行安全逻辑验证
     * 配置以下两个bean(DefaultAdvisorAutoProxyCreator和AuthorizationAttributeSourceAdvisor)
     */
    @Bean
    public DefaultAdvisorAutoProxyCreator autoProxyCreator(){
        DefaultAdvisorAutoProxyCreator proxyCreator=new DefaultAdvisorAutoProxyCreator ();
        proxyCreator.setProxyTargetClass (true);
        return proxyCreator;
    }

    /*开启AOP注解支持*/
    @Bean
    public AuthorizationAttributeSourceAdvisor attributeSourceAdvisor(DefaultWebSecurityManager webSecurityManager){
        AuthorizationAttributeSourceAdvisor sourceAdvisor=new AuthorizationAttributeSourceAdvisor ();
        sourceAdvisor.setSecurityManager (webSecurityManager);
        return sourceAdvisor;
    }
}
