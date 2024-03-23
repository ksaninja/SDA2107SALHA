package day13;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class C03Log4j_UseProperties {

    public static void main(String[] args) {

        PropertyConfigurator.configure("log4j.properties");
//loogr هذا اسم المتغير انا اعطيه بكيفي
        Logger loogr = Logger.getLogger(C03Log4j_UseProperties.class);

        loogr.trace("This is a trace message");
        loogr.debug("This is a debug message");
        loogr.info("This is an info message");
        loogr.warn("This is a warn message");
        loogr.error("This is an error message");
        loogr.fatal("This is a fatal message");


    }
}