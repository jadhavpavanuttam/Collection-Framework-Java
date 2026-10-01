import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Student {
    int rollNo;

    void printStudent() {
        System.out.println("This is Student Of the Class : " + "Mca First Year .....");
    }
}

public class ReflectionDemo {
    public static void main(String[] args) throws NoSuchMethodException, NullPointerException, Exception {
        Class<?> aClass = Class.forName("Student");
        System.out.println("The Class Name  is : " + aClass.getName());
        Field[] field = aClass.getDeclaredFields();
        for (Field f : field) System.out.println(f);

        Method[] methods = aClass.getDeclaredMethods();
        for (Method me : methods) System.out.println(me);
        boolean student = aClass.getDeclaredConstructor().isAccessible();
        System.out.println("New Object is  Accessible Or Not ?  " + student);
        Constructor constructor = aClass.getDeclaredConstructor();
        System.out.println("The Name Of Constructor is : " + constructor.getName());
    }

}