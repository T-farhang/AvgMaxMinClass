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
public class AvgMaxMinClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[] a = {new Integer(12), new Integer(2), new Integer(1), new Integer(5)};

        Double[] b = {new Double(-12.2), new Double(1.4), new Double(3.5), new Double(0.1),
            new Double(8.7), new Double(-9.2)};

        Student c1 = new Student();
        c1.setfName("Tahereh");
        c1.setLname("Farhang");
        Double[] s1 = {new Double(20.0), new Double(15.5), new Double(16.0)};
        c1.setScore(s1);

        Student c2 = new Student();
        c2.setfName("Sahar");
        c2.setLname("Sadeghi");
        Double[] s2 = {new Double(15.0), new Double(12), new Double(16.0)};
        c2.setScore(s2);

        GenericMethods.Max(a);
        GenericMethods.Max(b);
        System.out.println(c1);
        GenericMethods.Max(c1.getScore());
        System.out.println(c2);
        GenericMethods.Max(c2.getScore());

        GenericMethods.Min(a);
        GenericMethods.Min(b);
        System.out.println(c1);
        GenericMethods.Min(c1.getScore());
        System.out.println(c2);
        GenericMethods.Min(c2.getScore());

        GenericMethods.Max(c1.getScore(), c2.getScore());
        GenericMethods.Min(c1.getScore(), c2.getScore());

    }
}
