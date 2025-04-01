package ge.tbc.testautomation.generics;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public class Main {

    private static <K, D> AnyPair<Field[], Field[]> getDeclaredFields(K objOne, D objTwo) {
        Field[] fieldsOne = objOne.getClass().getDeclaredFields();
        Field[] fieldsTwo = objTwo.getClass().getDeclaredFields();

        return new AnyPair<>(fieldsOne, fieldsTwo);
    }

    public static void main(String[] args) {
        AnyPair<Field[], Field[]> result = getDeclaredFields(1, "Hello");

        List<Field> integerFields = Arrays.asList(result.getElementOne());
        List<Field> stringFields = Arrays.asList(result.getElementTwo());

        System.out.println("Integer Fields: " + integerFields);
        System.out.println("String Fields: " + stringFields);

        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        FigurePair<Circle, Rectangle> figurePair = new FigurePair<>(circle, rectangle);
        System.out.println(figurePair);
    }
}
