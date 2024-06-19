package com.yourcompany;

import com.yourcompany.market.Market;
import com.yourcompany.entities.Customer;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();

        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");
        Customer customer3 = new Customer("Charlie");

        market.acceptCustomer(customer1);
        market.acceptCustomer(customer2);
        market.acceptCustomer(customer3);

        market.update();
        market.update();

        market.releaseCustomer(customer1);
        market.releaseCustomer(customer2);
        market.releaseCustomer(customer3);
    }
}

