/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examPrep_ProducerConsumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author KnaldeKalle
 */
public class Producer implements Runnable{

BlockingQueue<Long> s1;   
BlockingQueue<Long> s2;   

    public Producer(BlockingQueue<Long> s1, BlockingQueue<Long> s2){
        this.s1 = s1;
        this.s2 = s2;
    }

    @Override
    public void run() {
        boolean moreToFecth = true;
        while (moreToFecth) {
            try {
                Long num = s1.poll(1, TimeUnit.SECONDS);
                
                if (num != null) {
                    s2.add(fib(num));
                
                } else {
                    moreToFecth = false;
                }
            } catch (Exception ex) {
                System.out.println("ERROR: PRODUCER!");
            }
        }
        System.out.println(s2.toString());
    }
    
    private Long fib(Long n){
        if((n == 0) || (n == 1)){
            return n;
        } else {
            return fib(n-1)+fib(n-2);
        }   
    }



}
