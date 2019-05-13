package com.imooc.passbook.passbook.Dao;

import com.imooc.passbook.passbook.Entity.Merchants;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author jeffchen
 * @Date: 2019/5/12 10:00
 * <h1> Merchants Dao 接口</h1>
 */

public interface MerchantsDao extends JpaRepository<Merchants,Integer> {

    /**
     * 功能描述:  通过 Id 获取商户对象
     * @auther: JeffChen
     * @date: 2019/5/12 10:03
     * @param id 商户id
     * @return {@link Merchants}
     */
    Merchants findById(Integer id);

    /**
     * 功能描述: 根据商户名称获取商户对象
     * @auther: JeffChen
     * @date: 2019/5/12 10:04
     * @param name 商户姓名
     * @return {@link Merchants}
     */
    Merchants findbyName(String name);

    /**
     * 功能描述: 根据商户 ids 获取多个商户对象
     * @auther: JeffChen
     * @date: 2019/5/12 10:08
     * @param ids
     * @return {@link Merchants}
     */
    List<Merchants> findByIdIn(List<Integer> ids);

}
