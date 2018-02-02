/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2.threads;

/**
 *
 * @author KnaldeKalle
 */
public class Exercise4 {

    String str1 = "Java";
    String str2 = "UNIX";
    Thread trd1 = new Thread("My Thread 1") {
        public void run() {
            while (true) {
                synchronized (str1) {
                    synchronized (str2) {
                        System.out.println(str1 + str2);
                    }
                }
            }
        }
    };

    Thread trd2 = new Thread("My Thread 2") {
        public void run() {
            while (true) {
                synchronized (str2) {
                    synchronized (str1) {
                        System.out.println(str2 + str1);
                    }
                }
            }
        }
    };

    public static void main(String a[]) {
        Exercise4 mdl = new Exercise4();
        mdl.trd1.start();
        mdl.trd2.start();
    }
}
