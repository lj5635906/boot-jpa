package com.git;

import com.example.TkBootApplication;
import com.example.domain.BuildingPosition;
import com.example.domain.Customer;
import com.example.service.BuildingPositionService;
import com.example.service.CustomerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TkBootApplication.class)
public class TkBootApplicationTests {

	@Autowired
	private CustomerService customerService;

	@Test
	public void contextLoads() {

		Optional<Customer> customer = customerService.find(1L);
		System.out.println(customer.get());
		System.out.println();

	}

}
