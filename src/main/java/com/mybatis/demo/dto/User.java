package com.mybatis.demo.dto;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import lombok.Data;

@Data
public class User {
    private Integer id;

    private String name;
    private String sex;
    private String age;

    private String address;

    @JsonIgnore
    private String passWord;
}
