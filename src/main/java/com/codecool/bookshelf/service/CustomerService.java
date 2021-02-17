package com.codecool.bookshelf.service;

import com.codecool.bookshelf.dao.CustomerDao;
import com.codecool.bookshelf.model.user.Customer;
import com.codecool.bookshelf.model.feedback.Opinion;

import java.util.Date;
import java.util.Optional;

public class CustomerService {

    private Customer customer;
    private CustomerDao customerDao;

    public CustomerService(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public void newCustomer(Customer customer) {
        customerDao.addCustomer(customer);
    }

    public void addOpinionToCustomer(long customerId, long bookId, String opinion) {
        Customer customer = customerDao.findById(customerId);
        Optional<Opinion> oldOpinion = customerDao.findOpinionOfBook(customerId, bookId);
        if (oldOpinion.isPresent()) {
            customer.setOpinion(oldOpinion.get().setOpinion(opinion));
        } else {
            Opinion newOpinion = new Opinion(bookId, customerId, 1, opinion);
            customer.addOpinion(newOpinion);
        }
        customerDao.updateCustomer(customer);
    }



}
