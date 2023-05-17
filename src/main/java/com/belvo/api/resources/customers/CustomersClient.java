package com.belvo.api.resources.customers;

import com.belvo.api.resources.customers.requests.ListCustomersRequest;
import com.belvo.api.types.CreateCustomerRequest;
import com.belvo.api.types.CreateCustomerResponse;
import com.belvo.api.types.CustomerPaginatedResponse;
import com.belvo.api.types.DetailCustomerResponse;
import java.lang.String;

public interface CustomersClient {
  CustomerPaginatedResponse listCustomers(ListCustomersRequest request);

  CreateCustomerResponse createCustomer(CreateCustomerRequest request);

  DetailCustomerResponse detailCustomer(String id);
}
