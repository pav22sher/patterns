package generating_patterns.simple_factory.example2;

import generating_patterns.simple_factory.example2.cat.Cat;
import generating_patterns.simple_factory.example2.cat.CatType;
import generating_patterns.simple_factory.example2.cat.Lion;
import generating_patterns.simple_factory.example2.cat.Tiger;

public class CatFactory {
    public Cat createCat(CatType type) {
        Cat cat = null;
        switch (type) {
            case LION:
                cat =  new Lion();
                break;
            case TIGER:
                cat = new Tiger();
                break;
        }

        return cat;
    }
}
