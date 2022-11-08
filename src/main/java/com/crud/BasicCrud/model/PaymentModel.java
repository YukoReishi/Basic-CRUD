package com.crud.BasicCrud.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PaymentModel {
    @Id
    private Long paymentid;
    private String cardno;
    private String amount;
    private int bid;
    private String bname;
}
