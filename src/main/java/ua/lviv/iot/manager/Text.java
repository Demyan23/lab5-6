package ua.lviv.iot.manager;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Text {
    public String pattern = "[a-zA-Z]{1,}\\d{1,4}[a-zA-Z]{1,}";

    public void deleteWordsWithDigitsNumberLessThen5(String text) {
        Pattern pattern1 = Pattern.compile(pattern);
        String replaced = pattern1.matcher(text).replaceAll("");
        System.out.println(replaced);
    }

}

