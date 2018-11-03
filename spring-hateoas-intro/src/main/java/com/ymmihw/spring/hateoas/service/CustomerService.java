package com.ymmihw.spring.hateoas.service;

import java.util.List;
import com.ymmihw.spring.hateoas.model.Customer;

public interface CustomerService {

  List<Customer> allCustomers();

  Customer getCustomerDetail(final String id);

}
