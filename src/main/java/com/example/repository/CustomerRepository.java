package com.example.repository;

import com.example.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
* 客户表
*
* @author Roger
* @email 190642964@qq.com
* @create 2018-6-19 12:08:21
*/
public interface CustomerRepository extends JpaRepository<Customer,Long> {

}