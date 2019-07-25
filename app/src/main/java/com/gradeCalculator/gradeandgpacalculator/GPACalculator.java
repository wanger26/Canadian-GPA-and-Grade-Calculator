package com.gradeCalculator.gradeandgpacalculator;

import java.util.Iterator;

public class GPACalculator {
    public GPACalculator(){}

    /**
    // This method takes in the school's name and the grades provided by the user and will then call on the correct GPA scale calcualtor
    */
    public double calculateGPA(Grades grades, String school){
        if (school.equals("Athabasca University")||school.equals("Concordia University of Edmonton")||school.equals("The King's University")||school.equals("University of Lethbridge"))
            return type1(grades);
        else if (school.equals("MacEwan University"))
            return type2(grades);
        else if (school.equals("Mount Royal University"))
            return type3(grades);
        else if (school.equals("University of Alberta"))
            return type4(grades);
        else if (school.equals("University of Calgary"))
            return type5(grades);
        else if (school.equals("Emily Carr University"))
            return type6(grades);
        else if (school.equals("Kwantlen Polytechnic University")|| school.equals("Vancouver Island University") ||school.equals("Brandon University"))
            return type7(grades);
        else if (school.equals("Royal Roads University")||school.equals("Simon Fraser University")|| school.equals("University of the Fraser Valley"))
            return type8(grades);
        else if (school.equals("The University of British Columbia"))
            return type9(grades);
        else if (school.equals("Thompson Rivers University"))
            return type10(grades);
        else if (school.equals("Trinity Western University")||school.equals("Mount Allison University")||school.equals("Queens University")||school.equals("École de technologie supérieure")||school.equals("École nationale d’administration publique")||school.equals("HEC Montréal")||school.equals("Institut national de la recherche scientifique")||school.equals("Université de Montréal, Université de Sherbrooke")||school.equals("Polytechnique Montréal")||school.equals("Université du Québec à Chicoutimi (UQAC)")||school.equals("Université du Québec à Montréal (UQAM)")||school.equals("Université du Québec à Rimouski (UQAR)")||school.equals("Université du Québec à Trois-Rivières (UQTR)")||school.equals("Université du Québec en Abitibi-Témiscamingue (UQAT)")||school.equals("Université du Québec en Outaouais"))
            return type11(grades);
        else if (school.equals("University of Northern British Columbia")||school.equals("Ryerson University")||school.equals("Université Laval"))
            return type12(grades);
        else if (school.equals("University of Victoria"))
            return type13(grades);
        else if (school.equals("Canadian Mennonite University") || school.equals("The University of Winnipeg")|| school.equals("University of Manitoba"))
            return type14(grades);
        else if (school.equals("St. Paul’s College")||school.equals("Laurentian University") || school.equals("Saint Paul University")|| school.equals("University of Ottawa")|| school.equals("University of Sudbury") )
            return type15(grades);
        else if (school.equals("Memorial University of Newfoundland"))
            return type16(grades);
        else if (school.equals("Acadia University"))
            return type17(grades);
        else if (school.equals("Cape Breton University")|| school.equals("University of Toronto")||school.equals("Trent University")||school.equals("University of Trinity College")||school.equals("McGill University")||school.equals("Campion College")||school.equals("Luther College"))
            return type18(grades);
        else if (school.equals("Dalhousie University"))
            return type19(grades);
        else if (school.equals("Mount Saint Vincent University") || school.equals("Saint Mary’s University"))
            return type20(grades);
        else if (school.equals("NSCAD University"))
            return type21(grades);
        else if (school.equals("St. Francis Xavier University"))
            return type22(grades);
        else if (school.equals("University of King’s College"))
            return type23(grades);
        else if (school.equals("Algoma University") || school.equals("Brescia University College") ||school.equals("Brock University") ||school.equals("Huron University College") ||school.equals("King’s University College") ||school.equals("Lakehead University") ||school.equals("University of Windsor") ||school.equals("Georgian College") ||school.equals("McMaster University") ||school.equals("Nipissing University") ||school.equals("University of Guelph") ||school.equals("University of Waterloo") ||school.equals("Victoria University") ||school.equals("Western University") ||school.equals("Wilfrid Laurier University") ||school.equals("University of Prince Edward Island") ||school.equals("Bishop’s University") ||school.equals("Concordia University") ||school.equals("St. Thomas More College") ||school.equals("University of Regina") ||school.equals("University of Saskatchewan"))
            return type24(grades);
        else if (school.equals("Carleton University"))
            return type25(grades);
        else if (school.equals("Ontario Tech University"))
            return type26(grades);
        else if (school.equals("York University"))
            return type27(grades);
        else return -100;

    }

