public class CustomGenerics {
    public <E> void display(E e){
        System.out.println("Single Element Displaying...!!"+" "+e);
    }

    public <K,V> void display(K key,V value){
        System.out.println("Two Elements are Displaying...!!"+" "+key+" "+value);
        if(key.equals(value)){
            System.out.println("trueeee");
        }else{
            System.out.println("false");
        }
    }

    public <K,V,T> void display(K key,V value,T third){
        System.out.println("Three Elements are Displaying....!!"+" "+key+" "+value+" "+third);
    }

}
