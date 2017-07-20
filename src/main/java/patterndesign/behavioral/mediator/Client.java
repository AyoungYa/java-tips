package patterndesign.behavioral.mediator;

/**
 * <p>Description: 代码摘自设计模式之禅：</p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/7/19.</p>
 */
public class Client {
	public static void main(String[] args) {
		AbstractMediator mediator = new Mediator();
		//采购人员采购电脑
		System.out.println("------采购人员采购电脑--------");
		Purchase purchase = new Purchase(mediator);
		purchase.buyIBMComputer(100);
		
		//销售人员销售电脑
		System.out.println("\n------销售人员销售电脑--------");
		Sale sale = new Sale(mediator);
		sale.sellIBMComputer(1);
		
		//库房管理人员管理库存
		System.out.println("\n------库房管理人员清库处理--------");
		Stock stock = new Stock(mediator);
		stock.clearStock();
	}
}
