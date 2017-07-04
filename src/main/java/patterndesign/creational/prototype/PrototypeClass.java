package patterndesign.creational.prototype;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/6/30.</p>
 */
public class PrototypeClass implements Cloneable {
	
	@Override
	public PrototypeClass clone(){
		PrototypeClass prototypeClass = null;
		
		try {
			prototypeClass = (PrototypeClass) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return prototypeClass;
	}
}
