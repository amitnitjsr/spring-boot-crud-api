package com.project.Spring.Service;

import com.project.Spring.DTO.CustomerDTO;
import com.project.Spring.DTO.CustomerSaveDTO;
import com.project.Spring.DTO.CustomerUpdateDTO;

import java.util.List;

public interface CustomerService {
    String addCustomer(CustomerSaveDTO customerSaveDTO);

    List<CustomerDTO> getAllCustomer();

    String updateCustomers(CustomerUpdateDTO customerUpdateDTO);

    boolean deleteCustomer(int id);
}
