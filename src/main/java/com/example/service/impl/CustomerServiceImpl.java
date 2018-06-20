package com.example.service.impl;

import com.example.domain.Customer;
import com.example.repository.CustomerRepository;
import com.example.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * 客户表 业务处理实现
 *
 * @author Roger
 * @email 190642964@qq.com
 * @create 2018-6-19 12:08:21
 */
@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Optional<Customer> find(Long primaryKey){
        return customerRepository.findById(primaryKey);
    }
}