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
        
        String[] s = {"America","Asia","Africa","Europe","Australia"};

        Student student1 = new Student();
        student1.setfName("Tahereh");
        student1.setLname("Farhang");
        Double[] score1 = {new Double(20.0), new Double(15.5), new Double(16.0)};
        student1.setScore(score1);

        Student student2 = new Student();
        student2.setfName("Sahar");
        student2.setLname("Sadeghi");
        Double[] score2 = {new Double(15.0), new Double(12), new Double(16.0)};
        student2.setScore(score2);

        GenericMethods.Max(a);
        GenericMethods.Min(a);
        GenericMethods.Avg(a);

        GenericMethods.Max(b);
        GenericMethods.Min(b);
        GenericMethods.Avg(b);
        
        GenericMethods.Max(s);
        GenericMethods.Min(s);

        System.out.println(student1);
        GenericMethods.Max(student1.getScore());
        GenericMethods.Min(student1.getScore());
        GenericMethods.Avg(student1.getScore());

        System.out.println(student2);
        GenericMethods.Max(student2.getScore());
        GenericMethods.Min(student2.getScore());
        GenericMethods.Avg(student2.getScore());

        GenericMethods.Max(student1.getScore(), student2.getScore());
        GenericMethods.Min(student1.getScore(), student2.getScore());
    }
}
