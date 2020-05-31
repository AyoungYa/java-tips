package patterndesign.structual.proxy;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/7/10.</p>
 */
public class Proxy implements Subject{
	private Subject subject = null;
	
	public Proxy(){
		this.subject = new Proxy();
	}
	
	public Proxy(Object... objects){
		
	}
	@Override
	public void request() {
		this.before();
		this.subject.request();
		this.after();
	}
	
	private void before(){
		System.out.println("before handle request");
	}
	
	private void after(){
		System.out.println("after handle request");
	}
}
