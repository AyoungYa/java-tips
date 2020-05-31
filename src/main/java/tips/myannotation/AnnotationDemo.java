package JavaTips.myannotation;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/2/21.</p>
 */
@MyAnnotation(value = "annotation1")
public class AnnotationDemo {
	
	@MyAnnotation2(description = "testFunction", isAnnotation = false)
	private void test(){
		return;
	}
}
