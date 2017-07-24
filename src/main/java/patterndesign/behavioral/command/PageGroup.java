package patterndesign.behavioral.command;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/7/24.</p>
 */
public class PageGroup implements Group{
	@Override
	public void find() {
		System.out.println("PageGroup find");
	}
	
	@Override
	public void add() {
		System.out.println("PageGroup add");
	}
	
	@Override
	public void delete() {
		System.out.println("PageGroup delete");
	}
	
	@Override
	public void change() {
		System.out.println("PageGroup change");
	}
	
	@Override
	public void plan() {
		System.out.println("PageGroup plan");
	}
}
