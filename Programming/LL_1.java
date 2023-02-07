package Programming;
import java.util.*;



public class LL_1 {

    public  static void main(String [] args){
        LinkedList <String> list = new LinkedList<String>();

        list.addFirst("hello bro");
        list.addLast("Sayonara");
        System.out.println(list);
        list.add("Shaurya");
        list.add("Panwar");
        System.out.println(list.size());

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        list.remove(3);
        System.out.println(list);
    

    }
}
