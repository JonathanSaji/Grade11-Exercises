package Unit3_ObjectOriented.Student;

public class Student {
    private String firstName;
    private String lastName;
    private double average;
    private int StudentNum;

    public Student(String f,String l, double avg, int SNum){
        this.firstName = f;
        this.lastName = l;
        this.average = avg;
        this.StudentNum = SNum;
    }
    public void setFirstName(String f){
        this.firstName = f;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public void setStudentNum(int studentNum) {
        StudentNum = studentNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getAverage() {
        return average;
    }

    public int getStudentNum() {
        return StudentNum;
    }
}
