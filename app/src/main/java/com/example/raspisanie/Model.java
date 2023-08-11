package com.example.raspisanie;

public class Model {
    private String day;
    private String lesson1, lesson2, lesson3, lesson4, lesson5;
    private String subject1, subject2, subject3, subject4, subject5;
    private String teacher1, teacher2, teacher3, teacher4, teacher5;

    public Model (String day,
                  String lesson1, String lesson2, String lesson3, String lesson4, String lesson5,
                  String subject1, String subject2, String subject3, String subject4, String subject5,
                  String teacher1, String teacher2, String teacher3, String teacher4, String teacher5){
        this.day = day;

        this.lesson1 = lesson1;
        this.lesson2 = lesson2;
        this.lesson3 = lesson3;
        this.lesson4 = lesson4;
        this.lesson5 = lesson5;

        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
        this.subject5 = subject5;

        this.teacher1 = teacher1;
        this.teacher2 = teacher2;
        this.teacher3 = teacher3;
        this.teacher4 = teacher4;
        this.teacher5 = teacher5;
    }
    public String  getDay(){return  day;}

    public String  getLesson1(){return  lesson1;}
    public String  getLesson2(){return  lesson2;}
    public String  getLesson3(){return  lesson3;}
    public String  getLesson4(){return  lesson4;}
    public String  getLesson5(){return  lesson5;}

    public String  getSubject1(){return  subject1;}
    public String  getSubject2(){return  subject2;}
    public String  getSubject3(){return  subject3;}
    public String  getSubject4(){return  subject4;}
    public String  getSubject5(){return  subject5;}

    public String  getTeacher1(){return  teacher1;}
    public String  getTeacher2(){return  teacher2;}
    public String  getTeacher3(){return  teacher3;}
    public String  getTeacher4(){return  teacher4;}
    public String  getTeacher5(){return  teacher5;}

}
