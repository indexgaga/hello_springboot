package com.didispace.web;

import com.didispace.bean.Student;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JacksonDemo01 {
    Student student = new Student();

    @RequestMapping("/jackson01")
    public String getJson() throws JsonProcessingException {
        student.setUsername("小明");
        ObjectMapper map = new ObjectMapper();
        String json = map.writeValueAsString(student);
        return json;

    }
}
