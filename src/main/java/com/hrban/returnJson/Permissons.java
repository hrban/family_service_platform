package com.hrban.returnJson;

import java.util.List;

public class Permissons {

    private List<Permission> permissionList;

    public List<Permission> getPermissionList() {
        return permissionList;
    }

    public void setPermissionList(List<Permission> permissionList) {
        this.permissionList = permissionList;
    }

    @Override
    public String toString() {
        return "Permissons{" +
                "permissionList=" + permissionList +
                '}';
    }
}
