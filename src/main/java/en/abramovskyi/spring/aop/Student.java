package en.abramovskyi.spring.aop;

public class Student {
    private String nameSurname;
    private int course;
    private double avGrade;

    public Student(String nameSurname, int course, double avGrade) {
        this.nameSurname = nameSurname;
        this.course = course;
        this.avGrade = avGrade;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvGrade() {
        return avGrade;
    }

    public void setAvGrade(double avGrade) {
        this.avGrade = avGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameSurname='" + nameSurname + '\'' +
                ", course=" + course +
                ", avGrade=" + avGrade +
                '}';
    }
}
