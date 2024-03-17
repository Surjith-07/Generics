public class Map<K,V>{
    K key;
    V value;

    Map(K key,V value){
        this.key=key;
        this.value=value;
    }

//    void set(K key,V value){
//        this.key=key;
//        this.value=value;
//    }
    public void display(){
        System.out.println("key<--------->value\n"+key +"<--------->"+value+"\n");
    }
}
