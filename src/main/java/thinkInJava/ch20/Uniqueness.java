package thinkInJava.ch20;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 16/9/7.</p>
 */
public @interface Uniqueness {
	Constraints constraints() default @Constraints(unique = true);
}
