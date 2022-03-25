package pl.pjatk.mikpre;

import org.springframework.stereotype.Component;

//@Component
public class MyFirstComponent {

    public MyFirstComponent(){
        System.out.println("Hello from First");
    }

    public void printHelloMessage(){
        System.out.println("hello from first from method printHello");
    }

    public void printFirstNames(){
        System.out.println("Hello from first method from first component");
    }
}
