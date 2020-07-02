package com.zh.pattern.design.createMode.factory.abstractFactory;



public class Client4 {
    public static void main(String[] args) {
        User user = new User();
        Department department = new Department();

        IUser iUser = DataAcess.CreateUser();
        iUser.insert(user);
        iUser.getUser(1);

        IDepartment iDepartment = DataAcess.CreateDepartment();
        iDepartment.insertDepartmentt(department);
        iDepartment.getDepartment(1);
    }
}
