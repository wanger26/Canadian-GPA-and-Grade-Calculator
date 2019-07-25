package com.gradeCalculator.gradeandgpacalculator;

import java.util.Iterator;

//Represents a calculator to calculate final grades and/or calculate what grade needs to be earned to finish with a desired grade
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
    //Calculates a grade of what has been eanred before a final evlauation and then return what needs to be achieved in the evaluation to achieve the desired(want) grade
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
    //Calculates a grade from a completed course
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
    //Adds all the weights of the evaluations for a course together
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
