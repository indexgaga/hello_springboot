package com.didispace.chapter22;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel("雇员实体")
public class Dept {
    String deptName;
    Integer age;
}
