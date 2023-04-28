package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public String getGradeLevel() {
        if (numberOfCredits > 90) return "Senior";
        if (numberOfCredits > 60) return "Junior";
        if (numberOfCredits > 30) return "Sophomore";
        if (numberOfCredits > 0) return "Freshman";
        return null;
    }

    public void addGrade (double grade, int credits) {

    }

}