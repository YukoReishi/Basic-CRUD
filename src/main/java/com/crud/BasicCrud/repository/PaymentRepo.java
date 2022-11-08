package com.crud.BasicCrud.repository;

import com.crud.BasicCrud.model.PaymentModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepo extends JpaRepository<PaymentModel, Long> {
}
