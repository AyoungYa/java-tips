package patternDesign.structual.decorator;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/7/25.</p>
 */
public abstract class Decorator extends Component{
	private Component component;
	
	public Decorator(Component component) {
		this.component = component;
	}
	
	@Override
	public void operate(){
		this.component.operate();
	}
}
