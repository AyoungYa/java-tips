package patterndesign.structual.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/7/11.</p>
 */
public class DynamicGamePlayerIH implements InvocationHandler {
	//被代理类
	private Class proxiedClass = null;
	//被代理对象
	private Object proxiedObject = null;
	
	public DynamicGamePlayerIH(Object proxiedObject) {
		this.proxiedObject = proxiedObject;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if (method.getName().equalsIgnoreCase("login"))
			System.out.println("Someone is login in with my accout. " + Arrays.toString(args));
		return method.invoke(this.proxiedObject, args);
	}
}
