package java.springbootproxies;

import java.lang.reflect.Proxy;
import java.springbootproxies.classes.Man;
import java.springbootproxies.classes.Person;
import java.springbootproxies.classes.PersonInvocationHandler;

public class App {

    public static void main(String[] args) {

        Man rahul = new Man("Rahul", 22, "delhi", "india");
        ClassLoader rahulClassLoader = rahul.getClass().getClassLoader();
        Class[] interfaces = rahul.getClass().getInterfaces();
        Person proxyRahul = (Person) Proxy.newProxyInstance(rahulClassLoader, interfaces, new PersonInvocationHandler(rahul));
        proxyRahul.introduce(rahul.getName());
    }
}
