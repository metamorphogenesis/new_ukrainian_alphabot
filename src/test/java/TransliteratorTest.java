import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransliteratorTest {

    @Test
    @DisplayName("Чайник")
    public void test1() {
        testAllCases("Чайник", "Čajnyk", "ČAJNYK", "čajnyk");
    }

    @Test
    @DisplayName("Шлях")
    public void test2() {
        testAllCases("Шлях", "Šläh", "ŠLÄH", "šläh");
    }

    @Test
    @DisplayName("Щука")
    public void test3() {
        testAllCases("Щука", "Şuka", "ŞUKA", "şuka");
    }

    @Test
    @DisplayName("Ґрунт")
    public void test4() {
        testAllCases("Ґрунт", "Ġrunt", "ĠRUNT", "ġrunt");
    }

    @Test
    @DisplayName("Юшка")
    public void test5() {
        testAllCases("Юшка", "Üška", "ÜŠKA", "üška");
    }

    @Test
    @DisplayName("Ягода")
    public void test6() {
        testAllCases("Ягода", "Ägoda", "ÄGODA", "ägoda");
    }

    @Test
    @DisplayName("Завжди")
    public void test7() {
        testAllCases("Завжди", "Zavždy", "ZAVŽDY", "zavždy");
    }

    @Test
    @DisplayName("Єнот")
    public void test8() {
        testAllCases("Єнот", "Ёnot", "ЁNOT", "ёnot");
    }

    @Test
    @DisplayName("Ввічливий")
    public void test9() {
        testAllCases("Ввічливий", "Wičlyvyj", "WIČLYVYJ", "wičlyvyj");
    }

    @Test
    @DisplayName("Майстер")
    public void test10() {
        testAllCases("Майстер", "Majster", "MAJSTER", "majster");
    }

    @Test
    @DisplayName("Щоденник")
    public void test11() {
        testAllCases("Щоденник", "Şodennyk", "ŞODENNYK", "şodennyk");
    }

    @Test
    @DisplayName("Прайс")
    public void test12() {
        testAllCases("Прайс", "Prajs", "PRAJS", "prajs");
    }

    @Test
    @DisplayName("Черевики")
    public void test13() {
        testAllCases("Черевики", "Čerevyky", "ČEREVYKY", "čerevyky");
    }

    @Test
    @DisplayName("Школяр")
    public void test14() {
        testAllCases("Школяр", "Školär", "ŠKOLÄR", "školär");
    }

    @Test
    @DisplayName("Щастя")
    public void test15() {
        testAllCases("Щастя", "Şastä", "ŞASTÄ", "şastä");
    }

    @Test
    @DisplayName("Йога")
    public void test16() {
        testAllCases("Йога", "Öga", "ÖGA", "öga");
    }

    @Test
    @DisplayName("Ювелір")
    public void test17() {
        testAllCases("Ювелір", "Üvelir", "ÜVELIR", "üvelir");
    }

    @Test
    @DisplayName("Віконний")
    public void test18() {
        testAllCases("Віконний", "Vikonnyj", "VIKONNYJ", "vikonnyj");
    }

    @Test
    @DisplayName("Сьогодні")
    public void test19() {
        testAllCases("Сьогодні", "Sögodni", "SÖGODNI", "sögodni");
    }

    @Test
    @DisplayName("Ксерокс")
    public void test20() {
        testAllCases("Ксерокс", "Xerox", "XEROX", "xerox");
    }

    @Test
    @DisplayName("Гордість")
    public void test21() {
        testAllCases("Гордість", "Gordist́", "GORDIST́", "gordist́");
    }

    @Test
    @DisplayName("Вв")
    public void test22() {
        test("ВВ", "W");
        test("Вв", "W");
        test("вВ", "w");
        test("вв", "w");
    }

    @Test
    @DisplayName("Ьо")
    public void test23() {
        test("ЬО", "Ö");
        test("Ьо", "Ö");
        test("ьО", "ö");
        test("ьо", "ö");
    }

    @Test
    @DisplayName("Йо")
    public void test24() {
        test("ЙО", "Ö");
        test("Йо", "Ö");
        test("йО", "ö");
        test("йо", "ö");
    }

    @Test
    @DisplayName("Кс")
    public void test25() {
        test("КС", "X");
        test("Кс", "X");
        test("кС", "x");
        test("кс", "x");
    }

    @Test
    @DisplayName("Ввь")
    public void test26() {
        test("ВВЬ", "Ẃ");
        test("ВВь", "Ẃ");
        test("ВвЬ", "Ẃ");
        test("вВЬ", "ẃ");
        test("Ввь", "Ẃ");
        test("вВь", "ẃ");
        test("ввЬ", "ẃ");
        test("ввь", "ẃ");
    }

    @Test
    @DisplayName("Аь")
    public void test27() {
        testSoftSign("А", "Á", "á");
    }

    @Test
    @DisplayName("Бь")
    public void test28() {
        testSoftSign("Б", "B́", "b́");
    }

    @Test
    @DisplayName("Вь")
    public void test29() {
        testSoftSign("В", "V́", "v́");
    }

    @Test
    @DisplayName("Гь")
    public void test30() {
        testSoftSign("Г", "Ǵ", "ǵ");
    }

    @Test
    @DisplayName("Ґь")
    public void test31() {
        testSoftSign("Ґ", "Ġ́", "ġ́");
    }

    @Test
    @DisplayName("Eь")
    public void test32() {
        testSoftSign("Е", "É", "é");
    }

    @Test
    @DisplayName("Єь")
    public void test33() {
        testSoftSign("Є", "Ё́", "ё́");
    }

    @Test
    @DisplayName("Дь")
    public void test34() {
        testSoftSign("Д", "D́", "d́");
    }

    @Test
    @DisplayName("Жь")
    public void test35() {
        testSoftSign("Ж", "Ž́", "ž́");
    }

    @Test
    @DisplayName("Зь")
    public void test36() {
        testSoftSign("З", "Ź", "ź");
    }

    @Test
    @DisplayName("Иь")
    public void test37() {
        testSoftSign("И", "Ý", "ý");
    }

    @Test
    @DisplayName("Іь")
    public void test38() {
        testSoftSign("І", "Í", "і́");
    }

    @Test
    @DisplayName("Їь")
    public void test39() {
        testSoftSign("Ї", "Ÿ́", "ÿ́");
    }

    @Test
    @DisplayName("Йь")
    public void test40() {
        testSoftSign("Й", "J́", "j́");
    }

    @Test
    @DisplayName("Кь")
    public void test41() {
        testSoftSign("К", "Ḱ", "ḱ");
    }

    @Test
    @DisplayName("Ль")
    public void test42() {
        testSoftSign("Л", "Ĺ", "ĺ");
    }

    @Test
    @DisplayName("Мь")
    public void test43() {
        testSoftSign("М", "Ḿ", "ḿ");
    }

    @Test
    @DisplayName("Нь")
    public void test44() {
        testSoftSign("Н", "Ń", "ń");
    }

    @Test
    @DisplayName("Оь")
    public void test45() {
        testSoftSign("О", "Ó", "ó");
    }

    @Test
    @DisplayName("Пь")
    public void test46() {
        testSoftSign("П", "Ṕ", "ṕ");
    }

    @Test
    @DisplayName("Рь")
    public void test47() {
        testSoftSign("Р", "Ŕ", "ŕ");
    }

    @Test
    @DisplayName("Сь")
    public void test48() {
        testSoftSign("С", "Ś", "ś");
    }

    @Test
    @DisplayName("Ть")
    public void test49() {
        testSoftSign("Т", "T́", "t́");
    }

    @Test
    @DisplayName("Уь")
    public void test50() {
        testSoftSign("У", "Ú", "ú");
    }

    @Test
    @DisplayName("Фь")
    public void test51() {
        testSoftSign("Ф", "F́", "f́");
    }

    @Test
    @DisplayName("Хь")
    public void test52() {
        testSoftSign("Х", "H́", "h́");
    }

    @Test
    @DisplayName("Ць")
    public void test53() {
        testSoftSign("Ц", "Ć", "ć");
    }

    @Test
    @DisplayName("Чь")
    public void test54() {
        testSoftSign("Ч", "Č́", "č́");
    }

    @Test
    @DisplayName("Шь")
    public void test55() {
        testSoftSign("Ш", "Š́", "š́");
    }

    @Test
    @DisplayName("Щь")
    public void test56() {
        testSoftSign("Щ", "Ş́", "ş́");
    }

    @Test
    @DisplayName("Юь")
    public void test57() {
        testSoftSign("Ю", "Ǘ", "ǘ");
    }

    @Test
    @DisplayName("Яь")
    public void test58() {
        testSoftSign("Я", "Ä́", "ä́");
    }

    @Test
    @DisplayName("Not UA letters")
    public void test59() {
        String s = " `1234567890-=qwertyuiop[]asdfghjkl;'zxcvbnm,./~!@#$%^&*()_+QWERTYUIOP{}|ASDFGHJKL:ZXCVBNM<>?ЫыэЭъЪЁё\\";
        assertEquals(s, Transliterator.convert(s));
    }

    private void testSoftSign(String letter, String expectedUpperCase, String expectedLowerCase) {
        String case1 = letter.toUpperCase() + "Ь";
        String case2 = letter.toUpperCase() + "ь";
        String case3 = letter.toLowerCase() + "Ь";
        String case4 = letter.toLowerCase() + "ь";

        test(case1, expectedUpperCase);
        test(case2, expectedUpperCase);
        test(case3, expectedLowerCase);
        test(case4, expectedLowerCase);
    }

    private void testAllCases(String titleCaseSource, String expectedTitleCase, String expectedUpperCase, String expectedLowerCase) {
        test(titleCaseSource, expectedTitleCase);
        test(titleCaseSource.toUpperCase(), expectedUpperCase);
        test(titleCaseSource.toLowerCase(), expectedLowerCase);
    }

    private void test(String source, String expected) {
        String actual = Transliterator.convert(source);
        assertEquals(expected, actual);
    }
}
