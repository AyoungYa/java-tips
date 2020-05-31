package thinkInJava.ch20;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 16/9/7.</p>
 */
public class TableCreator {
	public static void main(String[] args) throws ClassNotFoundException {
		if(args.length < 1){
			System.out.println("arguments: annotated classes");
			System.exit(0);
		}
		for (String className: args){
			Class<?> cl = Class.forName(className);
			DBTable dbTable = cl.getAnnotation(DBTable.class);
			if(dbTable == null){
				System.out.println("No DBTable annotations in class " + className);
				continue;
			}
			String tableName = dbTable.name();
			if(tableName.length() < 1)
				tableName = cl.getName().toUpperCase();
			List<String> columnDefs = new ArrayList<>();
			for(Field field: cl.getDeclaredFields()){
				String columnName = null;
				AnnotatedElement a = null;
			}

		}
	}

}
