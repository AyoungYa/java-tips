package patterndesign.creational.builder;

import java.util.List;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/6/24.</p>
 */
public abstract class CarBuilder {
	public abstract void setSequence(List<String> sequence);
	
	public abstract CarModel buildCarModel();
}
