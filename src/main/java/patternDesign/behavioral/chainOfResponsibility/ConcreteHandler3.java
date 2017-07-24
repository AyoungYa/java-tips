package patternDesign.behavioral.chainOfResponsibility;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/7/24.</p>
 */
public class ConcreteHandler3 extends Handler {
	@Override
	protected Level getHandlerLevel() {
		return new Level(3);
	}
	
	@Override
	protected Response echo(Request request) {
		return new Response("ConcreteHandler3 echoed the problem");
	}
}
