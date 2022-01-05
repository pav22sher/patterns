package generating_patterns.builder.example2;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.Builder()
                                 .withFirstName("Jane")
                                 .withLastName("Doe")
                                 .withAge(32)
                                 .build();
        System.out.println(person);
    }
}
