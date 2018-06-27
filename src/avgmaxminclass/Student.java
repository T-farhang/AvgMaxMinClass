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
public class Student<E> {

    private String fName;
    private String lName;
    private int id;
    private Double[] score;

    public Student() {
    }

    public Student(int id) {
        this.id = id;
    }

    public Student(String fname, String lname) {
        this.fName = fname;
        this.lName = lname;
    }

    public Student(String fname, String lname, int id) {
        this.fName = fname;
        this.lName = lname;
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public String getLname() {
        return lName;
    }

    public int getId() {
        return id;
    }

    public Double[] getScore() {
        return score;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setLname(String lname) {
        this.lName = lname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setScore(Double[] s) {
        for (int i = 0; i < s.length; i++) {
            if (s[i] < 0) {
                System.out.println("Score cannot be negative!");
            } else {
                this.score = s;
            }
        }
    }

    @Override
    public String toString() {
        return "Student : " + fName + " " + lName;
    }

}
