import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<String,Integer> map1=new Map<>("Surjith",2);
        Map map2=new Map(2,'d');
        Map<Object,Object> map=new Map<>("Sakthi",'e');
        map1.display();
        map2.display();

        //Getting the input from users
        String string=sc.next();
        long longValue=sc.nextLong();
        Main.createMap(string,longValue);
    }


    public static void createMap(String string,long longValue){
        Map map3=new Map(string,longValue);
        map3.display();
    }
}
