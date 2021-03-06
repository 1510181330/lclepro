package com.example.lclepro.Bean;

import java.time.LocalDateTime;

public class LcleCustomer {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lcle_customer.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lcle_customer.username
     *
     * @mbg.generated
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lcle_customer.password
     *
     * @mbg.generated
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lcle_customer.phone
     *
     * @mbg.generated
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lcle_customer.qq
     *
     * @mbg.generated
     */
    private String qq;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lcle_customer.depname
     *
     * @mbg.generated
     */
    private String depname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lcle_customer.sex
     *
     * @mbg.generated
     */
    private Integer sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lcle_customer.role
     *
     * @mbg.generated
     */
    private String role;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lcle_customer.add_time
     *
     * @mbg.generated
     */
    private LocalDateTime addTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lcle_customer.update_time
     *
     * @mbg.generated
     */
    private LocalDateTime updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lcle_customer.deleted
     *
     * @mbg.generated
     */
    private Integer deleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lcle_customer.id
     *
     * @return the value of lcle_customer.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lcle_customer.id
     *
     * @param id the value for lcle_customer.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lcle_customer.username
     *
     * @return the value of lcle_customer.username
     *
     * @mbg.generated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lcle_customer.username
     *
     * @param username the value for lcle_customer.username
     *
     * @mbg.generated
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lcle_customer.password
     *
     * @return the value of lcle_customer.password
     *
     * @mbg.generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lcle_customer.password
     *
     * @param password the value for lcle_customer.password
     *
     * @mbg.generated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lcle_customer.phone
     *
     * @return the value of lcle_customer.phone
     *
     * @mbg.generated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lcle_customer.phone
     *
     * @param phone the value for lcle_customer.phone
     *
     * @mbg.generated
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lcle_customer.qq
     *
     * @return the value of lcle_customer.qq
     *
     * @mbg.generated
     */
    public String getQq() {
        return qq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lcle_customer.qq
     *
     * @param qq the value for lcle_customer.qq
     *
     * @mbg.generated
     */
    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lcle_customer.depname
     *
     * @return the value of lcle_customer.depname
     *
     * @mbg.generated
     */
    public String getDepname() {
        return depname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lcle_customer.depname
     *
     * @param depname the value for lcle_customer.depname
     *
     * @mbg.generated
     */
    public void setDepname(String depname) {
        this.depname = depname == null ? null : depname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lcle_customer.sex
     *
     * @return the value of lcle_customer.sex
     *
     * @mbg.generated
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lcle_customer.sex
     *
     * @param sex the value for lcle_customer.sex
     *
     * @mbg.generated
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lcle_customer.role
     *
     * @return the value of lcle_customer.role
     *
     * @mbg.generated
     */
    public String getRole() {
        return role;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lcle_customer.role
     *
     * @param role the value for lcle_customer.role
     *
     * @mbg.generated
     */
    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lcle_customer.add_time
     *
     * @return the value of lcle_customer.add_time
     *
     * @mbg.generated
     */
    public LocalDateTime getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lcle_customer.add_time
     *
     * @param addTime the value for lcle_customer.add_time
     *
     * @mbg.generated
     */
    public void setAddTime(LocalDateTime addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lcle_customer.update_time
     *
     * @return the value of lcle_customer.update_time
     *
     * @mbg.generated
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lcle_customer.update_time
     *
     * @param updateTime the value for lcle_customer.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lcle_customer.deleted
     *
     * @return the value of lcle_customer.deleted
     *
     * @mbg.generated
     */
    public Integer getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lcle_customer.deleted
     *
     * @param deleted the value for lcle_customer.deleted
     *
     * @mbg.generated
     */
    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }
}