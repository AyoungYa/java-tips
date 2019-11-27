package patterndesign.behavioral.command;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/7/24.</p>
 */
public class RequirementGroup implements Group{
	@Override
	public void find() {
		System.out.println("RequirementGroup find");
	}
	
	@Override
	public void add() {
		System.out.println("RequirementGroup add");
	}
	
	@Override
	public void delete() {
		System.out.println("RequirementGroup delete");
	}
	
	@Override
	public void change() {
		System.out.println("RequirementGroup change");
	}
	
	@Override
	public void plan() {
		System.out.println("RequirementGroup plan");
	}
}
