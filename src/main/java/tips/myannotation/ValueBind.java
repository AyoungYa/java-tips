package JavaTips.myannotation;

import java.lang.annotation.*;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/2/21.</p>
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ValueBind {
	enum fieldType {
		STRING, INT, DOUBLE
	}
	
	fieldType type();
	String value();
}
