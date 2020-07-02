package com.zh.pattern.design.strctureMode;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    //维护一个目标对象
    private Object target;

    public ProxyFactory(Object object) {
        this.target = object;
    }

    //给目标对象生成代理对象
    public Object getProxyInstance(){
        return Proxy.newProxyInstance(
            target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler(){
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                            System.out.println("开始划水");
                            //执行目标对象方法
                            Object value = method.invoke(target, args);
                            System.out.println("准点下班");
                            return value;
                    }
                }
        );
    }
}
