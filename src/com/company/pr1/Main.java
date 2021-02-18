package com.company.pr1;


public class Main {
    public static void main(String[] args) {
        String[] strings = new String[] {"one", "allow", "five", "THREE", "add", "Five"};
        Consumer consumer = x-> maxStr(x);
        consumer.maxString(strings);
    }

    public static long countUnique(String strings){
        return strings.toLowerCase().chars().distinct().count();
    }
    public static void maxStr(String[] strs){
        long max = 0;
        int idMax = 0;
        for (int i = 0; i < strs.length; i++){
            long countStr = countUnique(strs[i]);
            if (countStr > max){
                max = countStr;
                idMax = i;
            }
        }
        System.out.println(max + " " + strs[idMax]);
    }
}
