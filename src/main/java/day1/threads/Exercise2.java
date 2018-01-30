/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1.threads;

/**
 *
 * @author KnaldeKalle
 */
public class Exercise2 {
    
    static int n = 1;
    static int size= 2;

     static Runnable producer = ()-> {
         int num = n;
         n++;
         for(int i=0;i<num*100;i++){
             System.out.println("n"+n+": "+i);
         }
            System.out.println("DUD");
        };

    public static void main(String[] args) {
        
        
        Thread[] producers = new Thread[size];
        
         for(int i = 0; i<n;i++){
                
                producers[i] = new Thread(producer);
                
                
            }
            
            for(Thread t : producers){
                t.start();
            }
        
        
        /*Exercise 2 
        Write a function that takes an int n as parameter,
        and creates n threads, running at the same time.
        Each thread 1,..(n-1),n should print the numbers from 1 to n*100,
        including the “thread id” (n) on each line.*/
        
        
        
        
        /*a) describe the output. Is it what you expected?*/
        
        
        /*b) If the threads do not interleave, can you make them, 
        by making the threads sleep for a short period of time? (think milliseconds).*/

        
        
        
        
    }
    
    
    
}
