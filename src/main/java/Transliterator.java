import java.util.HashMap;
import java.util.Map;

public class Transliterator {

    public static final Map<String, String> map = new HashMap<>();

    static {
        map.put("А", "A");
        map.put("Б", "B");
        map.put("В", "V");
        map.put("Г", "G");
        map.put("Ґ", "Ġ");
        map.put("Д", "D");
        map.put("Е", "E");
        map.put("Є", "Ё");
        map.put("Ж", "Ž");
        map.put("З", "Z");
        map.put("И", "Y");
        map.put("І", "I");
        map.put("Ї", "Ÿ");
        map.put("Й", "J");
        map.put("К", "K");
        map.put("Л", "L");
        map.put("М", "M");
        map.put("Н", "N");
        map.put("О", "O");
        map.put("П", "P");
        map.put("Р", "R");
        map.put("С", "S");
        map.put("Т", "T");
        map.put("У", "U");
        map.put("Ф", "F");
        map.put("Х", "H");
        map.put("Ц", "C");
        map.put("Ч", "Č");
        map.put("Ш", "Š");
        map.put("Щ", "Ş");
        map.put("Ь", "́");
        map.put("Ю", "Ü");
        map.put("Я", "Ä");

        map.put("а", "a");
        map.put("б", "b");
        map.put("в", "v");
        map.put("г", "g");
        map.put("ґ", "ġ");
        map.put("д", "d");
        map.put("е", "e");
        map.put("є", "ё");
        map.put("ж", "ž");
        map.put("з", "z");
        map.put("и", "y");
        map.put("і", "i");
        map.put("ї", "ÿ");
        map.put("й", "j");
        map.put("к", "k");
        map.put("л", "l");
        map.put("м", "m");
        map.put("н", "n");
        map.put("о", "o");
        map.put("п", "p");
        map.put("р", "r");
        map.put("с", "s");
        map.put("т", "t");
        map.put("у", "u");
        map.put("ф", "f");
        map.put("х", "h");
        map.put("ц", "c");
        map.put("ч", "č");
        map.put("ш", "š");
        map.put("щ", "ş");
        map.put("ь", "́");
        map.put("ю", "ü");
        map.put("я", "ä");

        map.put("ВВ", "W");
        map.put("Вв", "W");
        map.put("вВ", "w");
        map.put("вв", "w");

        map.put("КС", "X");
        map.put("Кс", "X");
        map.put("кС", "x");
        map.put("кс", "x");

        map.put("ЙО", "Ö");
        map.put("Йо", "Ö");
        map.put("йО", "ö");
        map.put("йо", "ö");

        map.put("ЬО", "Ö");
        map.put("Ьо", "Ö");
        map.put("ьО", "ö");
        map.put("ьо", "ö");

        map.put("іЬ", "і́");
        map.put("іь", "і́");
    }

    public static String convert(String string) throws IllegalArgumentException {
        if (string == null || string.equalsIgnoreCase("ь")) {
            return "";
        }

        int length = string.length();
        StringBuilder result = new StringBuilder();
        String substitution;

        for (int i = 0; i < length; ) {
            String key;

            if (i + 2 <= length) {
                key = string.substring(i, i + 2);

                if (map.containsKey(key)) {
                    substitution = map.get(key);
                    result.append(substitution);
                    i += 2;
                    continue;
                }
            }

            if (i + 1 <= length) {
                key = string.substring(i, i + 1);
                substitution = map.getOrDefault(key, key);
                result.append(substitution);
                i++;
            }
        }

        return result.toString();
    }
}