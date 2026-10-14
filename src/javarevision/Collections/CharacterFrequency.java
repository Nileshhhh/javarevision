package javarevision.Collections;

import java.util.HashMap;

public class CharacterFrequency {
    public static void main(String[] args) {
        HashMap<Character, Integer> frequencyMap = new HashMap<Character, Integer>();
        String name = "Nilesh";
        int count = 0;
        for (int i = 0; i<name.length(); i++)
        {
            char c = name.charAt(i);
            if (frequencyMap.containsKey(c)) {
                count = frequencyMap.get(c);
                frequencyMap.put(c, count + 1);
            }else {

                frequencyMap.put(c, 1);
            }
        }

        System.out.println(frequencyMap);
    }
}
