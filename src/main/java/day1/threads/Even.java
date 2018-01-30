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
public class Even {
    
  private volatile boolean running; 
  private int n = 0;

    public Even() {
    running = true;
    }

    public boolean isRunning() {
        return running;
    }

    public synchronized int getN() {
        return n;
    }

    public void setRunning(boolean e) {
        this.running = e;
    }
  
  
  
  public synchronized int next()
  {
    n++;
    n++;
    return n;
  }


  
}

    
    
