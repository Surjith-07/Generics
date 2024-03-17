import java.util.*;

public class Main {
    static  CustomGenerics obj;
    public static void main(String[] args) {
        obj.getInteger(1000);
        List<Integer> list=new ArrayList<>();
        list.add(1000);
        obj.getListOfInteger(list);
    }


}
