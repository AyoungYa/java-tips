package patterndesign.structual.proxy;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/7/10.</p>
 */
public class RealSubject implements Subject{
	
	@Override
	public void request() {
		System.out.println("RealSubject do request");
	}
}
