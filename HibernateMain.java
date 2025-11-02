package com.example.demo.hibernate;

public class HibernateMain {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();

        StudentEntity student = new StudentEntity();
        student.setName("Aatrey");
        student.setCourse("Spring Boot");

        dao.addStudent(student);

        StudentEntity s = dao.getStudent(student.getId());
        System.out.println("Fetched: " + s.getName() + " - " + s.getCourse());
    }
}
