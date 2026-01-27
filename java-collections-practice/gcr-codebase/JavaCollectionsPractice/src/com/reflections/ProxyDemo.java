package com.reflections;

import java.lang.reflect.*;

interface Greeting {
    String sayHello(String name);
    String sayGoodbye();
}

class GreetingImpl implements Greeting {
    @Override
    public String sayHello(String name) {
        return "Hello, " + name + "!";
    }
    
    @Override
    public String sayGoodbye() {
        return "Goodbye!";
    }
}

class LoggingProxy implements InvocationHandler {
    private Object target;
    
    public LoggingProxy(Object target) {
        this.target = target;
    }
    
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Logging: Calling " + method.getName());
        long start = System.currentTimeMillis();
        
        Object result = method.invoke(target, args);
        
        long time = System.currentTimeMillis() - start;
        System.out.println("Logging: " + method.getName() + " completed in " + time + "ms");
        return result;
    }
}

public class ProxyDemo {
    public static void main(String[] args) {
        Greeting real = new GreetingImpl();
        InvocationHandler handler = new LoggingProxy(real);
        Greeting proxy = (Greeting) Proxy.newProxyInstance(
            Greeting.class.getClassLoader(),
            new Class[]{Greeting.class},
            handler
        );
        
        System.out.println(proxy.sayHello("World"));
        System.out.println(proxy.sayGoodbye());
    }
}
