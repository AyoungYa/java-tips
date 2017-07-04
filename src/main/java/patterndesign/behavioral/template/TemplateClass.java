package patterndesign.behavioral.template;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/6/30.</p>
 */
public abstract class TemplateClass {
	protected abstract void method1();
	
	protected abstract void doOther();
	
	protected boolean doOtherCheckMethod(){
		return true;
	}
	
	void templateMethod(){
		this.method1();
		
		if (this.doOtherCheckMethod()) {
			this.doOther();
		}
	}
}
