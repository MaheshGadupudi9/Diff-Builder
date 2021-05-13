package co.za.javers.diff;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * @author mahesh gadupudi
 * @project adaptris-regulatory-compliance
 */
public class EmbededJavaScript {
    public static void main(String[] args) {
        ScriptEngineManager factory = new ScriptEngineManager();
        ScriptEngine engine = factory.getEngineByName("nashorn");
        try {

            engine.eval("var i=0;"
            + "i++;"
            +" var String=Java.type(\"java.lang.String\");"
            +" var str=new String(\"Java\");"
            +"print(str);"
            +"print(i);"
            );

        } catch (ScriptException e) {
            e.printStackTrace();
        }

    }
}
