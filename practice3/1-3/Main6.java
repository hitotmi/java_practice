import java.util.*;

public class Main6 {
    public static void main(String[] args) {
        Student s1  = new Student("田中", "芸術学");
        Student s2  = new Student("鈴木", "応用科学");

        HashMap<Integer, Student> studentMap = new HashMap<Integer, Student>();

        studentMap.put(101, s1);
        studentMap.put(102, s2);

        for (Integer key : studentMap.keySet()) {
            Student student = studentMap.get(key);
            System.out.println("学生番号: " + key + ", 名前: " + student.getName() + ", 専攻: " + student.getMajor());
        }
    }
}