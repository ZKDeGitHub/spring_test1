package com.edu.day0705.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * @Author zk
 * @Date 2023/7/5 15:50
 * @注释：
 * @since 11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private long id;
    private String userName;
    private LocalDate birthday;
    private String gender;
    private String address;
}
