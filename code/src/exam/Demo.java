package exam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
    public static void main(String[] args) {
        String str = "my/2019-01-01T09:00:00/2020-01-01T09:00:01/2021-01-01T09:00:01/2022-01-01T09:00:01";
        String regex = "[0-9]{4}-[0-9]{2}-[0-9]{2}T[0-9]{2}:[0-9]{2}:[0-9]{2}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        matcher.find();
        matcher.find();
        matcher.find();
        matcher.find();
        System.out.println(matcher.group().toString());
    }
}