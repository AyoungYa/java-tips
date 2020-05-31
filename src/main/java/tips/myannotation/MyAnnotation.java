package JavaTips.myannotation;

import java.lang.annotation.*;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/2/21.</p>
 *
 * 1、创建注解时类型为@interface
 * 2、创建注解时ElementType表示注解的目标：TYPE：类；FIELD：域；METHOD：方发声明；PARAMETER：参数声明；CONSTRUCTOR：构造函数；LOCAL_VARIABLE：局部变量...
 * 3、Retention什么时候被丢弃： SOURCE: 注解将被编译器丢弃。CLASS:注解在class文件中可能。但会被VM丢弃。RUNTIME: VM将在运行时也保存注解(如果需要通过反射读取注解，则使用该值)。
 * 4、Documented:  将此注解包含在Javadoc中。
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyAnnotation {
	String value();
}
