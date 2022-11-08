package com.crud.BasicCrud.service;

import com.crud.BasicCrud.model.PaymentModel;
import com.crud.BasicCrud.repository.BookRepository;
import com.crud.BasicCrud.repository.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl {

    @Autowired
    private BookRepository brepo;

    @Autowired
    private PaymentRepo prepo;

//    public PaymentModel payment();
}
