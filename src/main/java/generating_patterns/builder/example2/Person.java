package generating_patterns.builder.example2;

public class Person {
    private String firstName;
    private String lastName;
    private String secondName;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                '}';
    }

    public static class Builder {
        private Person person;
        public Builder() {
            person = new Person();
        }
        public Builder withFirstName(String firstName){
            person.firstName = firstName;
            return this;
        }
        public Builder withLastName(String lastName){
            person.lastName = lastName;
            return this;
        }
        public Builder withSecondName(String secondName){
            person.lastName = secondName;
            return this;
        }
        public Builder withAge(int age){
            person.age = age;
            return this;
        }
        public Person build(){
            return person;
        }
    }
}
