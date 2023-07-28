import java.util.ArrayList;
import java.util.Iterator;

public class Main4 {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<String>();
        nameList.add("Tanaka");
        nameList.add("Sakamoto");
        nameList.add("Nakata");

        System.out.println(nameList.get(1));

        nameList.remove(0);

        // for (int i = 0; i < nameList.size(); i++) {
        //     System.out.println(nameList.get(i));
        // }

        Iterator<String> iterator = nameList.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}