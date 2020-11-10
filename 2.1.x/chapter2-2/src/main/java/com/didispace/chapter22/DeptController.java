package com.didispace.chapter22;

import io.swagger.annotations.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;


@Api(tags = "雇员管理")
@RestController
@RequestMapping("/dept")
public class DeptController {
    //创建线程安全的map
    Map<Integer,String> map = Collections.synchronizedMap(new HashMap<>());

    @ApiOperation("获取雇员列表")
    @GetMapping("/")
    public List<Dept> getDepts(){
        List<Dept> list = new ArrayList<>();
        return list;
    }

    @ApiOperation("添加雇员")
    @PostMapping("/")
    public String addDept(@ApiParam("要添加的雇员")  @RequestBody Dept dept){
        return "success";
    }




}
