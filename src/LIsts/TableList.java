package LIsts;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class TableList {

        public static void main(String[] args) {
            List<String> names = new ArrayList<>();
            names.add("James");
            names.add("John");
            names.add("Jennifer");
            System.out.println(names);
            Iterator<String> nameIterator = names.iterator();
            while (nameIterator.hasNext()){
                if(nameIterator.next().equals("John"))
                    nameIterator.remove();
            }
            System.out.println(names);
        }
    }

