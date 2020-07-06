package com.zh.pattern.design.strctureMode.flwWeight;

import java.util.HashMap;

public class FlwWeightFactory {
    private static HashMap<String, ConcreteLoginer> map = new HashMap();

    public static ConcreteLoginer getFlyWeight(String key){
        ConcreteLoginer user = map.get(key);
        if (user == null){
            user = new ConcreteLoginer(key);
            map.put(key, user);
        }
        return user;
    }

    public int getSize(){
        return map.size();
    }
}
