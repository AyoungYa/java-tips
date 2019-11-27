package patterndesign.behavioral.command;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/7/24.</p>
 */
public class Invoker {
	private Command command;
	
	public void setCommand(Command command){
		this.command = command;
	}
	
	public void action(){
		this.command.execute();
	}
}
