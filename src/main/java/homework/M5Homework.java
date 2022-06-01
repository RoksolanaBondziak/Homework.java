package homework;

import java.util.*;

public class M5Homework {
    public String getDay(int day) {
        ArrayList<String> dayOfWeek = new ArrayList<>();
        dayOfWeek.add("Sunday");
        dayOfWeek.add("Monday");
        dayOfWeek.add("Tuesday");
        dayOfWeek.add("Wednesday");
        dayOfWeek.add("Thursday");
        dayOfWeek.add("Friday");
        dayOfWeek.add("Saturday");
        System.out.println(dayOfWeek.get(day));
        String result = dayOfWeek.get(day);
        return result;
    }


    public String getToyByld(int id) {
        HashMap<Integer, String> toyInfo = new HashMap<>();

        toyInfo.put(12, "Batmobile");
        toyInfo.put(45, "Light Saber");
        toyInfo.put(6, "Wonder Woman ");
        toyInfo.put(201, "Hello Kitty Bag");
        toyInfo.put(56, "Junior QA Analyst Doll");

        if (toyInfo.get(id) == null) {
            return toyInfo.get(56);
        } else {
            return toyInfo.get(id);
        }
    }


    public void noDublicates() {
        ArrayList<String> listOfWords = new ArrayList<>();
        listOfWords.add("Steve");
        listOfWords.add("Tim");
        listOfWords.add("Lucy");
        listOfWords.add("Steve");
        listOfWords.add("Pat");
        listOfWords.add("Angela");
        listOfWords.add("Tom");
        listOfWords.add("Tim");
        listOfWords.add("Anna");
        listOfWords.add("Lucy");

        Collections.sort(listOfWords);
        System.out.println(listOfWords);

        LinkedHashSet<String> listWithNoDublicates = new LinkedHashSet<>(listOfWords);
        System.out.println(listWithNoDublicates);
    }
}


