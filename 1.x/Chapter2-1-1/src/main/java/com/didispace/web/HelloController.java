package com.didispace.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author 程序猿DD
 * @version 1.0.0
 * @blog http://blog.didispace.com
 *
 */
@RestController
public class HelloController {
    @Value("${cn.qqncn.random.double}")
    Integer int1;

    @RequestMapping("/hello")
    public Object index() {
        Map<String,Integer> map = new HashMap<>();
        map.put("asd",int1);
        return map;
    }

}