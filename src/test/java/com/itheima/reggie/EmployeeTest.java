package com.itheima.reggie;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.itheima.reggie.entity.Employee;
import com.itheima.reggie.service.EmployeeService;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.time.LocalDateTime;

/**
 * @Author: Lizhixiang
 * @Date: 2023/1/13
 * @Time: 12:41
 * @Description:
 * @Version:
 */
@SpringBootTest
@Slf4j
public class EmployeeTest {

    @Resource
    EmployeeService employeeService;

    @Test
    void test1(){
        Employee employee = new Employee();
        employee.setUsername("admin");
        LambdaQueryWrapper<Employee> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(Employee::getUsername,employee.getUsername());
        Employee emp = employeeService.getOne(wrapper);
    }


}