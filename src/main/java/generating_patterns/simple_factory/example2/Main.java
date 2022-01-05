package generating_patterns.simple_factory.example2;

import generating_patterns.simple_factory.example2.cat.Cat;
import generating_patterns.simple_factory.example2.cat.CatType;

public class Main {
    public static void main(String[] args) {
        CatFactory catFactory = new CatFactory();
        Cat lion = catFactory.createCat(CatType.LION);
        lion.say();
        Cat tiger = catFactory.createCat(CatType.TIGER);
        tiger.say();
    }
}
