package com.nml.producerconsumer.solutionusinglock;

/**
 * Created by NicolasLopez on 25/07/2017.
 *
 * Java Program to demonstrate how to use Lock and Condition variable in Java by solving Productor consumer problem.
 *
 * Locks are more flexible way to provide * mutual exclusion and synchronization in Java, a powerful alternative of
 * synchronized keyword.
 *
 */
public class ProducerConsumerSolutionUsingLock {

    public static void main(String[] arg){

        // Object on which producer and consumer thread will operate.
        ProducerConsumerImpl sharedObject = new ProducerConsumerImpl();

        // creating producer and consumer threads.
        Productor p = new Productor(sharedObject);
        Consumidor c = new Consumidor(sharedObject);

        // starting producer and consumer threads.
        p.start();
        c.start();

    }
}
