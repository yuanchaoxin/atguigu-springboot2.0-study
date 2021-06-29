package com.ityuan.boot.bean;

import lombok.Data;
import lombok.ToString;

/**
 * @ClassName Pet
 * @Package com.ityuan.boot.bean
 * @Author yuanchaoxin
 * @Date 2021/6/29
 * @Version 1.0
 * @Description 宠物类；用于测试yml中各种数据类型的配置
 */
@Data
@ToString
public class Pet {

    private String name;
    private Double weight;
}
