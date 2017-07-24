package patternDesign.behavioral.chainOfResponsibility;

import java.util.Random;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/7/24.</p>
 */
public class Client {
	public static void main(String[] args){
		Handler handler3 = new ConcreteHandler3();
		Handler handler2 = new ConcreteHandler2();
		Handler handler1 = new ConcreteHandler1();
		handler1.setNextHandler(handler2);
		handler2.setNextHandler(handler3);
		
		int requestOrder = new Random().nextInt(3) + 1;
		Level level = new Level(requestOrder);
		Response response = handler1.handlerMessage(new Request(level));
		System.out.println(response.getMsg());
	}
}
