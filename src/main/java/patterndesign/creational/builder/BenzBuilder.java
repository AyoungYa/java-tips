package patterndesign.creational.builder;

import java.util.List;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/6/24.</p>
 */
public class BenzBuilder extends CarBuilder{
	private CarModel benz = new BenzModel();
	
	@Override
	public void setSequence(List<String> sequence) {
		this.benz.setSequence(sequence);
	}
	
	@Override
	public CarModel buildCarModel() {
		return this.benz;
	}
}
