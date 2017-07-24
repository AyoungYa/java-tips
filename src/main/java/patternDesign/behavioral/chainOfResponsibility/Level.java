package patternDesign.behavioral.chainOfResponsibility;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/7/24.</p>
 */
public class Level {
	int order;
	
	public int getOrder() {
		return order;
	}
	
	public void setOrder(int order) {
		this.order = order;
	}
	
	public Level(int order) {
		this.order = order;
	}
	
	public Level() {
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		
		if (!(o instanceof Level)) return false;
		
		Level level = (Level) o;
		
		return this.getOrder() == level.getOrder();
	}
}
