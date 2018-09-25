package com.zhuxiang.shopping.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

import java.io.Serializable;

/**
 * @author: zhuxiang
 * @date: 2018/9/14 15:11
 * @description:
 */
@Data
@Document(indexName = "megacorp",
        type = "employee",
        shards = 1,
        replicas = 0,
        refreshInterval = "1")
public class Employee implements Serializable {
    @Id
    private String id;
    @Field
    private String firstName;
    @Field
    private String lastName;
    @Field
    private Integer age = 0;
    @Field
    private String about;

}
