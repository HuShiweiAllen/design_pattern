package com.itguigu.principle.demeter;

import java.util.ArrayList;
import lombok.Data;

/**
 * @description:
 * @author: David Allen
 * @date: 2021-04-25
 **/
public class Demeter1 {

    public static void main(String[] args) {

    }

}

//学校总部员工类
@Data
class Employee {

    private String id;

}

//学校的员工类
@Data
class CollegeEmployee {

    private String id;
}

//管理学院员工的管理类
class CollegeManager {

    //返回学院的所有员工
    public ArrayList<CollegeEmployee> getAllEmployee() {
        ArrayList<CollegeEmployee> list = new ArrayList<CollegeEmployee>();
        for (int i = 0; i < 10; i++) {
            //这里我们增加10个员工的list
            CollegeEmployee employee = new CollegeEmployee();
            employee.setId("学院员工 id = " + i);
            list.add(employee);
        }
        return list;
    }
}

//学校管理类
//分析SchoolManager类的直接朋友类有哪些? Employee、CollegeManager
//CollegeEmployee 不是 直接朋友 而是一个陌生类，这样违背了迪米特法则
class SchoolManager {

    //返回学校总部员工
    public ArrayList<Employee> getAllEmployee() {

        ArrayList<Employee> list = new ArrayList<Employee>();
        for (int i = 0; i < 5; i++) {
            Employee employee = new Employee();
            employee.setId("学校总部员工 id = " + i);
            list.add(employee);
        }
        return list;
    }

    //该方法完成输出学校总部和学院员工信息（id）
    void printAllEmployee(CollegeManager sub) {

        //分析问题
        //1. 这里的CollegeEmployee不是SchoolManager的直接朋友
        //2. CollegeEmployee是以局部变量的方式出现在SchoolManager
        //3. 违反了迪米特法则

        //获取到学院员工
        ArrayList<CollegeEmployee> lis1 = sub.getAllEmployee();
        System.out.println("--------------学院员工--------------");
        for (CollegeEmployee e : lis1) {
            System.out.println(e.getId());
        }

        //获取到学校总部员工
        ArrayList<Employee> list2 = this.getAllEmployee();
        System.out.println("--------------学校总部员工--------------");
        for (Employee e : list2) {
            System.out.println(e.getId());
        }
    }
}
