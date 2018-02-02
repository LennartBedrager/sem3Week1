package day2.deadlock;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;



public class ResourceContainer {

  private final Lock lock1 = new ReentrantLock();
  private final Lock lock2 = new ReentrantLock();
  List<String> words = Collections.synchronizedList(new ArrayList<String>());
  List<Integer> numbers = Collections.synchronizedList(new ArrayList<Integer>());
  
  
  public synchronized List<String> getResourceWords() {
      lock1.lock();
      return words;
  }
  
  public void releaseResourceWords() {
     lock1.unlock();
  }
  
  public synchronized List<Integer> getResourceNumbers() {
      lock2.lock();
      return numbers;
  }
  
  public void releaseResourceNumbers() {
    lock2.unlock();
  }

}