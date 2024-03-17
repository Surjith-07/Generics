import javax.lang.model.element.Element;
import java.io.Serializable;

public class Printer<E extends Animal>{ // Bounded Progress.....!!!
    E element;
    Printer(E element){
        this.element=element;
    }
    public E getInstance(){
        return this.element;
    }

    public void get(){
        System.out.println("This is "+element.getClass().getName()+" Class");
        element.eat();
    }
}