    private double type1 (Grades grades){
        double answer=0, credit=0;
        Iterator<Grade> itr= grades.getIterator();
        while (itr.hasNext()){
            Grade current= itr.next();
            if (current.getGrade()>=85){
                answer=answer+(4*current.getWeight());
            }
            else if (current.getGrade()>=80){
                answer=answer+(3.7*current.getWeight());
            }
            else if (current.getGrade()>=76){
                answer=answer+(3.3*current.getWeight());
            }
            else if (current.getGrade()>=73){
                answer=answer+(3*current.getWeight());
            }
            else if (current.getGrade()>=70){
                answer=answer+(2.7*current.getWeight());
            }
            else if (current.getGrade()>=67){
                answer=answer+(2.3*current.getWeight());
            }
            else if (current.getGrade()>=64){
                answer=answer+(2*current.getWeight());
            }
            else if (current.getGrade()>=60){
                answer=answer+(1.7*current.getWeight());
            }
            else if (current.getGrade()>=55){
                answer=answer+(1.3*current.getWeight());
            }
            else if (current.getGrade()>=50){
                answer=answer+current.getWeight();
            }
            credit=credit+current.getWeight();
        }
        double finalAnswer=answer/credit;
        answer=finalAnswer*1000;
        finalAnswer=Math.round(answer);
        return finalAnswer/1000;    }

    private double type2 (Grades grades){
        double answer=0, credit=0;
        Iterator<Grade> itr= grades.getIterator();
        while (itr.hasNext()){
            Grade current= itr.next();
            if (current.getGrade()>=90){
                answer=answer+(4*current.getWeight());
            }
            else if (current.getGrade()>=85){
                answer=answer+(3.7*current.getWeight());
            }
            else if (current.getGrade()>=80){
                answer=answer+(3.3*current.getWeight());
            }
            else if (current.getGrade()>=75){
                answer=answer+(3*current.getWeight());
            }
            else if (current.getGrade()>=70){
                answer=answer+(2.7*current.getWeight());
            }
            else if (current.getGrade()>=65){
                answer=answer+(2.3*current.getWeight());
            }
            else if (current.getGrade()>=60){
                answer=answer+(2*current.getWeight());
            }
            else if (current.getGrade()>=55){
                answer=answer+(1.7*current.getWeight());
            }
            else if (current.getGrade()>=50){
                answer=answer+(1.3*current.getWeight());
            }
            else if (current.getGrade()>=45){
                answer=answer+current.getWeight();
            }
            credit=credit+current.getWeight();
        }
        double finalAnswer=answer/credit;
        answer=finalAnswer*1000;
        finalAnswer=Math.round(answer);
        return finalAnswer/1000;
    }

    private double type3 (Grades grades){
        double answer=0, credit=0;
        Iterator<Grade> itr= grades.getIterator();
        while (itr.hasNext()){
            Grade current= itr.next();
            if (current.getGrade()>=85){
                answer=answer+(4*current.getWeight());
            }
            else if (current.getGrade()>=80){
                answer=answer+(3.7*current.getWeight());
            }
            else if (current.getGrade()>=77){
                answer=answer+(3.3*current.getWeight());
            }
            else if (current.getGrade()>=73){
                answer=answer+(3*current.getWeight());
            }
            else if (current.getGrade()>=70){
                answer=answer+(2.7*current.getWeight());
            }
            else if (current.getGrade()>=67){
                answer=answer+(2.3*current.getWeight());
            }
            else if (current.getGrade()>=63){
                answer=answer+(2*current.getWeight());
            }
            else if (current.getGrade()>=60){
                answer=answer+(1.7*current.getWeight());
            }
            else if (current.getGrade()>=55){
                answer=answer+(1.3*current.getWeight());
            }
            else if (current.getGrade()>=50){
                answer=answer+current.getWeight();
            }
            credit=credit+current.getWeight();
        }
        double finalAnswer=answer/credit;
        answer=finalAnswer*1000;
        finalAnswer=Math.round(answer);
        return finalAnswer/1000;    }

