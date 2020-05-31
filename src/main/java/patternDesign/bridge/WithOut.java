package designpattern.bridge;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 16/9/22.</p>
 */

class Road{
	void run(){
		System.out.println("在路上");
	}
}

class SpeedWay extends Road{
	@Override
	void run(){
		System.out.println("在高速公路上");
	}
}

class Street extends Road{
	@Override
	void run(){
		System.out.println("在街道上");
	}
}

class CarOnSpeedWay extends SpeedWay{
	@Override
	void run(){
		System.out.println("小汽车在高速公路上行驶");
	}
}

class CarOnStreetWay extends Street{
	@Override
	void run(){
		System.out.println("小汽车在街道上行驶");
	}
}

class BusOnSpeedWay extends SpeedWay{
	@Override
	void run(){
		System.out.println("公共汽车在高速公路上行驶");
	}
}

public class WithOut {

}
