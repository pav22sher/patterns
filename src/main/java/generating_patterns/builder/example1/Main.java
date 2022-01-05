package generating_patterns.builder.example1;

public class Main {
    public static void main(String[] args) {
        Complex complex = Complex.builder()
                .re(1)
                .im(1)
                .build();
        System.out.println(complex);
    }
}