    private double type4 (Grades grades){
        double answer=0, credit=0;
        Iterator<Grade> itr= grades.getIterator();
        while (itr.hasNext()){
            Grade current= itr.next();
            if (current.getGrade()>=86){
                answer=answer+(4*current.getWeight());
            }
            else if (current.getGrade()>=82){
                answer=answer+(3.7*current.getWeight());
            }
            else if (current.getGrade()>=78){
                answer=answer+(3.3*current.getWeight());
            }
            else if (current.getGrade()>=74){
                answer=answer+(3*current.getWeight());
            }
            else if (current.getGrade()>=70){
                answer=answer+(2.7*current.getWeight());
            }
            else if (current.getGrade()>=66){
                answer=answer+(2.3*current.getWeight());
            }
            else if (current.getGrade()>=62){
                answer=answer+(2*current.getWeight());
            }
            else if (current.getGrade()>=58){
                answer=answer+(1.7*current.getWeight());
            }
            else if (current.getGrade()>=54){
                answer=answer+(1.3*current.getWeight());
            }
            else if (current.getGrade()>=50){
                answer=answer+current.getWeight();
            }
            credit=credit+current.getWeight();
        }
        double finalAnswer=answer/credit;
        answer=finalAnswer*1000;
        finalAnswer=Math.round(answer);
        return finalAnswer/1000;
    }
    private double type5 (Grades grades){
        double answer=0, credit=0;
        Iterator<Grade> itr= grades.getIterator();
        while (itr.hasNext()){
            Grade current= itr.next();
            if (current.getGrade()>=85){
                answer=answer+(4*current.getWeight());
            }
            else if (current.getGrade()>=80){
                answer=answer+(3.7*current.getWeight());
            }
            else if (current.getGrade()>=77){
                answer=answer+(3.3*current.getWeight());
            }
            else if (current.getGrade()>=74){
                answer=answer+(3*current.getWeight());
            }
            else if (current.getGrade()>=70){
                answer=answer+(2.7*current.getWeight());
            }
            else if (current.getGrade()>=67){
                answer=answer+(2.3*current.getWeight());
            }
            else if (current.getGrade()>=64){
                answer=answer+(2*current.getWeight());
            }
            else if (current.getGrade()>=60){
                answer=answer+(1.7*current.getWeight());
            }
            else if (current.getGrade()>=55){
                answer=answer+(1.3*current.getWeight());
            }
            else if (current.getGrade()>=50){
                answer=answer+current.getWeight();
            }
            credit=credit+current.getWeight();
        }
        double finalAnswer=answer/credit;
        answer=finalAnswer*1000;
        finalAnswer=Math.round(answer);
        return finalAnswer/1000;
    }
    private double type6 (Grades grades){
        double answer=0, credit=0;
        Iterator<Grade> itr= grades.getIterator();
        while (itr.hasNext()){
            Grade current= itr.next();
            if (current.getGrade()>=95){
                answer=answer+(4.33*current.getWeight());
            }
            else if (current.getGrade()>=90){
                answer=answer+(4*current.getWeight());
            }
            else if (current.getGrade()>=85){
                answer=answer+(3.67*current.getWeight());
            }
            else if (current.getGrade()>=80){
                answer=answer+(3.33*current.getWeight());
            }
            else if (current.getGrade()>=75){
                answer=answer+(3*current.getWeight());
            }
            else if (current.getGrade()>=70){
                answer=answer+(2.67*current.getWeight());
            }
            else if (current.getGrade()>=65){
                answer=answer+(2.33*current.getWeight());
            }
            else if (current.getGrade()>=60){
                answer=answer+(2*current.getWeight());
            }
            else if (current.getGrade()>=55){
                answer=answer+(1.67*current.getWeight());
            }
            else if (current.getGrade()>=50){
                answer=answer+current.getWeight();
            }
            credit=credit+current.getWeight();
        }
        double finalAnswer=answer/credit;
        answer=finalAnswer*1000;
        finalAnswer=Math.round(answer);
        return finalAnswer/1000;
    }
    private double type7 (Grades grades){
        double answer=0, credit=0;
        Iterator<Grade> itr= grades.getIterator();
        while (itr.hasNext()){
            Grade current= itr.next();
            if (current.getGrade()>=90){
                answer=answer+(4.33*current.getWeight());
            }
            else if (current.getGrade()>=85){
                answer=answer+(4*current.getWeight());
            }
            else if (current.getGrade()>=80){
                answer=answer+(3.67*current.getWeight());
            }
            else if (current.getGrade()>=76){
                answer=answer+(3.33*current.getWeight());
            }
            else if (current.getGrade()>=72){
                answer=answer+(3.0*current.getWeight());
            }
            else if (current.getGrade()>=68){
                answer=answer+(2.67*current.getWeight());
            }
            else if (current.getGrade()>=64){
                answer=answer+(2.33*current.getWeight());
            }
            else if (current.getGrade()>=60){
                answer=answer+(2.0*current.getWeight());
            }
            else if (current.getGrade()>=56){
                answer=answer+(1.67*current.getWeight());
            }
            else if (current.getGrade()>=50){
                answer=answer+current.getWeight();
            }
            credit=credit+current.getWeight();
        }
        double finalAnswer=answer/credit;
        answer=finalAnswer*1000;
        finalAnswer=Math.round(answer);
        return finalAnswer/1000;
    }
    private double type8 (Grades grades){
        double answer=0, credit=0;
        Iterator<Grade> itr= grades.getIterator();
        while (itr.hasNext()){
            Grade current= itr.next();
            if (current.getGrade()>=90){
                answer=answer+(4.33*current.getWeight());
            }
            else if (current.getGrade()>=85){
                answer=answer+(4*current.getWeight());
            }
            else if (current.getGrade()>=80){
                answer=answer+(3.67*current.getWeight());
            }
            else if (current.getGrade()>=77){
                answer=answer+(3.33*current.getWeight());
            }
            else if (current.getGrade()>=73){
                answer=answer+(3.0*current.getWeight());
            }
            else if (current.getGrade()>=70){
                answer=answer+(2.67*current.getWeight());
            }
            else if (current.getGrade()>=67){
                answer=answer+(2.33*current.getWeight());
            }
            else if (current.getGrade()>=63){
                answer=answer+(2.0*current.getWeight());
            }
            else if (current.getGrade()>=60){
                answer=answer+(1.67*current.getWeight());
            }
            else if (current.getGrade()>=50){
                answer=answer+current.getWeight();
            }
            credit=credit+current.getWeight();
        }
        double finalAnswer=answer/credit;
        answer=finalAnswer*1000;
        finalAnswer=Math.round(answer);
        return finalAnswer/1000;
    }
    private double type9 (Grades grades){
        double answer=0, credit=0;
        Iterator<Grade> itr= grades.getIterator();
        while (itr.hasNext()){
            Grade current= itr.next();
            if (current.getGrade()>=90){
                answer=answer+(4.33*current.getWeight());
            }else if (current.getGrade()>=89){
                answer=answer+(4.30*current.getWeight());
            }else if (current.getGrade()>=88){
                answer=answer+(4.2*current.getWeight());
            }else if (current.getGrade()>=87){
                answer=answer+(4.1*current.getWeight());
            }else if (current.getGrade()>=86){
                answer=answer+(4.0*current.getWeight());
            }else if (current.getGrade()>=85){
                answer=answer+(3.95*current.getWeight());
            }else if (current.getGrade()>=84){
                answer=answer+(3.9*current.getWeight());
            }else if (current.getGrade()>=83){
                answer=answer+(3.85*current.getWeight());
            }else if (current.getGrade()>=82){
                answer=answer+(3.80*current.getWeight());
            }else if (current.getGrade()>=81){
                answer=answer+3.75*current.getWeight();
            }else if (current.getGrade()>=80){
                answer=answer+3.70*current.getWeight();
            }else if (current.getGrade()>=79){
                answer=answer+3.60*current.getWeight();
            }else if (current.getGrade()>=78){
                answer=answer+3.50*current.getWeight();
            }else if (current.getGrade()>=77){
                answer=answer+3.40*current.getWeight();
            }else if (current.getGrade()>=76){
                answer=answer+3.30*current.getWeight();
            }else if (current.getGrade()>=75){
                answer=answer+3.20*current.getWeight();
            }else if (current.getGrade()>=74){
                answer=answer+3.10*current.getWeight();
            }else if (current.getGrade()>=73){
                answer=answer+3.0*current.getWeight();
            }else if (current.getGrade()>=72){
                answer=answer+2.95*current.getWeight();
            }else if (current.getGrade()>=71){
                answer=answer+2.90*current.getWeight();
            }else if (current.getGrade()>=70){
                answer=answer+2.80*current.getWeight();
            }else if (current.getGrade()>=69){
                answer=answer+2.70*current.getWeight();
            }else if (current.getGrade()>=68){
                answer=answer+2.65*current.getWeight();
            }else if (current.getGrade()>=67){
                answer=answer+2.60*current.getWeight();
            }else if (current.getGrade()>=66){
                answer=answer+2.55*current.getWeight();
            }else if (current.getGrade()>=65){
                answer=answer+2.50*current.getWeight();
            }else if (current.getGrade()>=64){
                answer=answer+2.40*current.getWeight();
            }else if (current.getGrade()>=63){
                answer=answer+2.30*current.getWeight();
            }else if (current.getGrade()>=62){
                answer=answer+2.20*current.getWeight();
            }else if (current.getGrade()>=61){
                answer=answer+2.10*current.getWeight();
            }else if (current.getGrade()>=60){
                answer=answer+2.0*current.getWeight();
            }else if (current.getGrade()>=59){
                answer=answer+1.90*current.getWeight();
            }else if (current.getGrade()>=58){
                answer=answer+1.80*current.getWeight();
            }else if (current.getGrade()>=57){
                answer=answer+1.70*current.getWeight();
            }else if (current.getGrade()>=56){
                answer=answer+1.60*current.getWeight();
            }else if (current.getGrade()>=55){
                answer=answer+1.50*current.getWeight();
            }else if (current.getGrade()>=54){
                answer=answer+1.40*current.getWeight();
            }else if (current.getGrade()>=53){
                answer=answer+1.30*current.getWeight();
            }else if (current.getGrade()>=52){
                answer=answer+1.20*current.getWeight();
            }else if (current.getGrade()>=51){
                answer=answer+1.10*current.getWeight();
            }else if (current.getGrade()>=50){
                answer=answer+current.getWeight();
            }
            credit=credit+current.getWeight();
        }
        double finalAnswer=answer/credit;
        answer=finalAnswer*1000;
        finalAnswer=Math.round(answer);
        return finalAnswer/1000;
    }

