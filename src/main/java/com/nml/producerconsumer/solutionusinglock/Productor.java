package com.nml.producerconsumer.solutionusinglock;

/**
 * Created by NicolasLopez on 26/07/2017.
 */
public class Productor extends Thread {

    ProducerConsumerImpl producerConsumer;

    public Productor(ProducerConsumerImpl sharedObject){
        super("PRODUCER");
        this.producerConsumer = sharedObject;
    }

    @Override
    public void run(){
        try{
            producerConsumer.put();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
