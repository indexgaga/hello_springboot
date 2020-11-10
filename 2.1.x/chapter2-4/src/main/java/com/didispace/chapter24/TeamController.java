package com.didispace.chapter24;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "4-足球队管理")
@RestController
@RequestMapping("/team")
public class TeamController {

    @ApiOperation("足球队列表")
    @RequestMapping("/")
    public String getTeam(){
        return "success";
    }

}
