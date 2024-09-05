package Anagram;
import java.util.Arrays;
public class AnagramChecker
{
    public static void main(String[] args)
    {
        String str1 = "software";
        String str2 = "swear oft";
        str1 = str1.replaceAll("\\W", "").toLowerCase();
        str2 = str2.replaceAll("\\W", "").toLowerCase();
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1, arr2) ? "Anagram" : "Not an anagram");
    }
}