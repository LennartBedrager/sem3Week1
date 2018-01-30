/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1.threads;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KnaldeKalle
 */
public class Exercise1 {

    /**
     * @param args the command line arguments
     */
       static volatile boolean run = true;

    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        
        
        Thread t1 = new Thread(() -> {
            long total = 0;
            for (int i = 0; i < 1e9; i++) {
            total += i;
        }
        System.out.println("Total: " + total);
        });
        
        Thread t2 = new Thread(()-> {
                for (int i = 0; i < 5; i++) {
                    System.out.println("t2: " + i);
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Exercise1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
        
        Thread t3 = new Thread() { 
            long number = 10;
            
            @Override
            public void run() {

            while(run==true){
                
                System.out.println("t3 number: " +number++);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Exercise1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }
        }; 
        
        t1.start();
        t2.start();
        t3.start();
        
        sleep(10000);
        run=false;
        
    }
    /*
    a) Do you observe a need for synchronization techniques on any 
    of the threads in practise, or does your program work by accident?
    
        In the third senario we need to volatile/sync our boolean run.
        The thread has a local cached value of run, that doesnt update it.
    

    b) Regardless of whether you observe the problem 
    on your machine, we need to handle it.
    What is the problem I’m hinting at, and how can we solve it? (Since I’m such a Nice Guy™,
    here’s a hint: think about the VolatileExample class from the demo).

    
    
    c) argue that your solution is correct (argue, don’t prove)
    
    By makeing run volatile we force t3 to update from RAM and with that it get the updated value. 
    */
}
