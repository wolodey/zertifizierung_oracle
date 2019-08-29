package TestPackage.Kapitel6.Aufgabe7;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by WSteinle on 31.01.2017.
 */
public class DoSomething {
    public void go() {
        System.out.print("A");
        try {
            stop();
        } catch (ArithmeticException e){
            System.out.print("B");
        } finally {
            System.out.print("C");
        }
        System.out.print("D");
    }


    public void stop() {
        System.out.print("E");
        Object x = null;
        x.toString();
        System.out.print("F");
    }

    public static void main(String[] args) {
        new DoSomething().go();
    }
}