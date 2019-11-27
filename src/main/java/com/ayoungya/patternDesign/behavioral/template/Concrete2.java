package patterndesign.behavioral.template;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/6/30.</p>
 */
public class Concrete2 extends TemplateClass {
	@Override
	public void method1() {
		System.out.println("concrete2's method1");
	}
	
	@Override
	public void doOther() {
		System.out.println("concrete2's doOther method");
	}
	
	protected boolean doOtherCheckMethod(){
		return false;
	}
}
