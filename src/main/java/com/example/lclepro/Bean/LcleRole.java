package com.example.lclepro.Bean;

public class LcleRole {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lcle_role.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lcle_role.role
     *
     * @mbg.generated
     */
    private String role;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lcle_role.id
     *
     * @return the value of lcle_role.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lcle_role.id
     *
     * @param id the value for lcle_role.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lcle_role.role
     *
     * @return the value of lcle_role.role
     *
     * @mbg.generated
     */
    public String getRole() {
        return role;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lcle_role.role
     *
     * @param role the value for lcle_role.role
     *
     * @mbg.generated
     */
    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }
}