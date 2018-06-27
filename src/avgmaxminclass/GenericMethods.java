/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avgmaxminclass;

/**
 *
 * @author Totia
 */
public class GenericMethods<E> {

    private java.util.ArrayList<E> list = new java.util.ArrayList<>();

    public int getSize() {
        return list.size();
    }

    public void addList(E o) {
        list.add(o);
    }

    public static <E extends Comparable<E>> void Max(E[] list) {
        E max = list[0];
        for (int i = 1; i < list.length; i++) {
            if (max.compareTo(list[i]) < 0) {
                max = list[i];
            }
        }
        System.out.println("Max is " + max);
    }

    public static <E extends Comparable<E>> void Max(E[] list1, E[] list2) {
        E max1 = list1[0];
        for (int i = 1; i < list1.length; i++) {
            if (max1.compareTo(list1[i]) < 0) {
                max1 = list1[i];
            }
        }
        E max2 = list2[0];
        for (int j = 1; j < list2.length; j++) {
            if (max2.compareTo(list2[j]) < 0) {
                max2 = list2[j];
            }
        }
        if (max1.compareTo(max2) > 0) {
            System.out.println("Maximum is " + max1);
        } else {
            System.out.println("Maximum is " + max2);
        }
    }

    public static <E extends Comparable<E>> void Min(E[] list) {
        E min = list[0];
        for (int i = 1; i < list.length; i++) {
            if (min.compareTo(list[i]) > 0) {
                min = list[i];
            }
        }
        System.out.println("Min is " + min);
    }

    public static <E extends Comparable<E>> void Min(E[] list1, E[] list2) {
        E min1 = list1[0];
        for (int i = 1; i < list1.length; i++) {
            if (min1.compareTo(list1[i]) > 0) {
                min1 = list1[i];
            }
        }
        E min2 = list2[0];
        for (int j = 1; j < list2.length; j++) {
            if (min2.compareTo(list2[j]) > 0) {
                min2 = list2[j];
            }
        }
        if (min1.compareTo(min2) < 0) {
            System.out.println("Minimum is " + min1 + "from ");
        } else {
            System.out.println("Minimum is " + min2);
        }

    }

    public static <E extends Number> void Avg(E[] list) {
        Number result = list[0];
        for (int i = 1; i < list.length; i++) {
            result = add(result, list[i]);
        }
        Number r = result.doubleValue() / list.length;
        System.out.println("Avarage is " + r);
    }

    public static Number add(Number n1, Number n2) {
        Double n = n1.doubleValue() + n2.doubleValue();
        return n;
    }

}
