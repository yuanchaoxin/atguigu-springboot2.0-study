package com.ityuan.boot.bean;

import javafx.scene.effect.SepiaTone;
import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName Person
 * @Package com.ityuan.boot.bean
 * @Author yuanchaoxin
 * @Date 2021/6/29
 * @Version 1.0
 * @Description 测试yml中各种数据类型的配置
 */
@ConfigurationProperties("person")
@Component
@Data
@ToString
public class Person {
    private String userName;
    private String password;
    private Boolean boss;
    private Date birth;
    private Integer age;
    private Pet pet;
    private String[] interests;
    private List<String> animal;
    private Map<String, Object> score;
    private Set<Double> salary;
    private Map<String, List<Pet>> allPets;
}
