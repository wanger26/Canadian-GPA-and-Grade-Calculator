package com.gradeCalculator.gradeandgpacalculator;

import java.util.Iterator;

public class GradeCalculator {
    public GradeCalculator (){}
    public double calculatorWeightedAverage(Grades grades){
        double answer=0, credit=0;
        Iterator<Grade> itr= grades.getIterator();

        while (itr.hasNext()){
            Grade temp= itr.next();
            answer=answer+temp.getGrade()*temp.getWeight();
            credit=credit+temp.getWeight();
        }
        double finalAnswer=answer/credit;
        answer=finalAnswer*1000;
        finalAnswer=Math.round(answer);
        return finalAnswer/1000;
    }
    public double calculatorWithoutFinal(Grades grades, double wants){
        double answer=0, credit=0, finalWeight;
        Iterator<Grade> itr= grades.getIterator();

        while (itr.hasNext()){
            Grade temp= itr.next();
            answer=answer+temp.getGrade()*temp.getWeight();
            credit=credit+temp.getWeight();
        }
        finalWeight=1-credit;
        double finalAnswer=((wants-answer)/finalWeight);
        answer=finalAnswer*1000;
        finalAnswer=Math.round(answer);
        return finalAnswer/1000;
    }
    public double calculatorWithFinal(Grades grades){
        double answer=0, credit=0;
        Iterator<Grade> itr= grades.getIterator();
        while (itr.hasNext()){
            Grade temp= itr.next();
            answer=answer+temp.getGrade()*temp.getWeight();
        }
        double finalAnswer=answer;
        answer=finalAnswer*1000;
        finalAnswer=Math.round(answer);
        return finalAnswer/1000;
    }
    public double calculateCredit(Grades grades){
        Iterator<Grade> itr= grades.getIterator();
        double credit=0;
        while (itr.hasNext()){
            Grade temp= itr.next();
            credit=credit+temp.getWeight();
        }
        return credit;
    }
}
