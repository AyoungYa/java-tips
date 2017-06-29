package patterndesign.creational.factory.abstractFactory;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/6/27.</p>
 */
public class SimpleFactory {
	public static <T extends AbstractProduct> T createProduct(Class<T> tClass){
		//implement your process of create product here.
		AbstractProduct product = null;
		return (T) product;
	}
}
