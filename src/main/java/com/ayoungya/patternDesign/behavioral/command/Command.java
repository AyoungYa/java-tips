package patterndesign.behavioral.command;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/7/24.</p>
 */
public abstract class Command {
	protected CodeGroup codeGroup = new CodeGroup();
	protected RequirementGroup requirementGroup = new RequirementGroup();
	protected PageGroup pageGroup = new PageGroup();
	
	abstract void execute();
}
