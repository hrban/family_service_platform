package com.hrban.returnJson;

public class UserInfo {

    private String name;
    private String avatar = "/avatar2.jpg";
    private Permissons role;

    public UserInfo() {
    }

    public UserInfo(String name, Permissons role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Permissons getRole() {
        return role;
    }

    public void setRole(Permissons role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "name='" + name + '\'' +
                ", avatar='" + avatar + '\'' +
                ", role=" + role +
                '}';
    }
}
