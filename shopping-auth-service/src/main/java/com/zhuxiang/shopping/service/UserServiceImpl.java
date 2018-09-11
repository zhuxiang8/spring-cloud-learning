package com.zhuxiang.shopping.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author: zhuxiang
 * @date: 2018/9/11 09:36
 * @description:
 */
@Service
@Slf4j
public class UserServiceImpl implements UserDetailsService {
    /**
     * 校验用户登录
     */
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        log.info("登录名=【{}】", s);
        //封装角色
        Collection<GrantedAuthority> authorities = new ArrayList<>();

        SimpleGrantedAuthority authority = new SimpleGrantedAuthority("ADMIN");
        authorities.add(authority);

        //封装Security用户信息
        return new org.springframework.security.core.userdetails.User("user",
                "1232",
                authorities);

    }
}
