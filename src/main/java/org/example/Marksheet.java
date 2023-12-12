package org.example;

public class Marksheet {

    private int maths;
    private int english;
    private int science;

    public Marksheet() {
    }

    public Marksheet(int maths, int english, int science) {
        this.maths = maths;
        this.english = english;
        this.science = science;
    }

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getScience() {
        return science;
    }

    public void setScience(int science) {
        this.science = science;
    }

    @Override
    public String toString() {
        return "Marksheet{" +
                "maths=" + maths +
                ", english=" + english +
                ", science=" + science +
                '}';
    }
}
