package JavaTips.myannotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/2/21.</p>
 */
public class PersistStudent {
	public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException,
			                                              InstantiationException, InvocationTargetException {
		Object c = Class.forName("JavaTips.myannotation.Student").newInstance();
		
		Method[] methodArray = c.getClass().getDeclaredMethods();
		for(int i = 0; i < methodArray.length; i++){
			if(methodArray[i].isAnnotationPresent(ValueBind.class)){
				ValueBind annotation = methodArray[i].getAnnotation(ValueBind.class);
				String type = String.valueOf(annotation.type());
				String value = String.valueOf(annotation.value());
				if(type.endsWith("INT")){
					methodArray[i].invoke(c, new Integer[]{new Integer(value)});
				}else {
					methodArray[i].invoke(c, new String[]{value});
				}
			}
		}
		Student annotationStudent = (Student) c;
		System.out.printf("studentId: " + annotationStudent.getStudentId() + "\n" +
						  "studentName: " + annotationStudent.getName() + "\n" +
		                  "studentAge: " + annotationStudent.getAge());
	}
}
