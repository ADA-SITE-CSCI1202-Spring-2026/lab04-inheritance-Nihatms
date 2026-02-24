public class Person {
    private String firstName;
    private String lastName;
    private String gender;

    Person (String firstName, String lastName, String gender){
        this.firstName=firstName;
        this.lastName=lastName;
        this.gender=gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
}

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    //equals(Person p)

    public boolean equals(Person p){
        return this.firstName.equals(p.firstName) && this.lastName.equals(p.lastName) && this.gender.equals(p.gender);
}
    // toString
    @Override
    public String toString() {
        return "Person: " + firstName + " " + lastName + ", Gender: " + gender;
    }
}
