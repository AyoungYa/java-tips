package patterndesign.behavioral.mediator;

import java.util.Random;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/7/19.</p>
 */
public class Sale extends AbstractColleague{
	public Sale(AbstractMediator _mediator) {
		super(_mediator);
	}
	
	//销售IBM电脑
	public void sellIBMComputer(int number){
		System.out.println("销售IBM电脑"+number+"台");
		super.mediator.execute("sale.sell", number);
	}
	
	//反馈销售情况，0～100之间变化，0代表根本就没人卖，100代表非常畅销，出一个卖一个
	public int getSaleStatus(){
		Random rand = new Random(System.currentTimeMillis());
		int saleStatus = rand.nextInt(100);
		System.out.println("IBM电脑的销售情况为："+saleStatus);
		return saleStatus;
	}
	
	//折价处理
	public void offSale(){
		super.mediator.execute("sale.offsell");
	}
}
