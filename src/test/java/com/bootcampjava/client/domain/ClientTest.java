package com.bootcampjava.client.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    Client client;
    Fund fund;

    @BeforeEach
    void startMethod(){
        System.out.println("start");
        fund = new Fund(1l,"Habitat");
        client = new Client(1l,"70125463","Juan","Perez","987456321","juan@mail.com",fund);
    }


    @Test
    void testClient() {
        String name = "Juan";
        String nameReal = client.getName();
        Assertions.assertNotEquals(name,nameReal);

        Assertions.assertNotNull(client.getPhone(),()->"Id'nt phone.");

    }

    @Test
    void compareRef() {
        fund = new Fund(1l,"Habitat");
        client = new Client(2l,"70125463","Juan","Perez","987456321","juan@mail.com",fund);
        Client client2 = new Client(2l,"70125463","Juan","Perez","987456321","juan@mail.com",fund);
        Assertions.assertNotEquals(client,client2);
    }
}