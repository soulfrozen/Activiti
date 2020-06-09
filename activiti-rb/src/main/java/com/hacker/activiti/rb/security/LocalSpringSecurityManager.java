package com.hacker.activiti.rb.security;

import org.activiti.api.runtime.shared.security.SecurityManager;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import java.util.Base64;

@Component
public class LocalSpringSecurityManager implements SecurityManager {
    public LocalSpringSecurityManager() {
    }

    public String getAuthenticatedUserId() {
        return SecurityContextHolder.getContext().getAuthentication() == null ? "" : SecurityContextHolder.getContext().getAuthentication().getName();
    }

    public static void main(String[] args) {
        System.out.println(Base64.getEncoder().encodeToString("admin:admin".getBytes()));
    }
}