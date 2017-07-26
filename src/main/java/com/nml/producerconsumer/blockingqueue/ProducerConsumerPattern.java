package com.nml.producerconsumer.blockingqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by NicolasLopez on 25/07/2017.
 *
 * BlockingQueue amazingly simplifies implementation of Producer-Consumer design pattern by providing out of box
 * support of blocking on put() and take().
 * BlockingQueque is an interface and Java 5 provides different implementation like ArrayBlockingQueue and LinkedBlockingQueue,
 * both implement FIFO order or elements, while ArrayLinkedQueue is bounded in nature LinkedBlockingQueue is optionally bounded.
 *
 * here is a complete code example of Producer Consumer pattern with BlockingQueue.
 * Compare it with classic wait notify code, its much simpler and easy to understand.
 *
 */
public class ProducerConsumerPattern {

    public static void main(String[] arg){

        //Creating shared object
        BlockingQueue sharedQueue = new LinkedBlockingQueue();

        //Creating com.nml.producerconsumer.blockingqueue.Producer and com.nml.producerconsumer.blockingqueue.Consumer Thread
        Thread prodThread = new Thread(new Producer(sharedQueue));
        Thread consThread = new Thread(new Consumer(sharedQueue));

        //Starting producer and com.nml.producerconsumer.blockingqueue.Consumer thread
        prodThread.start();
        consThread.start();
    }

}
