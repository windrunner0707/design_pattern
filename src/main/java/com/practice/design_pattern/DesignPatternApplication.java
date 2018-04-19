package com.practice.design_pattern;

import com.practice.design_pattern.proxy.CglibProxyExample;
import com.practice.design_pattern.proxy.HelloWorld;
import com.practice.design_pattern.proxy.HelloWorldImpl;
import com.practice.design_pattern.proxy.JdkProxyExample;
import com.practice.design_pattern.reflect.ReflectServiceImpl;
import com.practice.design_pattern.reflect.ReflectServiceImpl2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Method;

@SpringBootApplication
public class DesignPatternApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesignPatternApplication.class, args);

        //getInstance().sayHello("baiqiqi");
        //System.out.println(getInstance2().toString());
        //reflectMethod();
        //testJdkProxy();
        testCglibProxy();
    }

    public static ReflectServiceImpl getInstance(){
        ReflectServiceImpl object = null;
        try {
            object = (ReflectServiceImpl)
            Class.forName("com.practice.design_pattern.reflect.ReflectServiceImpl").newInstance();
        } catch (Exception e){
            e.printStackTrace();
        }
        return object;
    }

    public static ReflectServiceImpl2 getInstance2(){
        ReflectServiceImpl2 object = null;
        try {
            object = (ReflectServiceImpl2)
                    Class.forName("com.practice.design_pattern.reflect.ReflectServiceImpl2").getConstructor(String.class).newInstance("baihao");
        } catch (Exception e){
            e.printStackTrace();
        }
        return object;
    }

    public static Object reflectMethod(){
        Object returnObj = null;
        ReflectServiceImpl target = new ReflectServiceImpl();
        try {
            Method method = ReflectServiceImpl.class.getMethod("sayHello", String.class);
            returnObj = method.invoke(target,"baipihao");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return returnObj;
    }

    public static void testJdkProxy(){
        JdkProxyExample jdk = new JdkProxyExample();
        HelloWorld proxy = (HelloWorld)jdk.bind(new HelloWorldImpl());
        proxy.sayHelloWorld();
    }

    public static void testCglibProxy() {
        CglibProxyExample cpe = new CglibProxyExample();
        ReflectServiceImpl obj = (ReflectServiceImpl)cpe.getProxy(ReflectServiceImpl.class);
        obj.sayHello("cdl");
    }
}
