package com.crispyecho.accounts.service;

import com.crispyecho.accounts.dto.CustomerDto;
import com.crispyecho.accounts.entity.Customer;
import com.crispyecho.accounts.mapper.CustomerMapper;
import com.crispyecho.accounts.repository.AccountsRepository;
import com.crispyecho.accounts.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountsServiceImpl implements IAccountsService {

    private AccountsRepository accountsRepository;
    private CustomerRepository customerRepository;

    /**
     * @param customerDto - CustomerDto object
     */
    @Override
    public void createAccount(CustomerDto customerDto) {
        Customer customer = CustomerMapper.mapToCustomer(customerDto, new Customer());
        Customer savedCustomer = customerRepository.save(customer);
       // accountsRepository.save();


    }

}
