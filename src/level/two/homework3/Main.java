package level.two.homework3;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        String[] world = new String[10];
        world[0] = "Day";
        world[1] = "Bom";
        world[2] = "qwerty";
        world[3] = "jgfjfggf";
        world[4] = "eterete";
        world[5] = "Dom";
        world[6] = "Day";
        world[7] = "asdfghy";
        world[8] = "Home";
        world[9] = "ytreweq";

        task1(world);

        task2();
    }

    public static void task1(String[] world){

        TreeMap<String, Integer> treeMap = new TreeMap<>();

        for (int i = 0; i< world.length; i++){
            if (treeMap.containsKey(world[i])){
                treeMap.put(world[i], treeMap.get(world[i])+1);
            }else{
                treeMap.put(world[i], 1);
            }
        }

        System.out.println(treeMap);
    }

    public static void task2(){

        PhoneDirectory phoneList = new PhoneDirectory();

        phoneList.add("Щукин", "79021596856");
        phoneList.add("Васин", "79886587895");
        phoneList.add("Сомов", "79008578954");
        phoneList.add("Комов", "79998585458");
        phoneList.add("Белов", "79986589785");
        phoneList.add("Серов", "79185789652");
        phoneList.add("Осина", "79856856575");

        System.out.println(phoneList.get("Щукин"));
        System.out.println(phoneList.get("Сомов"));
        System.out.println(phoneList.get("Белов"));
        System.out.println(phoneList.get("Осина"));
        System.out.println(phoneList.get("Комов"));
    }
}
