package com.didispace.bean;

import com.fasterxml.jackson.annotation.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

@JsonIgnoreProperties("address")
@Component
public class Student {
    @JsonProperty("name")
    String username;

    Integer age;

    String address;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    Date birthday;

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
