
public class Main{
    public static void main(String[] args) {
//   Printer printer1=new Printer("surjith");
//   Printer printer2=new Printer(23); => these two lines shows an error why coz
//   these are the thing not bound on the Animal Class Object [printer generics extends animal]
// So those are the classes who extends the animal[parent] class those all the objects would be accepted
        Printer printer1=new Printer(new Cat());
        Printer printer2=new Printer(new Animal());
        Printer printer3=new Printer(new Dog());
        test(printer1,printer2);
        Printer<Dog> obj=new Printer<>(new Dog());
        printer1.get();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        printer2.get();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        printer3.get();
    }

    public static void test(Printer p1, Printer p2){
        System.out.println(p1.getInstance().getClass().getName());
    }
}
