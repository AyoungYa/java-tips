package patterndesign.behavioral.command;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/7/24.</p>
 */
public class CodeGroup implements Group{
	@Override
	public void find() {
		System.out.println("CodeGroup find");
	}
	
	@Override
	public void add() {
		System.out.println("CodeGroup add");
	}
	
	@Override
	public void delete() {
		System.out.println("CodeGroup delete");
	}
	
	@Override
	public void change() {
		System.out.println("CodeGroup change");
	}
	
	@Override
	public void plan() {
		System.out.println("CodeGroup plan");
	}
}
