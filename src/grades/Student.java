package grades;


import java.util.ArrayList;

public class Student {



//  private properties
    private String name;
    private ArrayList<Integer> grades;




//  constructor
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }



//  get/set names

    public void setName(String name) {
        this.name = name;
    }




//  returns student's name
    public String getName(){
        return name;
    }


//  adds given grade to grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }


    private double total = 0 ;
//  returns the average of the students grades
    public double getGradeAverage() {
        for(double grade : grades){
            total += grade;
        }
        return total/grades.size();
    }


    public void display() {
        System.out.println("Name: " + getName() + "\n" + "Grade Average: " + getGradeAverage());
    }


    public static void main(String[] args) {
        Student s1 = new Student("Jim");
        s1.addGrade(90);
        s1.addGrade(91);
        s1.addGrade(90);
        System.out.println(s1.getName());
        System.out.println(s1.getGradeAverage());
        Student s2 = new Student("Pam");
        s2.addGrade(88);
        s2.addGrade(92);
        s2.addGrade(98);
        Student s3 = new Student("Michael");
        s3.addGrade(78);
        s3.addGrade(82);
        s3.addGrade(70);
        Student s4 = new Student("Dwight");
        s4.addGrade(98);
        s4.addGrade(92);
        s4.addGrade(100);



    }



}
