package com.zh.pattern.design.createMode.factory.abstractFactory;

public class DataAcess {
    //应该做成配置文件中的属性形式
    private static final String DB = "Mysql";

    public static IUser CreateUser(){
        IUser user = null;
        switch (DB){
            case "Mysql":
                user = new MysqlUser();
                break;
            case "Orecel":
                user = new OrecelUser();
        }
        return user;
    }

    public static IDepartment CreateDepartment(){
        IDepartment department = null;
        switch (DB){
            case "Mysql":
                department = new MysqlDepartment();
                break;
            case "Orecel":
                department = new OrecelDepartment();
        }
        return department;
    }
}
