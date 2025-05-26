package com.campusdual.classroom;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercise21 {

    public static Set<String> createHashSet() {
        Set<String> elements = new HashSet<>();
        elements.add("ELEMENT KPRBC");
        elements.add("ELEMENT YPBTM");
        elements.add("ELEMENT AADXU");
        elements.add("ELEMENT RXCGJ");
        elements.add("ELEMENT WYMVD");
        elements.add("ELEMENT WFGEJ");
        elements.add("ELEMENT TYGBS");
        elements.add("ELEMENT MAPTK");
        elements.add("ELEMENT GJXVE");
        elements.add("ELEMENT BAFGL");
        return elements;
    }

    public static Set<String> createTreeSet() {
        Set<String> elements = new TreeSet<>();
        elements.add("ELEMENT KPRBC");
        elements.add("ELEMENT YPBTM");
        elements.add("ELEMENT AADXU");
        elements.add("ELEMENT RXCGJ");
        elements.add("ELEMENT WYMVD");
        elements.add("ELEMENT WFGEJ");
        elements.add("ELEMENT TYGBS");
        elements.add("ELEMENT MAPTK");
        elements.add("ELEMENT GJXVE");
        elements.add("ELEMENT BAFGL");
        return elements;
    }

    private static void printSet(Set<String> customSet) {
        for (String element : customSet) {
            System.out.println(element);
        }
    }


    public static boolean addElementToSet(Set<String> set, String elementToAdd) {
        return set.add(elementToAdd);
    }

    public static void main(String[] args) {
        Set<String> elementosHashSet = createHashSet();
        Set<String> elementosTreeSet = createTreeSet();
        String newElement = "ELEMENT AAA";
        System.out.println((addElementToSet(elementosHashSet, newElement)) ? "El elemento " + newElement + " se añadió correctamente" : "El elemento " + newElement + " ya está en la lista y no se puede repetir elementos.");
        System.out.println((addElementToSet(elementosTreeSet, newElement) ? "El elemento " + newElement + " se añadió correctamente" : "El elemento " + newElement + " ya está en la lista y no se puede repetir elementos."));
        System.out.println((addElementToSet(elementosHashSet, newElement)) ? "El elemento " + newElement + " se añadió correctamente" : "El elemento " + newElement + " ya está en la lista y no se puede repetir elementos.");
        System.out.println((addElementToSet(elementosTreeSet, newElement) ? "El elemento " + newElement + " se añadió correctamente" : "El elemento " + newElement + " ya está en la lista y no se puede repetir elementos."));
        System.out.println("Elementos HashSet: ");
        printSet(elementosHashSet);
        System.out.println("Elementos TreeSet: ");
        printSet(elementosTreeSet);
    }

}
