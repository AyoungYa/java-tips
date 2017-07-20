package patterndesign.behavioral.mediator;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/7/19.</p>
 */
public class Mediator extends AbstractMediator {
	//中介者最重要的方法
	public void execute(String str,Object...objects){
		switch (str) {
			case "purchase.buy":  //采购电脑
				this.buyComputer((Integer) objects[0]);
				break;
			case "sale.sell":  //销售电脑
				this.sellComputer((Integer) objects[0]);
				break;
			case "sale.offsell":  //折价销售
				this.offSell();
				break;
			case "stock.clear":  //清仓处理
				this.clearStock();
				break;
		}
	}
	
	//采购电脑
	private void buyComputer(int number){
		int saleStatus = super.sale.getSaleStatus();
		if(saleStatus>80){ //销售情况良好
			System.out.println("采购IBM电脑:"+number + "台");
			super.stock.increase(number);
		}else{ //销售情况不好
			int buyNumber = number/2; //折半采购
			System.out.println("采购IBM电脑："+buyNumber+ "台");
		}
	}
	
	//销售电脑
	private void sellComputer(int number){
		if(super.stock.getStockNumber()<number){ //库存数量不够销售
			super.purchase.buyIBMComputer(number);
		}
		super.stock.decrease(number);
	}
	
	//折价销售电脑
	private void offSell(){
		System.out.println("折价销售IBM电脑"+stock.getStockNumber()+"台");
	}
	
	//清仓处理
	private void clearStock(){
		//要求清仓销售
		super.sale.offSale();
		//要求采购人员不要采购
		super.purchase.refuseBuyIBM();
	}
}
