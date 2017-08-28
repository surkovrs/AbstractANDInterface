package com.sbt.lesson2;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Bob", 123, 1000, 30);
        client1.greeting();
        client1.putCash("42301810252091234567");
        client1.getCash("40817810552097654321");
        client1.realPutCash(client1.outCash,100);


        Client client2 = new Client("Alice", 534, 2500, 500);
        client2.greeting();
        client2.putCash("42301810252095423324");
        client2.getCash("40817810552092542356");
        client2.realPutCash(client2.outCash, 100);

    }
}
