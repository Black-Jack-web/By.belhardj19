package By.belhardj19.homework.homework_lesson7.ex2;

import java.util.HashMap;
import java.util.Map;

public class ChatacterMap {
    public static void main(String[] args) {

        String input = "\"Всех с Новым Годом!\"";

        Map<Character, Integer> result = getCharacterCount(input);

//        Map<Character, Integer> calcCharFreq(String inputString, boolean order);


        for (Map.Entry<Character, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());

        }
    }

    private static Map<Character, Integer> getCharacterCount(String input) {


        Map<Character, Integer> map = new HashMap<>();

        char[] chars = input.toLowerCase().toCharArray();

        for (char c : chars) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }


        }


        return map;
    }
}
