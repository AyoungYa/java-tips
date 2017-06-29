package patterndesign.creational.factory.factory;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/6/26.</p>
 */
public abstract class AbstractFactory {
	public abstract <T extends AbstractProduct> T createProduct(Class<T> tClass);
}
