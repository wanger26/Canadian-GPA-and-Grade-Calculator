package com.gradeCalculator.gradeandgpacalculator;

public class Grade {

    private double grade, weight;

    public Grade (double grade, double weight){
        this.grade=grade;
        this.weight=weight;
    }

    public double getGrade() {
        return grade;
    }

    public double getWeight() {
        return weight;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public String toString(){
        return "Grade: "+this.grade+"\t Weight: "+this.weight;
    }
}
