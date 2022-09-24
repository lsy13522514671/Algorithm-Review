package exam;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Question 2:
 * Given an array of String, the function should return a sorted array in increasing order with duplication removed. 
 * Strings should be sorted as the following way:
 * 1. Sort by the first time stamp occured in String
 * 2. (If the time stamp is the same) Sort by length of String
 * 3. (If the String length is the same) Sort by the ASCII from the begining one by one
 * 
 * Notice:
 * 1. The time stamp is in format yyyy-mm-ddTHH:MM:SS, for example, 2018-12-24T08:00:00.
 * 2. Each String has at least one time stamp
 * 3. All time stamp is valid. DON'T WASTE TIME TO VERIFY THE TIME STAMP!
 * 4. Each String part (including time stamp) is divided by "/" 
 * 5. Each String is composed of digit, alphabet, or symbol(only "/", ":", and "-")
 * 
 */
public class StringSort {
    public static String[] stringSort(String[] strArr) {
        Set<String> strSet = new HashSet<>();

        for(String str : strArr) {
            strSet.add(str);
        }

        int strNum = strSet.size();
        String[] result = new String[strNum];

        int i=0;
        for(String str: strSet) {
            result[i]=str;
            i++;
        }

        String regex = "[0-9]{4}-[0-9]{2}-[0-9]{2}T[0-9]{2}:[0-9]{2}:[0-9]{2}";

        Arrays.sort(result, new Comparator<String>() {
            public int compare(String s1, String s2) {
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher1 = pattern.matcher(s1);
                Matcher matcher2 = pattern.matcher(s2);
                matcher1.find();
                matcher2.find();

                String t1 = matcher1.group().toString();
                String t2 = matcher2.group().toString();

                int tDiff = t1.compareTo(t2);

                if(tDiff != 0) {
                    return tDiff;
                }

                int lenDiff = s1.length() - s2.length();
                
                if(lenDiff != 0) {
                    return lenDiff;
                }

                return s1.compareTo(s2);
            }
        });

        return result;
    }
}
