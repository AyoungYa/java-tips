package patterndesign.behavioral.command;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/7/24.</p>
 */
public class Client {
	public static void main(String[] args){
		Invoker xiaosan = new Invoker();
		xiaosan.setCommand(new AddRequirementCommand());
		xiaosan.action();
	}
}
