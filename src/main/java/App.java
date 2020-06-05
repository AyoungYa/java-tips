//import org.apache.logging.log4j.core.config.Configurator;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//import java.net.URL;
//
///**
// * <p>Description: some description</p>
// * <p>@author: Created by YangZeying</p>.
// * <p>@Time: 2019-11-27 20:55.</p>
// */
//public class App {
//    private static Logger logger = LoggerFactory.getLogger(App.class);
//
//    public static void main(String args[]) throws Exception {
//        logger.info("~~~~~~~~~~~~~~~~~~~~~~~server start");
//        applicationInit();
//        new ClassPathXmlApplicationContext("classpath:application.xml");
//
//        logger.info("~~~~~~~~~~~~~~~~~~~~~~~server started");
//    }
//
//    private static void applicationInit() {
//        try {
//            // init log4j2
//            String log4j2ConfigFile = "/log4j2.xml";
//            URL url = App.class.getResource(log4j2ConfigFile);
//            Configurator.initialize("Log4j", url.getPath());
//        } catch (Exception ex) {
//            logger.error("applicationInit error.", ex);
//        }
//    }
//
//}
