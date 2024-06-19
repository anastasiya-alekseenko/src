package com.yourcompany.market;

import com.yourcompany.interfaces.QueueBehaviour;
import com.yourcompany.interfaces.MarketBehaviour;
import com.yourcompany.entities.Customer;

import java.util.LinkedList;
import java.util.Queue;

public class Market implements QueueBehaviour, MarketBehaviour {
    private Queue<Customer> queue;

    public Market() {
        this.queue = new LinkedList<>();
    }

    @Override
    public void takeInQueue(Customer customer) {
        System.out.println(customer.getName() + " is added to the queue.");
        queue.add(customer);
    }

    @Override
    public void releaseFromQueue() {
        Customer customer = queue.poll();
        if (customer != null) {
            System.out.println(customer.getName() + " is released from the queue.");
        }
    }

    @Override
    public void takeOrder() {
        for (Customer customer : queue) {
            if (!customer.hasOrder()) {
                customer.setOrder(true);
                System.out.println(customer.getName() + " has taken the order.");
                break;
            }
        }
    }

    @Override
    public void giveOrder() {
        for (Customer customer : queue) {
            if (customer.hasOrder()) {
                System.out.println(customer.getName() + " has received the order.");
                customer.setOrder(false);
                break;
            }
        }
    }

    @Override
    public void acceptCustomer(Customer customer) {
        System.out.println("Accepting " + customer.getName() + " into the market.");
        takeInQueue(customer);
    }

    @Override
    public void releaseCustomer(Customer customer) {
        System.out.println("Releasing " + customer.getName() + " from the market.");
        releaseFromQueue();
    }

    @Override
    public void update() {
        System.out.println("Market state is being updated.");
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }
}


