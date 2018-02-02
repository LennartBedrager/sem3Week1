
package examPrep_ProducerConsumer;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Tester {

    public static void main(String[] args) throws InterruptedException {
    
        int size = 40;
    ArrayBlockingQueue<Long> s1 = new ArrayBlockingQueue(size);
    ArrayBlockingQueue<Long> s2 = new ArrayBlockingQueue(size);
        
    ExecutorService es = Executors.newCachedThreadPool();
    
    new Thread(()->{
        
        for (int i = 0; i<=10;i++){
            Long n = ThreadLocalRandom.current().nextLong(50);
            s1.add(n);
        }
    }).start();
    
    es.execute(new Producer(s1,s2));
    es.execute(new Consumer(s2));
    es.shutdown();
    es.awaitTermination(5,TimeUnit.SECONDS);
    System.out.println("Closing Down");
    System.out.println("this is s2 in main" + s2.toString());

        
    }
    
}
