package com.yourcompany.interfaces;

import com.yourcompany.entities.Customer;

public interface QueueBehaviour {
    void takeInQueue(Customer customer);
    void releaseFromQueue();
    void takeOrder();
    void giveOrder();
}

