package patterndesign.behavioral.command;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/7/24.</p>
 */
public class AddRequirementCommand extends Command{
	@Override
	void execute() {
		super.requirementGroup.find();
		super.requirementGroup.add();
		super.requirementGroup.plan();
	}
}
