package com.example.service;

import com.example.domain.Customer;

import java.util.Optional;

/**
 * 客户表 业务处理接口
 *
 * @author Roger
 * @email 190642964@qq.com
 * @create 2018-6-19 12:08:21
 */
public interface CustomerService{

    Optional<Customer> find(Long primaryKey);
}