package HashMap;

import java.util.HashMap;
import java.util.Map;

public class main {
        public static void main1(String[] args){
            HashMap<Integer,String> hashMapTest= new HashMap<Integer,String>();
            hashMapTest.put(1,"Test_1");
            hashMapTest.put(2,"Test_2");
            hashMapTest.put(3,"Test_3");
            hashMapTest.put(4,"Test_4");
            hashMapTest.put(5,"Test_5");


            System.out.println(hashMapTest.get(2));
            System.out.println(hashMapTest.get(3));

            for (Map.Entry map: hashMapTest.entrySet()){
                System.out.println(map.getKey() + " " + map.getValue());
            }

            System.out.println(hashMapTest);
            hashMapTest.remove(3);
            System.out.println(hashMapTest);

            HashMap<Integer, Student> studentHashMap = new HashMap<Integer, Student>();

            Student student1= new Student(1, "Huynh Quoc Khanh", 10);
            Student student2= new Student(2, "Ngo Thi Cuc", 9.5);
            Student student3= new Student(3, "Nguyen Bao Ngoc", 8.5);

            studentHashMap.put(1, student1);
            studentHashMap.put(2, student2);
            studentHashMap.put(3, student3);

            //traverse the hashmap:
            for (Map.Entry<Integer,Student> m : studentHashMap.entrySet()){
                int key=  m.getKey();
                Student student= m.getValue();
                System.out.println("Student "+key+" Info: ");
                System.out.println("Id: "+student.getId() +
                        "\nFull name: "+student.getFull_name()+
                        "\nTest score: "+student.getTest_score());

            }
        }
}
