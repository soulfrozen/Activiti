package com.hacker.activiti.rb.identity;

import org.activiti.api.runtime.shared.identity.UserGroupManager;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ActivitiUserGroupManagerImpl implements UserGroupManager {

    private final UserDetailsService userDetailsService;

    public ActivitiUserGroupManagerImpl(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    @Override
    public List<String> getUserGroups(String username) {

        return userDetailsService.loadUserByUsername(username).getAuthorities().stream()
                .filter((GrantedAuthority a) -> a.getAuthority().startsWith("GROUP_"))
                .map((GrantedAuthority a) -> a.getAuthority().substring(6))
                .collect(Collectors.toList());
    }

    @Override
    public List<String> getUserRoles(String username) {
        return userDetailsService.loadUserByUsername(username).getAuthorities().stream()
                .filter((GrantedAuthority a) -> a.getAuthority().startsWith("ROLE_"))
                .map((GrantedAuthority a) -> a.getAuthority().substring(5))
                .collect(Collectors.toList());
    }

    @Override
    public List<String> getGroups() {
        return Arrays.asList("ACTIVITI_USER", "ACTIVITI_ADMIN");
    }

    @Override
    public List<String> getUsers() {
        // TODO
        return null;
    }
}
