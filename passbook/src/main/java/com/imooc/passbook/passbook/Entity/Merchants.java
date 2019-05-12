package com.imooc.passbook.passbook.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @Auther: JeffChen
 * @Date: 2019/5/12 09:50
 * <h1> 商户对象模型 </h1>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "merchants")
public class Merchants {

    /**
     * 功能描述:   商户ID
     * @auther: JeffChen
     * @date: 2019/5/12 09:54
     */
    @GeneratedValue
    @Id
    @Column(name = "id",nullable = false)
    private Integer id;

    /**
     * 功能描述:  商户姓名
     * @auther: JeffChen
     * @date: 2019/5/12 09:54
     */
    @Basic
    @Column(nullable = false,name = "name",unique = true)
    private String name;

    /**
     * 功能描述:  商户logo
     * @auther: JeffChen
     * @date: 2019/5/12 09:54
     */
    @Basic
    @Column(name = "logoUrl",nullable = false)
    private String logoUrl;

    /**
     * 功能描述: 商户营业执照
     * @auther: JeffChen
     * @date: 2019/5/12 09:56
     */
    @Basic
    @Column(nullable = false,name = "business_license_url")
    private String businessLicenseUrl;

    /**
     * 功能描述:  商户联系电话
     * @auther: JeffChen
     * @date: 2019/5/12 09:57
     */
    @Basic
    @Column(name = "phone",nullable = false)
    private String phone;

    /**
     * 功能描述:  商户地址
     * @auther: JeffChen
     * @date: 2019/5/12 09:58
     */
    @Basic
    @Column(name = "address",nullable = false)
    private String address;

    /**
     * 功能描述:  商户是否通过审核
     * @auther: JeffChen
     * @date: 2019/5/12 09:59
     */
    @Basic
    @Column(name = "is_audit",nullable = false)
    private Boolean isAudit;
}
