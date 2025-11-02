package com.example.demo.di;

public class Student {
    private Course course;

    public Student(Course course) {
        this.course = course;
    }

    public void showStudentInfo() {
        System.out.println("Student information:");
        course.displayCourse();
    }
}