    private double type10 (Grades grades){
        double answer=0, credit=0;
        Iterator<Grade> itr= grades.getIterator();
        while (itr.hasNext()){
            Grade current= itr.next();
            if (current.getGrade()>=90){
                answer=answer+(4.33*current.getWeight());
            }
            else if (current.getGrade()>=85){
                answer=answer+(4*current.getWeight());
            }
            else if (current.getGrade()>=80){
                answer=answer+(3.67*current.getWeight());
            }
            else if (current.getGrade()>=77){
                answer=answer+(3.33*current.getWeight());
            }
            else if (current.getGrade()>=73){
                answer=answer+(3.0*current.getWeight());
            }
            else if (current.getGrade()>=70){
                answer=answer+(2.67*current.getWeight());
            }
            credit=credit+current.getWeight();
        }
        double finalAnswer=answer/credit;
        answer=finalAnswer*1000;
        finalAnswer=Math.round(answer);
        return finalAnswer/1000;
    }
    private double type11 (Grades grades){
        double answer=0, credit=0;
        Iterator<Grade> itr= grades.getIterator();
        while (itr.hasNext()){
            Grade current= itr.next();
            if (current.getGrade()>=90){
                answer=answer+(4.3*current.getWeight());
            }
            else if (current.getGrade()>=85){
                answer=answer+(4.0*current.getWeight());
            }
            else if (current.getGrade()>=80){
                answer=answer+(3.7*current.getWeight());
            }
            else if (current.getGrade()>=77){
                answer=answer+(3.3*current.getWeight());
            }
            else if (current.getGrade()>=73){
                answer=answer+(3.0*current.getWeight());
            }
            else if (current.getGrade()>=70){
                answer=answer+(2.7*current.getWeight());
            }
            else if (current.getGrade()>=67){
                answer=answer+(2.3*current.getWeight());
            }
            else if (current.getGrade()>=63){
                answer=answer+(2.0*current.getWeight());
            }
            else if (current.getGrade()>=60){
                answer=answer+(1.7*current.getWeight());
            }
            else if (current.getGrade()>=57){
                answer=answer+(1.3*current.getWeight());
            }
            else if (current.getGrade()>=53){
                answer=answer+(1.0*current.getWeight());
            }
            else if (current.getGrade()>=50){
                answer=answer+0.7*current.getWeight();
            }
            credit=credit+current.getWeight();
        }
        double finalAnswer=answer/credit;
        answer=finalAnswer*1000;
        finalAnswer=Math.round(answer);
        return finalAnswer/1000;
    }

