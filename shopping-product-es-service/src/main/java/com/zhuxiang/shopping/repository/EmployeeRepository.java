package com.zhuxiang.shopping.repository;

import com.zhuxiang.shopping.entity.Employee;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

/**
 * @author: zhuxiang
 * @date: 2018/9/14 15:15
 * @description:
 */
@Component
public interface EmployeeRepository extends ElasticsearchRepository<Employee,String> {
    Employee queryEmployeeById(String id);
}
