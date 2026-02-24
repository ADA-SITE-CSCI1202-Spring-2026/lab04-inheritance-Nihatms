public class Teacher extends Person {
    private String department;
    private String[] courses;

    Teacher(String firstName, String lastName, String gender, String department, String[] courses) {
        super(firstName, lastName, gender);
        this.department = department;
        this.courses = courses;
    }

    public String getDepartment() {
        return department;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    // toString
    @Override
    public String toString() {
        return "Teacher: " + getFirstName() + " " + getLastName();

    }

    // equals(Teacher t)
    public boolean equals(Teacher t) {
        return this.getFirstName().equals(t.getFirstName()) && this.getLastName().equals(t.getLastName()) && this.department.equals(t.department) && java.util.Arrays.equals(this.courses, t.courses);
        
    }
}
