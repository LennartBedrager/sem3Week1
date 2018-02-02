/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3.threads;

/**
 *
 * @author KnaldeKalle
 */
public class Recap /* implements Runnable*/{
    

/*
    MutableInteger mi;
    
    public Recap(MutableInteger mi){
        this.mi = mi;
    }
    
    @Override
    public void run() {
        //what ever, men her har du afgang til MutableInteger
        //Læs op på runnable
    }
    Eksempel hvis vi havde en MutableInteger klasse, og vil have adgang til attributes inde i vores run.
    (så bruger vi en constructor)
    
    
    
    /*
    
    How do we tell java that code should run in a thread:
    Vi sætter koden ind i en runnable og søger for at en thread handler den.
    
    The purpose of the thread.join()
    En thread joiner, altså thread1.join() / her venter main på thread1.
    
    Why do we use threads:
    Hurtigere(performance), responsivt(responsiveness - f.eks at du kan trykke stop mens noget kører)
    
    What are the race conditions and how can we fix them?
    Når vores programs udfald afhænger af rækkefølden processorne kører programmet på(uden af du vil have det)
    F.eks hvis de overlapper hinaden(se incrementer code)
    
    Exsplain how Threads can help us in making responsive User Interfaces
    
    
    deadlocks:
    Når flere tråde er afhængeige af at vente på hinaden før de hver kan fortsætte -> sidder de fast
    
    How do we detect, avoid and/or fix them:
    Der er fire ting der skal være til stede for at få en deadlock, 
    så skriv kun kode hvor der er 3 af dem til stede.
    
        Synchronized
            Låser på:   
                - ved static låser den på klassen, ellers på this
                    ved synchronized(...){
                     } ville den låse på det "..."
    
                        *Når noget bliver låst kan det stadig manipuleres af andet der ikke prøver at låse først.
    
                        Et objekt der er låst kan stadig ændres af andre ting der ikke tager sammme lås
    
    
    
    Reentrant lock er når den samme thread tager lås på den samme ting flere gange. og dette er tilldat
   
    
    */
}
