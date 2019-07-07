import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Tester {
    List<String> al = new ArrayList<>();

     public Object getMethoddAnnotations (Object object) {
         Class clazz = object.getClass();
         Method [] methods = clazz.getMethods();
         for (Method method : methods) {
            Annotation [] annotations = method.getAnnotations();
            for (Annotation annotation : annotations) {
                al.add(String.valueOf(annotation.toString()));
            }
         }
         return object;
     }
}