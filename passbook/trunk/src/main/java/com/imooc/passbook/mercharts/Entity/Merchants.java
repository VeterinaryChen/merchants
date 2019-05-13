package com.imooc.passbook.mercharts.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

/**
 * @Auther: JeffChen
 * @Date: 2019/5/9 16:32
 * <h1>商户对象模型</h1>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="merchants")
public class Merchants {

    /**
     * 功能描述:  商户id，主键
     * @auther: JeffChen
     * @date: 2019/5/9 16:34
     */
    @Id
    @GeneratedValue
    @Column(name="id",nullable = false)
    private Integer id;

    /**
     * 功能描述:  商户名称，全局唯一
     * @auther: JeffChen
     * @date: 2019/5/9 16:35
     */
    @Basic
    @Column(name="name",unique = true,nullable = false)
    private String name;

    /**
     * 功能描述:  商户logo
     * @auther: JeffChen
     * @date: 2019/5/9 16:37
     */
    @Basic
    @Column(name = "logo_url",nullable = false)
    private String logoUrl;

    /**
     * 功能描述:  商户营业执照
     * @auther: JeffChen
     * @date: 2019/5/9 16:38
     */
    @Basic
    @Column(name = "bussiness_license_url",nullable = false)
    private String bussinessLicenseUrl;

    /**
     * 功能描述:  商户电话
     * @auther: JeffChen
     * @date: 2019/5/9 16:40
     */
    @Basic
    @Column(name = "phone",nullable = false)
    private String phone;
    
    /**
     * 功能描述: 商户地址
     * @auther: JeffChen
     * @date: 2019/5/9 16:40
     */
    @Basic
    @Column(name = "address",nullable = false)
    private String address;

    /**
     * 功能描述: 商户是否通过审核
     * @auther: JeffChen
     * @date: 2019/5/9 16:42
     */
    @Basic
    @Column(name = "is_audit",nullable = false)
    private Boolean isAudit = false;


}
