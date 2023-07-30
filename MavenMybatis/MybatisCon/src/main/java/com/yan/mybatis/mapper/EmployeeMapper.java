package com.yan.mybatis.mapper;


import com.yan.mybatis.pojo.Employee;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


public interface EmployeeMapper {

    public List<Employee> selectEmpByIdsForeach(@Param("ids") List<Integer> ibs);

    public List<Employee> selectEmpByOneOprChoose(Employee employee);

    /**
     * 不知道要查询的是什么
     * @param employee
     * @return
     */
    public List<Employee> selectEmployeeWhereIf(Employee employee);
    public List<Employee> selectEmployeeTrim(Employee employee);

    /**
     * 通过部门Id获取员工信息
     * @param deptId
     * @return
     */
    public List<Employee> selectEmpByDeptId(int deptId);

    /**
     * 通过员工id获取员工信息及员工所属的部门信息【分布查询】
     *  1、先通过员工id获取员工信息【id、lastName、email、salary、dept_id】
     *  2、在通过部门id获取部门信息【dept_id、dept_name】
     */
    public Employee selectEmpAndDeptByEmpIdAssociationStep(int empId);

    /**
     *自定义映射-association映射
     */
    public List<Employee> selectEmpAndDeptResultMapAssociation(int empId);

    /**
     * 自定义映射-级联映射
     */
    public List<Employee> selectEmpAndDeptByEmpId(int empId);

    /**
     * 通过id获取员工信息 查询单行数据返回Map集合
     */
    public Map<String,Object> selectEmpReturnMap(int empId);

    /**
     * 查询多行数据返回Map集合 【主键为：key 对象为：val】
     */
    @MapKey("id")
    public Map<Integer,Employee> selectEmpsReturnMap();

    /**
     * 查询所有员工信息  查询多行数据返回对象的集合
     */
    public List<Employee> selectAllEmps();

    /**
     * 通过id获取员工信息【单个普通参数】 查询单行数据返回单个对象
     */
    public Employee selectEmpById(int empId);

    /**
     * 通过员工姓名及薪资查询员工信息【多个普通参数】
     */
    public List<Employee> selectEmpByOpr(String lastName, double salary);

    /**
     * 通过员工姓名及薪资查询员工信息【命名参数】
     * @return
     */
    public List<Employee> selectEmpByParam(@Param("lName")String lastName, @Param("salary") double salary);

    /**
     * 通过员工姓名及薪资查询员工信息【POJO参数】
     */
    public List<Employee> selectEmpByPojo(Employee e);

    /**
     * 通过员工姓名及薪资查询员工信息【map参数】
     */
    public List<Employee> selectEmpByMap(Map<String,Object> map);


    /**
     * 通过员工姓名及薪资查询员工信息【Collection|List|Array等参数】
     */

    /**
     * 添加员工信息
     * @param employee
     */
    public void insertEmployee(Employee employee);

    /**
     * 删除员工信息
     * @param empId
     */
    public void deleteEmployeeById(int empId);

    /**
     * 修改员工信息
     */
    public void updateEmployee(Employee employee);

    /**
     * 修改其中一下或者多项
     * @param employee
     */
    public void updateEmpByOprSet(Employee employee);

}
