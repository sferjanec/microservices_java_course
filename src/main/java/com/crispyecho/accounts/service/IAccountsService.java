package com.crispyecho.accounts.service;

import com.crispyecho.accounts.dto.CustomerDto;

public interface IAccountsService {

    /**
     *
     * @param customerDto CustomerDto Object
     */
    void createAccount(CustomerDto customerDto);
}