    private double type12 (Grades grades){
        double answer=0, credit=0;
        Iterator<Grade> itr= grades.getIterator();
        while (itr.hasNext()){
            Grade current= itr.next();
            if (current.getGrade()>=90){
                answer=answer+(4.33*current.getWeight());
            }
            else if (current.getGrade()>=85){
                answer=answer+(4*current.getWeight());
            }
            else if (current.getGrade()>=80){
                answer=answer+(3.67*current.getWeight());
            }
            else if (current.getGrade()>=77){
                answer=answer+(3.33*current.getWeight());
            }
            else if (current.getGrade()>=73){
                answer=answer+(3.0*current.getWeight());
            }
            else if (current.getGrade()>=70){
                answer=answer+(2.67*current.getWeight());
            }
            else if (current.getGrade()>=67){
                answer=answer+(2.33*current.getWeight());
            }
            else if (current.getGrade()>=63){
                answer=answer+(2.0*current.getWeight());
            }
            else if (current.getGrade()>=60){
                answer=answer+(1.67*current.getWeight());
            }
            else if (current.getGrade()>=57){
                answer=answer+(1.33*current.getWeight());
            }
            else if (current.getGrade()>=53){
                answer=answer+current.getWeight();
            }
            else if (current.getGrade()>=50){
                answer=answer+0.67*current.getWeight();
            }
            credit=credit+current.getWeight();
        }
        double finalAnswer=answer/credit;
        answer=finalAnswer*1000;
        finalAnswer=Math.round(answer);
        return finalAnswer/1000;
    }

    private double type13 (Grades grades){
        double answer=0, credit=0;
        Iterator<Grade> itr= grades.getIterator();
        while (itr.hasNext()){
            Grade current= itr.next();
            if (current.getGrade()>=90){
                answer=answer+(9*current.getWeight());
            }
            else if (current.getGrade()>=85){
                answer=answer+(8*current.getWeight());
            }
            else if (current.getGrade()>=80){
                answer=answer+(7*current.getWeight());
            }
            else if (current.getGrade()>=77){
                answer=answer+(6*current.getWeight());
            }
            else if (current.getGrade()>=73){
                answer=answer+(5*current.getWeight());
            }
            else if (current.getGrade()>=70){
                answer=answer+(4*current.getWeight());
            }
            else if (current.getGrade()>=65){
                answer=answer+(3*current.getWeight());
            }
            else if (current.getGrade()>=60){
                answer=answer+(2*current.getWeight());
            }
            else if (current.getGrade()>=50){
                answer=answer+(current.getWeight());
            }
            credit=credit+current.getWeight();
        }
        double finalAnswer=answer/credit;
        answer=finalAnswer*1000;
        finalAnswer=Math.round(answer);
        return finalAnswer/1000;
    }

    private double type14 (Grades grades){
        double answer=0, credit=0;
        Iterator<Grade> itr= grades.getIterator();
        while (itr.hasNext()){
            Grade current= itr.next();
            if (current.getGrade()>=90){
                answer=answer+(4.5*current.getWeight());
            }
            else if (current.getGrade()>=80){
                answer=answer+(4.0*current.getWeight());
            }
            else if (current.getGrade()>=75){
                answer=answer+(3.5*current.getWeight());
            }
            else if (current.getGrade()>=70){
                answer=answer+(3*current.getWeight());
            }
            else if (current.getGrade()>=65){
                answer=answer+(2.5*current.getWeight());
            }
            else if (current.getGrade()>=60){
                answer=answer+(2*current.getWeight());
            }
            else if (current.getGrade()>=50){
                answer=answer+(current.getWeight());
            }
            credit=credit+current.getWeight();
        }
        double finalAnswer=answer/credit;
        answer=finalAnswer*1000;
        finalAnswer=Math.round(answer);
        return finalAnswer/1000;
    }
    private double type15 (Grades grades){
        double answer=0, credit=0;
        Iterator<Grade> itr= grades.getIterator();
        while (itr.hasNext()){
            Grade current= itr.next();
            if (current.getGrade()>=90){
                answer=answer+(10*current.getWeight());
            }
            else if (current.getGrade()>=85){
                answer=answer+(9*current.getWeight());
            }
            else if (current.getGrade()>=80){
                answer=answer+(8*current.getWeight());
            }
            else if (current.getGrade()>=75){
                answer=answer+(7*current.getWeight());
            }
            else if (current.getGrade()>=70){
                answer=answer+(6*current.getWeight());
            }
            else if (current.getGrade()>=65){
                answer=answer+(5*current.getWeight());
            }
            else if (current.getGrade()>=60){
                answer=answer+(4*current.getWeight());
            }
            else if (current.getGrade()>=55){
                answer=answer+(3*current.getWeight());
            }
            else if (current.getGrade()>=50){
                answer=answer+(2*current.getWeight());
            }
            else if (current.getGrade()>=40){
                answer=answer+(current.getWeight());
            }
            credit=credit+current.getWeight();
        }
        double finalAnswer=answer/credit;
        answer=finalAnswer*1000;
        finalAnswer=Math.round(answer);
        return finalAnswer/1000;
    }

