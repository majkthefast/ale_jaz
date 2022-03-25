package pl.pjatk.mikpre;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

//@Component
public class MySecondComponent {

    public MySecondComponent(MyFirstComponent myFirstComponent){
        System.out.println("Hello from Second");
        myFirstComponent.printHelloMessage();

    }

    public void printSecondNames(){
        System.out.println("Hello from second method from second component");
    }
}
