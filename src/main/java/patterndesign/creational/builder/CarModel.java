package patterndesign.creational.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/6/24.</p>
 */
public abstract class CarModel {
	private List<String> sequence = new ArrayList<>();
	
	public List<String> getSequence() {
		return sequence;
	}
	
	public void setSequence(List<String> sequence) {
		this.sequence = sequence;
	}
	
	abstract void start();
	
	abstract void stop();
	
	abstract void alarm();
	
	abstract void engineBoom();
	
	final public void run(){
		for (String order: this.getSequence()){
			if (order.equalsIgnoreCase("start")){
				this.start();
			} else if (order.equalsIgnoreCase("stop")){
				this.stop();
			} else if (order.equalsIgnoreCase("alarm")){
				this.alarm();
			} else if (order.equalsIgnoreCase("engineBoom")){
				this.engineBoom();
			}
		}
	}
}
