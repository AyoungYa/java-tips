package patterndesign.creational.factory.factory;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/6/26.</p>
 */
public class ConcreteFactory extends AbstractFactory {
	@Override
	public <T extends AbstractProduct> T createProduct(Class<T> tClass) {
		AbstractProduct abstractProduct = null;
		try {
			abstractProduct = (T)Class.forName(tClass.getName()).newInstance();
		} catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
			e.printStackTrace();
		}
		return (T) abstractProduct;
	}
}
