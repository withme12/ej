package com.briup.apps.ej.bean;

public class Order_line {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ej_order_line.id
     *
     * @mbg.generated Mon Jun 10 15:24:11 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ej_order_line.number
     *
     * @mbg.generated Mon Jun 10 15:24:11 CST 2019
     */
    private Integer number;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ej_order_line.product_id
     *
     * @mbg.generated Mon Jun 10 15:24:11 CST 2019
     */
    private Long productId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ej_order_line.order_id
     *
     * @mbg.generated Mon Jun 10 15:24:11 CST 2019
     */
    private Long orderId;
    private Object status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ej_order_line.id
     *
     * @return the value of ej_order_line.id
     *
     * @mbg.generated Mon Jun 10 15:24:11 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ej_order_line.id
     *
     * @param id the value for ej_order_line.id
     *
     * @mbg.generated Mon Jun 10 15:24:11 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ej_order_line.number
     *
     * @return the value of ej_order_line.number
     *
     * @mbg.generated Mon Jun 10 15:24:11 CST 2019
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ej_order_line.number
     *
     * @param number the value for ej_order_line.number
     *
     * @mbg.generated Mon Jun 10 15:24:11 CST 2019
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ej_order_line.product_id
     *
     * @return the value of ej_order_line.product_id
     *
     * @mbg.generated Mon Jun 10 15:24:11 CST 2019
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ej_order_line.product_id
     *
     * @param productId the value for ej_order_line.product_id
     *
     * @mbg.generated Mon Jun 10 15:24:11 CST 2019
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ej_order_line.order_id
     *
     * @return the value of ej_order_line.order_id
     *
     * @mbg.generated Mon Jun 10 15:24:11 CST 2019
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ej_order_line.order_id
     *
     * @param orderId the value for ej_order_line.order_id
     *
     * @mbg.generated Mon Jun 10 15:24:11 CST 2019
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}