    private double type16 (Grades grades){
        double answer=0, credit=0;
        Iterator<Grade> itr= grades.getIterator();
        while (itr.hasNext()){
            Grade current= itr.next();
            if (current.getGrade()>=80){
                answer=answer+(4*current.getWeight());
            }
            else if (current.getGrade()>=65){
                answer=answer+(3*current.getWeight());
            }
            else if (current.getGrade()>=55){
                answer=answer+(2*current.getWeight());
            }
            else if (current.getGrade()>=50){
                answer=answer+(current.getWeight());
            }
            credit=credit+current.getWeight();
        }
        double finalAnswer=answer/credit;
        answer=finalAnswer*1000;
        finalAnswer=Math.round(answer);
        return finalAnswer/1000;
    }
    private double type17 (Grades grades){
        double answer=0, credit=0;
        Iterator<Grade> itr= grades.getIterator();
        while (itr.hasNext()){
            Grade current= itr.next();
            if (current.getGrade()>=87){
                answer=answer+(4*current.getWeight());
            }
            else if (current.getGrade()>=80){
                answer=answer+(3.67*current.getWeight());
            }
            else if (current.getGrade()>=77){
                answer=answer+(3.33*current.getWeight());
            }
            else if (current.getGrade()>=73){
                answer=answer+(3.0*current.getWeight());
            }
            else if (current.getGrade()>=70){
                answer=answer+(2.67*current.getWeight());
            }
            else if (current.getGrade()>=67){
                answer=answer+(2.33*current.getWeight());
            }
            else if (current.getGrade()>=63){
                answer=answer+(2.0*current.getWeight());
            }
            else if (current.getGrade()>=60){
                answer=answer+(1.67*current.getWeight());
            }
            else if (current.getGrade()>=57){
                answer=answer+(1.33*current.getWeight());
            }
            else if (current.getGrade()>=53){
                answer=answer+(current.getWeight());
            }
            else if (current.getGrade()>=50){
                answer=answer+(0.67*current.getWeight());
            }
            credit=credit+current.getWeight();
        }
        double finalAnswer=answer/credit;
        answer=finalAnswer*1000;
        finalAnswer=Math.round(answer);
        return finalAnswer/1000;
    }

    private double type18 (Grades grades){
        double answer=0, credit=0;
        Iterator<Grade> itr= grades.getIterator();
        while (itr.hasNext()){
            Grade current= itr.next();
            if (current.getGrade()>=85){
                answer=answer+(4*current.getWeight());
            }
            else if (current.getGrade()>=80){
                answer=answer+(3.7*current.getWeight());
            }
            else if (current.getGrade()>=77){
                answer=answer+(3.3*current.getWeight());
            }
            else if (current.getGrade()>=73){
                answer=answer+(3.0*current.getWeight());
            }
            else if (current.getGrade()>=70){
                answer=answer+(2.7*current.getWeight());
            }
            else if (current.getGrade()>=67){
                answer=answer+(2.3*current.getWeight());
            }
            else if (current.getGrade()>=63){
                answer=answer+(2.0*current.getWeight());
            }
            else if (current.getGrade()>=60){
                answer=answer+(1.7*current.getWeight());
            }
            else if (current.getGrade()>=57){
                answer=answer+(1.3*current.getWeight());
            }
            else if (current.getGrade()>=53){
                answer=answer+(current.getWeight());
            }
            else if (current.getGrade()>=50){
                answer=answer+(0.7*current.getWeight());
            }
            credit=credit+current.getWeight();
        }
        double finalAnswer=answer/credit;
        answer=finalAnswer*1000;
        finalAnswer=Math.round(answer);
        return finalAnswer/1000;
    }
    private double type19 (Grades grades){
        double answer=0, credit=0;
        Iterator<Grade> itr= grades.getIterator();
        while (itr.hasNext()){
            Grade current= itr.next();
            if (current.getGrade()>=90){
                answer=answer+(4.3*current.getWeight());
            }
            else if (current.getGrade()>=85){
                answer=answer+(4.0*current.getWeight());
            }
            else if (current.getGrade()>=80){
                answer=answer+(3.7*current.getWeight());
            }
            else if (current.getGrade()>=77){
                answer=answer+(3.3*current.getWeight());
            }
            else if (current.getGrade()>=73){
                answer=answer+(3.0*current.getWeight());
            }
            else if (current.getGrade()>=70){
                answer=answer+(2.7*current.getWeight());
            }
            else if (current.getGrade()>=65){
                answer=answer+(2.3*current.getWeight());
            }
            else if (current.getGrade()>=60){
                answer=answer+(2.0*current.getWeight());
            }
            else if (current.getGrade()>=55){
                answer=answer+(1.7*current.getWeight());
            }
            else if (current.getGrade()>=50){
                answer=answer+(current.getWeight());
            }
            credit=credit+current.getWeight();
        }
        double finalAnswer=answer/credit;
        answer=finalAnswer*1000;
        finalAnswer=Math.round(answer);
        return finalAnswer/1000;
    }

