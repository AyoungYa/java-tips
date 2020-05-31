package patterndesign.behavioral.template;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/6/30.</p>
 */
public class TemplateMainClass {
	public static void main(String[] args){
		Concrete1 c1 = new Concrete1();
		c1.templateMethod();
		
		Concrete2 c2 = new Concrete2();
		c2.templateMethod();
	}
}
