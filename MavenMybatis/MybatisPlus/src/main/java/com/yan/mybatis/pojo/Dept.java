package com.yan.mybatis.pojo;

public class Dept {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dept.dept_id
     *
     * @mbg.generated Mon Jul 03 00:27:26 CST 2023
     */
    private Integer deptId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dept.dept_name
     *
     * @mbg.generated Mon Jul 03 00:27:26 CST 2023
     */
    private String deptName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dept.dept_id
     *
     * @return the value of dept.dept_id
     *
     * @mbg.generated Mon Jul 03 00:27:26 CST 2023
     */
    public Integer getDeptId() {
        return deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dept.dept_id
     *
     * @param deptId the value for dept.dept_id
     *
     * @mbg.generated Mon Jul 03 00:27:26 CST 2023
     */
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dept.dept_name
     *
     * @return the value of dept.dept_name
     *
     * @mbg.generated Mon Jul 03 00:27:26 CST 2023
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dept.dept_name
     *
     * @param deptName the value for dept.dept_name
     *
     * @mbg.generated Mon Jul 03 00:27:26 CST 2023
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }
}