package com.imooc.passbook.mercharts.Dao;

import com.imooc.passbook.mercharts.Entity.Merchants;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author jeffchen
 * @Date: 2019/5/9 16:49
 * <h1> MerchantsDao接口 </h1>
 */
public interface MerchantsDao extends JpaRepository<Merchants,Integer> {

    /**
     * 功能描述:  根据id获取商户对象
     * @auther: JeffChen
     * @date: 2019/5/9 16:52
     */
    @Override
    Optional<Merchants> findById (Integer id);

    /**
     * 功能描述:  根据商户名称获取商户对象
     * @auther: JeffChen
     * @date: 2019/5/9 16:54
     */
    Merchants findByName (String name);



}
