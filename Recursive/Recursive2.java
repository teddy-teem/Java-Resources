package Recursive;

import java.util.HashSet;

public class Recursive2 {

    public static void towerOhHonai(int n, String src, String hlp, String dst) { //tower of honai

        if (n == 1) {
            System.out.println("transfer desk " + n + " from " + src + " to " + dst);
            return;
        }

        towerOhHonai(n - 1, src, dst, hlp); // transfer from src to helper, that why hlp is dst here.
        System.out.println("transfer desk " + n + " from " + src + " to " + dst);
        towerOhHonai(n - 1, hlp, src, dst); // transfer hlp to source
    }

    public static void printReverse(String s, int i) { //reverse string
        if (i == 0) {
            return;
        }
        System.out.print(s.charAt(i));
        printReverse(s, i - 1);
    }

    public static int first = -1;
    public static int last = -1;
    public static void findOcurance(String s, int i, char element) {  //first & last occurrence of a char in a string
        if (s.length() == i) {
            return;
        }
        char currChar = s.charAt(i);
        if (element == currChar) {
            if (first == -1) {
                first = i;
                last = i;
            } else {
                last = i;
            }
        }
        findOcurance(s, i + 1, element);
    }

    public static boolean isSorted(int arr[], int i) { //Arr is sorted or not
        if (arr.length - 1 == i) {
            return true;
        }
        if (arr[i] <= arr[i + 1]) {
            return isSorted(arr, i + 1);
        } else {
            return false;
        }
    }

    public static void subSequence(String str, int i, String newString) { //SubSequence of String...

        if (i == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(i);
        // to be added
        subSequence(str, i + 1, newString + currChar);
        // not to be added
        subSequence(str, i + 1, newString);
    }

    public static void uniqueSubSequence(String str, int i, String newString, HashSet<String> set) {

        if (i == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }

        }
        char currChar = str.charAt(i);
        // to be added
        uniqueSubSequence(str, i + 1, newString + currChar, set);
        // not to be added
        uniqueSubSequence(str, i + 1, newString, set);
    }


    public static String[] keyPad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void printKeypadCombination (String str, int ind, String combination ) {

        if(ind == str.length()) {
            System.out.println(combination);
            return;
        }

        char currChar = str.charAt(ind);

        String mapping = keyPad[currChar-'0'];
        for(int i=0; i<mapping.length(); i++) {
            printKeypadCombination(str, ind+1, combination+mapping.charAt(i));

        }

    }




    public static void main(String[] args) {

        int n = 3;
        // towerOhHonai(n, "S", "H", "D");

        // String a="ABCDEF";
        // printReverse(a, a.length()-1);

        // String b = "asdaasdafsaasda";
        // findOccurance(b, 0, 'a');
        // System.out.println(first+" "+last);

        // int arr[]={1,2,3,4,5,5,6};
        // System.out.println(isSorted(arr, 0));

        // String a = "aaa";
        // HashSet<String> s = new HashSet<>();
        // uniqueSubSequence(a, 0, "", s);

        String a = "46";
        printKeypadCombination(a, 0, "");

    }
}
