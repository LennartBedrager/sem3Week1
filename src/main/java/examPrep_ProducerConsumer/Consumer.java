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
public class Consumer implements Runnable{

 
BlockingQueue<Long> s2;   

    public Consumer(BlockingQueue<Long> s2){
        this.s2 = s2;
    }

    
    @Override
    public void run() {
        
        boolean moreToConsume = true;
        Long sum = 0L;
        
        while(moreToConsume){
            try{
                Long num = s2.take();
                
                if(num != null){
                    sum += num;
                    System.out.println("FibNumber: "+num);
                    
                }else{
                    moreToConsume = false;
                }
                
            }catch(Exception e){
                System.out.println("ERROR: CONSUMER!");
            }
        }
        System.out.println(sum);
    }
    
    
    
}
