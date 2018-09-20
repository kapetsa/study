package Ex5;

import java.lang.annotation.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Ex5_4 {
	
	@Target(value=ElementType.TYPE)
	@Retention(value= RetentionPolicy.RUNTIME)
	@Inherited
	public @interface Version{
		double nvers();
		String version() default "";
	}
	
	
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		

if (MyService.class.isAnnotationPresent(Version.class)){
	MyService ms = new MyService("user", 1);
	Method m = MyService.class.getDeclaredMethod("thisClassInfo");
	m.setAccessible(true);
    m.invoke(ms);
}
	}

}