    private double type20 (Grades grades){
        double answer=0, credit=0;
        Iterator<Grade> itr= grades.getIterator();
        while (itr.hasNext()){
            Grade current= itr.next();
            if (current.getGrade()>=90){
                answer=answer+(4.3*current.getWeight());
            }
            else if (current.getGrade()>=85){
                answer=answer+(4.0*current.getWeight());
            }
            else if (current.getGrade()>=80){
                answer=answer+(3.7*current.getWeight());
            }
            else if (current.getGrade()>=77){
                answer=answer+(3.3*current.getWeight());
            }
            else if (current.getGrade()>=73){
                answer=answer+(3.0*current.getWeight());
            }
            else if (current.getGrade()>=70){
                answer=answer+(2.7*current.getWeight());
            }
            else if (current.getGrade()>=67){
                answer=answer+(2.3*current.getWeight());
            }
            else if (current.getGrade()>=63){
                answer=answer+(2.0*current.getWeight());
            }
            else if (current.getGrade()>=60){
                answer=answer+(1.7*current.getWeight());
            }
            else if (current.getGrade()>=50){
                answer=answer+(current.getWeight());
            }
            credit=credit+current.getWeight();
        }
        double finalAnswer=answer/credit;
        answer=finalAnswer*1000;
        finalAnswer=Math.round(answer);
        return finalAnswer/1000;
    }

    private double type21 (Grades grades){
        double answer=0, credit=0;
        Iterator<Grade> itr= grades.getIterator();
        while (itr.hasNext()){
            Grade current= itr.next();
            if (current.getGrade()>=95){
                answer=answer+(4.3*current.getWeight());
            }
            else if (current.getGrade()>=90){
                answer=answer+(4.0*current.getWeight());
            }
            else if (current.getGrade()>=85){
                answer=answer+(3.7*current.getWeight());
            }
            else if (current.getGrade()>=80){
                answer=answer+(3.3*current.getWeight());
            }
            else if (current.getGrade()>=73){
                answer=answer+(3.0*current.getWeight());
            }
            else if (current.getGrade()>=67){
                answer=answer+(2.7*current.getWeight());
            }
            else if (current.getGrade()>=63){
                answer=answer+(2.3*current.getWeight());
            }
            else if (current.getGrade()>=59){
                answer=answer+(2.0*current.getWeight());
            }
            else if (current.getGrade()>=55){
                answer=answer+(1.7*current.getWeight());
            }
            else if (current.getGrade()>=50){
                answer=answer+(current.getWeight());
            }
            credit=credit+current.getWeight();
        }
        double finalAnswer=answer/credit;
        answer=finalAnswer*1000;
        finalAnswer=Math.round(answer);
        return finalAnswer/1000;
    }

    private double type22 (Grades grades){
        double answer=0, credit=0;
        Iterator<Grade> itr= grades.getIterator();
        while (itr.hasNext()){
            Grade current= itr.next();
            if (current.getGrade()>=90){
                answer=answer+(4.0*current.getWeight());
            }
            else if (current.getGrade()>=85){
                answer=answer+(3.9*current.getWeight());
            }
            else if (current.getGrade()>=80){
                answer=answer+(3.7*current.getWeight());
            }
            else if (current.getGrade()>=77){
                answer=answer+(3.3*current.getWeight());
            }
            else if (current.getGrade()>=73){
                answer=answer+(3.0*current.getWeight());
            }
            else if (current.getGrade()>=70){
                answer=answer+(2.7*current.getWeight());
            }
            else if (current.getGrade()>=67){
                answer=answer+(2.3*current.getWeight());
            }
            credit=credit+current.getWeight();
        }
        double finalAnswer=answer/credit;
        answer=finalAnswer*1000;
        finalAnswer=Math.round(answer);
        return finalAnswer/1000;
    }

