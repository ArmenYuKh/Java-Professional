// Создайте несколько классов, один класс наследует другой и использует аннотацию @Inherited.
// Помимо этого, попробуйте ещё в проекте использовать 5 различных аннотаций.

package task3;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
        A a = new B();
        Class<?> cl = a.getClass();
        Method m = cl.getMethod("show", int.class);
        Anno anno = m.getAnnotation(Anno.class);
        a.show(anno.i());
    }
}
