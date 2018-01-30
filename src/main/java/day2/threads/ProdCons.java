/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2.threads;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import sun.security.provider.NativePRNG;

/**
 *
 * @author KnaldeKalle
 */
public class ProdCons{
    
    static BlockingQueue<Integer> sharedQueue = new ArrayBlockingQueue<Integer>(5);

       static Runnable producer = ()-> {
            try{
            Random rnd = new Random();
            int rndnum = rnd.nextInt();
            sharedQueue.put(rndnum);
            }catch(Exception e){
                System.out.println("Mistakes");
            }
        };
        
        
    static Runnable consumer = ()->{
        try{
            int num = sharedQueue.take();
            System.out.println(Math.sqrt(num));
        }catch(Exception e){
            System.out.println("Mistakes, consumer");
        }
    };
    
    
    public static void main(String[] args) {
   
       
            
            int size = 10;
            Thread[] producers = new Thread[size];
            Thread[] consumers = new Thread[size];
            
            for(int i = 0; i<size;i++){
                consumers[i] = new Thread(consumer);
                producers[i] = new Thread(producer);
                
                
            }
            
            for(Thread t : consumers){
                t.start();
            }
            for(Thread t : producers){
                t.start();
            }
        
    }
    

}
