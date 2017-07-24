package patterndesign.behavioral.command;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/7/24.</p>
 */
public class DeletePageCommand extends Command{
	@Override
	void execute() {
		super.pageGroup.find();
		super.pageGroup.delete();
		super.pageGroup.plan();
	}
}