    private double type23 (Grades grades){
        double answer=0, credit=0;
        Iterator<Grade> itr= grades.getIterator();
        while (itr.hasNext()){
            Grade current= itr.next();
            if (current.getGrade()>=90){
                answer=answer+(4.3*current.getWeight());
            }
            else if (current.getGrade()>=85){
                answer=answer+(4.0*current.getWeight());
            }
            else if (current.getGrade()>=80){
                answer=answer+(3.7*current.getWeight());
            }
            else if (current.getGrade()>=77){
                answer=answer+(3.3*current.getWeight());
            }
            else if (current.getGrade()>=73){
                answer=answer+(3.0*current.getWeight());
            }
            else if (current.getGrade()>=70){
                answer=answer+(2.7*current.getWeight());
            }
            credit=credit+current.getWeight();
        }
        double finalAnswer=answer/credit;
        answer=finalAnswer*1000;
        finalAnswer=Math.round(answer);
        return finalAnswer/1000;
    }
    private double type24 (Grades grades){
        double answer=0, credit=0;
        Iterator<Grade> itr= grades.getIterator();
        while (itr.hasNext()){
            Grade current= itr.next();
            credit=credit+current.getWeight();
            if (current.getGrade()>=90){
                answer=answer+(4*current.getWeight());
            }
            else if (current.getGrade()>=85){
                answer=answer+(3.9*current.getWeight());
            }
            else if (current.getGrade()>=80){
                answer=answer+(3.7*current.getWeight());
            }
            else if (current.getGrade()>=77){
                answer=answer+(3.3*current.getWeight());
            }
            else if (current.getGrade()>=73){
                answer=answer+(3.0*current.getWeight());
            }
            else if (current.getGrade()>=70){
                answer=answer+(2.7*current.getWeight());
            }
            else if (current.getGrade()>=67){
                answer=answer+(2.3*current.getWeight());
            }
            else if (current.getGrade()>=63){
                answer=answer+(2*current.getWeight());
            }
            else if (current.getGrade()>=60){
                answer=answer+(1.7*current.getWeight());
            }
            else if (current.getGrade()>=57){
                answer=answer+(1.3*current.getWeight());
            }
            else if (current.getGrade()>=53){
                answer=answer+(current.getWeight());
            }
            else if (current.getGrade()>=50){
                answer=answer+(0.7*current.getWeight());
            }
        }
        double finalAnswer=answer/credit;
        answer=finalAnswer*1000;
        finalAnswer=Math.round(answer);
        return finalAnswer/1000;
    }
    private double type25 (Grades grades){
        double answer=0, credit=0;
        Iterator<Grade> itr= grades.getIterator();
        while (itr.hasNext()){
            Grade current= itr.next();
            if (current.getGrade()>=90){
                answer=answer+(6*current.getWeight());
            }
            else if (current.getGrade()>=85){
                answer=answer+(5.5*current.getWeight());
            }
            else if (current.getGrade()>=80){
                answer=answer+(5.0*current.getWeight());
            }
            else if (current.getGrade()>=77){
                answer=answer+(4.5*current.getWeight());
            }
            else if (current.getGrade()>=73){
                answer=answer+(4.0*current.getWeight());
            }
            else if (current.getGrade()>=70){
                answer=answer+(3.5*current.getWeight());
            }
            else if (current.getGrade()>=67){
                answer=answer+(3.0*current.getWeight());
            }
            else if (current.getGrade()>=63){
                answer=answer+(2.5*current.getWeight());
            }
            else if (current.getGrade()>=60){
                answer=answer+(2.0*current.getWeight());
            }
            else if (current.getGrade()>=57){
                answer=answer+(1.5*current.getWeight());
            }
            else if (current.getGrade()>=53){
                answer=answer+(current.getWeight());
            }
            else if (current.getGrade()>=50){
                answer=answer+(0.5*current.getWeight());
            }
            credit=credit+current.getWeight();
        }
        double finalAnswer=answer/credit;
        answer=finalAnswer*1000;
        finalAnswer=Math.round(answer);
        return finalAnswer/1000;
    }
    private double type26 (Grades grades){
        double answer=0, credit=0;
        Iterator<Grade> itr= grades.getIterator();
        while (itr.hasNext()){
            Grade current= itr.next();
            if (current.getGrade()>=90){
                answer=answer+(4.3*current.getWeight());
            }
            else if (current.getGrade()>=85){
                answer=answer+(4.0*current.getWeight());
            }
            else if (current.getGrade()>=80){
                answer=answer+(3.7*current.getWeight());
            }
            else if (current.getGrade()>=77){
                answer=answer+(3.3*current.getWeight());
            }
            else if (current.getGrade()>=73){
                answer=answer+(3.0*current.getWeight());
            }
            else if (current.getGrade()>=70){
                answer=answer+(2.7*current.getWeight());
            }
            else if (current.getGrade()>=67){
                answer=answer+(2.3*current.getWeight());
            }
            else if (current.getGrade()>=60){
                answer=answer+(2.0*current.getWeight());
            }
            else if (current.getGrade()>=50){
                answer=answer+(current.getWeight());
            }
            credit=credit+current.getWeight();
        }
        double finalAnswer=answer/credit;
        answer=finalAnswer*1000;
        finalAnswer=Math.round(answer);
        return finalAnswer/1000;
    }
    private double type27 (Grades grades){
        double answer=0, credit=0;
        Iterator<Grade> itr= grades.getIterator();
        while (itr.hasNext()){
            Grade current= itr.next();
            if (current.getGrade()>=90){
                answer=answer+(4*current.getWeight());
            }
            else if (current.getGrade()>=80){
                answer=answer+(3.8*current.getWeight());
            }
            else if (current.getGrade()>=75){
                answer=answer+(3.3*current.getWeight());
            }
            else if (current.getGrade()>=70){
                answer=answer+(3.0*current.getWeight());
            }
            else if (current.getGrade()>=65){
                answer=answer+(2.30*current.getWeight());
            }
            else if (current.getGrade()>=60){
                answer=answer+(2.0*current.getWeight());
            }
            else if (current.getGrade()>=55){
                answer=answer+(1.3*current.getWeight());
            }
            else if (current.getGrade()>=50){
                answer=answer+(current.getWeight());
            }
            credit=credit+current.getWeight();
        }
        double finalAnswer=answer/credit;
        answer=finalAnswer*1000;
        finalAnswer=Math.round(answer);
        return finalAnswer/1000;
    }
}
