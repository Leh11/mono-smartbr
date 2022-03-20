package com.bioksam.smarbr;

import jakarta.faces.view.ViewScoped;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named("dtPaginatorView")
@ViewScoped
public class PaginatorView implements Serializable {

    /*private List<Customer> customers;

    @Inject
    private CustomerService service;

    @PostConstruct
    public void init() {
        customers = service.getCustomers(50);
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setService(CustomerService service) {
        this.service = service;
    }*/
}