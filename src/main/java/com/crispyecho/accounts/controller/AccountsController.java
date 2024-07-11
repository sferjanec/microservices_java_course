package com.crispyecho.accounts.controller;

import com.crispyecho.accounts.AccountsConstants;
import com.crispyecho.accounts.dto.CustomerDto;
import com.crispyecho.accounts.dto.ResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/", produces = {MediaType.APPLICATION_JSON_VALUE})
public class AccountsController {

    @PostMapping("/create")
    public ResponseEntity<ResponseDto> createAccount(@RequestBody CustomerDto customerDto) {

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new ResponseDto(AccountsConstants.STATUS_201, AccountsConstants.MESSAGE_201));

    }
}
