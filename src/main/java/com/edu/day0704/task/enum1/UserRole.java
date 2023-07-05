package com.edu.day0704.task.enum1;

/**
 * @Author zk
 * @Date 2023/7/5 14:33
 * @注释：用户权限分级
 * @since 11
 */
public enum UserRole {
    CUSTOM(1000,"普通用户"),
    ADMIN(2000,"管理员");

    private int id;
    private String name;

    UserRole(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
