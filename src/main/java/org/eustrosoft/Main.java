package org.eustrosoft;

import javax.script.*;

/**
 * Demonstration of JavaScript execution
 * in java code, using Nashorn build-in library
 * in Java.
 */
public class Main {

    public static void main(String[] args) throws ScriptException {
        executeJSCode("stdout.println(Math.PI);");
        executeJSCode("stdout.println(" + JSFunctions.square("16") + ")");
    }

    private static void executeJSCode(String code) throws ScriptException {
        ScriptEngine js = new ScriptEngineManager().getEngineByName("javascript");
        Bindings bindings = js.getBindings(ScriptContext.ENGINE_SCOPE);
        bindings.put("stdout", System.out);
        js.eval(code);
    }
}
