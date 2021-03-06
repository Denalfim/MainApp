package level.two.homework3;

import java.util.TreeMap;
import java.util.TreeSet;

public class PhoneDirectory {
    private TreeMap<String, TreeSet<String>> treeMap;

    public PhoneDirectory(){
        treeMap = new TreeMap<>();
    }

    public void add(String name, String phone){
        if(treeMap.containsKey(name)){
            treeMap.get(name).add(phone);
        }else{
            TreeSet<String> treeSet = new TreeSet<>();
            treeSet.add(phone);

            treeMap.put(name, treeSet);
        }
    }

    public String get(String name){
        if (treeMap.containsKey(name)){
            return treeMap.get(name).toString();
        }else{
            return "телефон отсутствует";
        }
    }
}
