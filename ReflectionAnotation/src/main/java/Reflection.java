import java.lang.reflect.*;

public class Reflection {
    public static void main(String[] args) throws ClassNotFoundException {
        Student student = new Student();
        Class c = student.getClass();
        System.out.println(c.getName());
        // 3 способи викликать клас
//        Class cl = Student.class;
//        Class cll = Class.forName("Reflection");
        System.out.println(c);
        //Для створення нового інстанса студент, не робить, бо студенти = статік
//        Student student1 = (Student) c.newInstance();
        Constructor [] constructors = c.getDeclaredConstructors();
        for (Constructor constructor : constructors){
            System.out.println(constructor.getName());
            Parameter[] parameters = constructor.getParameters();
            for (Parameter parameter : parameters){
                System.out.println(parameter.getType().getName());

            }
        }
        System.out.println("____________________");
        Method [] methods = c.getDeclaredMethods();
        System.out.println("METODS:");
        for (Method method : methods){
            System.out.println(method.getName());
            Parameter[] parameters = method.getParameters();
            for (Parameter parameter : parameters){
                System.out.println(parameter.getType().getName());
            }
            System.out.println(Modifier.toString(method.getModifiers()));
        }
        System.out.println("FIELDS :");
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields){
            System.out.println(field.getName());
            System.out.println(field.getType().getName());
            System.out.println(Modifier.toString(field.getModifiers()));
        }
    }
}

class Student {
    private static int age;
    String name;
    public Student() {
    }
    public String someMethod(String s){
        return s;
    }
}
