package com.yan.mybatis.mapper;


import com.yan.mybatis.pojo.Dept;


public interface DeptMapper {



    /**
     * 通过部门id获取部门信息【dept_id、dept_name】
     */
    public Dept selectDeptByDeptId(int deptId);


    /**
     * 通过部门id获取部门信息，及部门所属员工信息
     */
    public Dept selectDeptAndEmpByDeptId(int deptId);


    /**
     * 通过部门id获取部门信息，及部门所属员工信息【分步查询】
            1. 通过部门id获取部门信息
            2. 通过部门id获取员工信息
     */
    public Dept selectDeptAndEmpByDeptIdStep(int deptId);



}
