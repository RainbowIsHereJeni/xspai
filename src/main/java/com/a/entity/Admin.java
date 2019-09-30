package com.a.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Admin {
    private Integer id;
    private String a_name;
    private String a_password;
    private String a_sex;
    private String a_email;
    private Integer a_phone;
    private Integer a_is_delete;
}
