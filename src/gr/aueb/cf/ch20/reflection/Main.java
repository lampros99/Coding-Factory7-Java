package gr.aueb.cf.ch20.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException,
            InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> clazz = Teacher.class;
        Class<?> aClass = Class.forName("gr.aueb.cf.ch20.reflaction.Teacher");

        Constructor<?> publicConstractors = Teacher.class.getConstructor();
        Constructor<?> constructorList = Teacher.class.getDeclaredConstructor();

        Constructor<?> defaultCtor = clazz.getDeclaredConstructor();
        defaultCtor.setAccessible(true);

        Teacher teacher = (Teacher) defaultCtor.newInstance();

        Constructor<?> intCtor = Teacher.class.getConstructor((Long.class));

        Constructor<?> overloadedCtor = clazz.getConstructor(Long.class, String.class, String.class);

        Method sayHello = clazz.getMethod("sayHello");
        sayHello.invoke(teacher);


    }
}
