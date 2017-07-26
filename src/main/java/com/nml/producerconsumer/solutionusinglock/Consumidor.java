package com.nml.producerconsumer.solutionusinglock;

/**
 * Created by NicolasLopez on 26/07/2017.
 */
public class Consumidor extends Thread {

    ProducerConsumerImpl producerConsumer;

    public Consumidor(ProducerConsumerImpl sharedObject){
        super("CONSUMER");
        this.producerConsumer = sharedObject;
    }

    @Override
    public void run(){
        try{
            producerConsumer.get();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
