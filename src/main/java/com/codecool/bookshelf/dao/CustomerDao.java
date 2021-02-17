package com.codecool.bookshelf.dao;

import com.codecool.bookshelf.model.feedback.Opinion;
import com.codecool.bookshelf.model.user.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerDao {
    public void addCustomer(Customer customer);
    public Customer findById(long id);
    public Optional<Opinion> findOpinionOfBook(long customerId, long bookId);
    public Customer findCustomerByCustomerNameAndEmail(String name, String email);
    public void updateCustomer(Customer customer);
}
