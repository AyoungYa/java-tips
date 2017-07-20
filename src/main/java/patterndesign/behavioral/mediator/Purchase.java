package patterndesign.behavioral.mediator;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/7/19.</p>
 */
public class Purchase extends AbstractColleague{
	
	public Purchase(AbstractMediator _mediator) {
		super(_mediator);
	}
	
	//采购IBM电脑
	public void buyIBMComputer(int number){
		super.mediator.execute("purchase.buy", number);
	}
	//不再采购IBM电脑
	public void refuseBuyIBM(){
		System.out.println("不再采购IBM电脑");
	}
}
