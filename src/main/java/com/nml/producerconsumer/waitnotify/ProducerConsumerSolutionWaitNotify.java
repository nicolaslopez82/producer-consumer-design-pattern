package com.nml.producerconsumer.waitnotify;

import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by NicolasLopez on 27/07/2017.
 *
 * Java program to solve Producer Consumer problem using wait and notify
 * method in Java. Producer Consumer is also a popular concurrency design pattern.
 *
 */
public class ProducerConsumerSolutionWaitNotify {

    public static void main(String[] arg){

        Vector sharedQueue = new Vector();
        int size = 4;

        Thread prodThread = new Thread( new Producer(sharedQueue, size), "Producer");
        Thread consThread = new Thread( new Consumer(sharedQueue, size), "Consumer");

        prodThread.start();
        consThread.start();

    }
}
