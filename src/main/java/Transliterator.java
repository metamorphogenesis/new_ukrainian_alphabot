public class Transliterator {
    public static String convert(String s) throws IllegalArgumentException {
        if (s != null && !s.isBlank() && !s.isEmpty()) {
            StringBuilder result = new StringBuilder();
            int i = s.length() - 1;

            while (i >= 0) {
                char c0 = s.charAt(i);

                if (i > 0) {
                    char c1 = s.charAt(i - 1);

                    // Ё-check
                    if ( (c0 == 'о' || c0 == 'О') &&
                            (c1 == 'ь' || c1 == 'Ь' || c1 == 'й' || c1 == 'Й') ) {
                        result.insert(0, c0 == 'о' ? 'ö' : 'Ö');
                        i = i - 2;

                           // Ь-check
                    } else if (c0 == 'ь' || c0 == 'Ь') {
                             if (c1 == 'б') result.insert(0, "b́");
                        else if (c1 == 'г') result.insert(0, "ǵ");
                        else if (c1 == 'ґ') result.insert(0, "g̓");
                        else if (c1 == 'д') result.insert(0, "d́");
                        else if (c1 == 'ж') result.insert(0, "ž́");
                        else if (c1 == 'з') result.insert(0, "ź");
                        else if (c1 == 'к') result.insert(0, "ḱ");
                        else if (c1 == 'л') result.insert(0, "ĺ");
                        else if (c1 == 'м') result.insert(0, "ḿ");
                        else if (c1 == 'н') result.insert(0, "ń");
                        else if (c1 == 'п') result.insert(0, "ṕ");
                        else if (c1 == 'р') result.insert(0, "ŕ");
                        else if (c1 == 'т') result.insert(0, "t́");
                        else if (c1 == 'ф') result.insert(0, "f́");
                        else if (c1 == 'х') result.insert(0, "h́");
                        else if (c1 == 'ц') result.insert(0, "ć");
                        else if (c1 == 'ч') result.insert(0, "č́");
                        else if (c1 == 'ш') result.insert(0, "š́");

                        else if (c1 == 'Б') result.insert(0, "B́");
                        else if (c1 == 'Г') result.insert(0, "Ǵ");
                        else if (c1 == 'Ґ') result.insert(0, "G̓");
                        else if (c1 == 'Д') result.insert(0, "D́");
                        else if (c1 == 'Ж') result.insert(0, "Ž́");
                        else if (c1 == 'З') result.insert(0, "Ź");
                        else if (c1 == 'К') result.insert(0, "Ḱ");
                        else if (c1 == 'Л') result.insert(0, "Ĺ");
                        else if (c1 == 'М') result.insert(0, "Ḿ");
                        else if (c1 == 'Н') result.insert(0, "Ń");
                        else if (c1 == 'П') result.insert(0, "Ṕ");
                        else if (c1 == 'Р') result.insert(0, "Ŕ");
                        else if (c1 == 'Т') result.insert(0, "T́");
                        else if (c1 == 'Ф') result.insert(0, "F́");
                        else if (c1 == 'Х') result.insert(0, "H́");
                        else if (c1 == 'Ц') result.insert(0, "Ć");
                        else if (c1 == 'Ч') result.insert(0, "Č́");
                        else if (c1 == 'Ш') result.insert(0, "Š́");

                             // ВВЬ-check
                        else if (c1 == 'в' || c1 == 'В') {
                            if (i > 1 && (s.charAt(i - 2) == 'в' || s.charAt(i - 2) == 'В') ) {
                                result.insert(0, s.charAt(i - 2) == 'в' ? "ẃ" : "Ẃ");
                                i--;
                            } else {
                                result.insert(0, c1 == 'в' ? "v́" : "V́");
                            }
                               // КСЬ-check
                        } else if (c1 == 'с' || c1 == 'С') {
                            if (i > 1 && (s.charAt(i - 2) == 'к' || s.charAt(i - 2) == 'К') ) {
                                result.insert(0, s.charAt(i - 2) == 'к' ? "x́" : "X́");
                                i--;
                            } else {
                                result.insert(0, c1 == 'с' ? "ś" : "Ś");
                            }
                        }
                        i = i - 2;

                           // BB-check
                    } else if (c0 == 'в' || c0 == 'В') {
                        if (c1 == 'в' || c1 == 'В') {
                            result.insert(0, c1 == 'в' ? "w" : "W");
                            i = i - 2;
                        }
                    } else if (c0 == 'с' || c0 == 'С') {
                        if (c1 == 'к' || c1 == 'К') {
                            result.insert(0, c1 == 'к' ? "x" : "X");
                            i = i - 2;
                        }
                    }
                }

                // other letters
                if (i >= 0) {
                    c0 = s.charAt(i);
                    if (c0 == 'а') result.insert(0, "a");
                    else if (c0 == 'б') result.insert(0, "b");
                    else if (c0 == 'в') result.insert(0, "v");
                    else if (c0 == 'г') result.insert(0, "g");
                    else if (c0 == 'ґ') result.insert(0, "ġ");
                    else if (c0 == 'д') result.insert(0, "d");
                    else if (c0 == 'є') result.insert(0, "ё");
                    else if (c0 == 'е') result.insert(0, "e");
                    else if (c0 == 'ж') result.insert(0, "ž");
                    else if (c0 == 'з') result.insert(0, "z");
                    else if (c0 == 'и') result.insert(0, "y");
                    else if (c0 == 'і') result.insert(0, "i");
                    else if (c0 == 'й') result.insert(0, "j");
                    else if (c0 == 'ї') result.insert(0, "ÿ");
                    else if (c0 == 'к') result.insert(0, "k");
                    else if (c0 == 'л') result.insert(0, "l");
                    else if (c0 == 'м') result.insert(0, "m");
                    else if (c0 == 'н') result.insert(0, "n");
                    else if (c0 == 'о') result.insert(0, "o");
                    else if (c0 == 'п') result.insert(0, "p");
                    else if (c0 == 'р') result.insert(0, "r");
                    else if (c0 == 'с') result.insert(0, "s");
                    else if (c0 == 'т') result.insert(0, "t");
                    else if (c0 == 'у') result.insert(0, "u");
                    else if (c0 == 'ф') result.insert(0, "f");
                    else if (c0 == 'х') result.insert(0, "h");
                    else if (c0 == 'ц') result.insert(0, "c");
                    else if (c0 == 'ч') result.insert(0, "č");
                    else if (c0 == 'ш') result.insert(0, "š");
                    else if (c0 == 'щ') result.insert(0, "ş");
                    else if (c0 == 'ю') result.insert(0, "ü");
                    else if (c0 == 'я') result.insert(0, "ä");

                    else if (c0 == 'А') result.insert(0, "A");
                    else if (c0 == 'Б') result.insert(0, "B");
                    else if (c0 == 'В') result.insert(0, "V");
                    else if (c0 == 'Г') result.insert(0, "G");
                    else if (c0 == 'Ґ') result.insert(0, "Ġ");
                    else if (c0 == 'Д') result.insert(0, "D");
                    else if (c0 == 'Є') result.insert(0, "Ё");
                    else if (c0 == 'Е') result.insert(0, "E");
                    else if (c0 == 'Ж') result.insert(0, "Ž");
                    else if (c0 == 'З') result.insert(0, "Z");
                    else if (c0 == 'И') result.insert(0, "Y");
                    else if (c0 == 'І') result.insert(0, "I");
                    else if (c0 == 'Й') result.insert(0, "J");
                    else if (c0 == 'Ї') result.insert(0, "Ÿ");
                    else if (c0 == 'К') result.insert(0, "K");
                    else if (c0 == 'Л') result.insert(0, "L");
                    else if (c0 == 'М') result.insert(0, "M");
                    else if (c0 == 'Н') result.insert(0, "N");
                    else if (c0 == 'О') result.insert(0, "O");
                    else if (c0 == 'П') result.insert(0, "P");
                    else if (c0 == 'Р') result.insert(0, "R");
                    else if (c0 == 'С') result.insert(0, "S");
                    else if (c0 == 'Т') result.insert(0, "T");
                    else if (c0 == 'У') result.insert(0, "U");
                    else if (c0 == 'Ф') result.insert(0, "F");
                    else if (c0 == 'Х') result.insert(0, "H");
                    else if (c0 == 'Ц') result.insert(0, "C");
                    else if (c0 == 'Ч') result.insert(0, "Č");
                    else if (c0 == 'Ш') result.insert(0, "Š");
                    else if (c0 == 'Щ') result.insert(0, "Ş");
                    else if (c0 == 'Ю') result.insert(0, "Ü");
                    else if (c0 == 'Я') result.insert(0, "Ä");
                    else result.insert(0, c0);
                    i--;
                }
            }
            return result.toString();
        } else {
            throw new IllegalArgumentException("source string must contain at least one sign.");
        }
    }
}