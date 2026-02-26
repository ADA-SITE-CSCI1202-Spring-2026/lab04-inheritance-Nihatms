public class Student extends Person {
    private String studentID;

    Student(String firstName, String lastName, String gender, String studentID){
        super(firstName, lastName, gender);
        this.studentID = studentID;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    // toString
    @Override
    public String toString() {
        return "Student: " + getFirstName() + " " + getLastName() + ", ID: " + studentID;
    }

    public boolean equals(Student s) {
        return super.equals(s) && this.studentID.equals(s.studentID);
    }
    
}

