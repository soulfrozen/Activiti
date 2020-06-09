package com.hacker.activiti.audit.security;

import org.activiti.api.runtime.shared.security.SecurityManager;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
public class LocalSpringSecurityManager implements SecurityManager {
    public LocalSpringSecurityManager() {
    }

    public String getAuthenticatedUserId() {
        return SecurityContextHolder.getContext().getAuthentication() == null ? "" : SecurityContextHolder.getContext().getAuthentication().getName();
    }
}