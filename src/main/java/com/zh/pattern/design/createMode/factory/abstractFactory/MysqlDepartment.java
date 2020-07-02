package com.zh.pattern.design.createMode.factory.abstractFactory;


public class MysqlDepartment implements IDepartment {

    @Override
    public void insertDepartmentt(Department department) {
        {
            System.out.println("在Mysql数据库中执行了'插入部门'操作！");
        }
    }

    @Override
    public Department getDepartment(int id) {
        Department department = new Department();
        department.setId(id);
        System.out.println("在Mysql数据库中查找ID未为:" + id + " 的部门");
        return department;
    }
}
