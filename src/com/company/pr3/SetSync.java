package com.company.pr3;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetSync {
    public static void main(String[] argv)
            throws Exception
    {

        try {
            Set<String> set = new HashSet<String>();

            set.add("1");
            set.add("2");
            set.add("3");

            System.out.println("Set : " + set);

            Set<String> setSync = Collections.synchronizedSet(set);

            System.out.println("Synchronized set is : " + setSync);
        }
        catch (IllegalArgumentException e) {
            System.out.println("Exception thrown : " + e);
        }
    }
}
