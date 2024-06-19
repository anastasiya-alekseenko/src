package com.yourcompany.interfaces;

import com.yourcompany.entities.Customer;

public interface MarketBehaviour {
    void acceptCustomer(Customer customer);
    void releaseCustomer(Customer customer);
    void update();
}


