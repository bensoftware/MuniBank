package com.userFront.domain.security;

import org.springframework.security.core.GrantedAuthority;
/*
 * 
 *  @Ben Judicaelle@ Love Coding
 */
public class Authority implements GrantedAuthority{

    private final String authority;

    public Authority(String authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return authority;
    }
}
