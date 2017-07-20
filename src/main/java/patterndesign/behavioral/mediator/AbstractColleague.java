package patterndesign.behavioral.mediator;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/7/19.</p>
 */
public abstract class AbstractColleague {
	protected AbstractMediator mediator;
	public AbstractColleague(AbstractMediator _mediator){
		this.mediator = _mediator;
	}
}
