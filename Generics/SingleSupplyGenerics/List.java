public class List <E>{
    E e;
    List(E e){
        this.e=e;
    }

//    void set(E e){
//        this.e=e;
//    }

    E get(){
        return e;
    }
    public void display(){
        System.out.println(e);
    }
}
