package com.imooc.passbook.mercharts.Vo;

import com.imooc.passbook.mercharts.Constant.ErrorCode;
import com.imooc.passbook.mercharts.Dao.MerchantsDao;
import com.imooc.passbook.mercharts.Entity.Merchants;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: JeffChen
 * @Date: 2019/5/9 19:53
 * <h1> 创建商户请求对象 </h1>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateMerchantsRequest {

    /**
     * 功能描述:  商户名称
     * @auther: JeffChen
     * @date: 2019/5/9 19:54
     */
    private String name;

    /**
     * 功能描述:  商户logo
     * @auther: JeffChen
     * @date: 2019/5/9 19:55
     */
    private String logoUrl;

    /**
     * 功能描述:  商户营业执照
     * @auther: JeffChen
     * @date: 2019/5/9 19:55
     */
    private String bussinessLicenseUrl;

    /**
     * 功能描述:  商户电话
     * @auther: JeffChen
     * @date: 2019/5/9 19:55
     */
    private String phone;

    /**
     * 功能描述:  商户地址
     * @auther: JeffChen
     * @date: 2019/5/9 19:55
     */
    private String address;

    /**
     * 功能描述:  验证请求有效性
     * @auther: JeffChen
     * @date: 2019/5/9 19:56
     * @param merchantsDao {@link MerchantsDao}
     * @return {@link ErrorCode}
     */
    public ErrorCode validate(MerchantsDao merchantsDao){
        if(merchantsDao.findByName(this.name)!=null){
            return ErrorCode.DUPLICATE_NAME;
        }
        if(this.logoUrl == null){
            return ErrorCode.EMPTY_LOGO;
        }
        if(this.bussinessLicenseUrl == null){
            return ErrorCode.EMPTY_BUSSINESS_LICENSE;
        }
        if(this.address == null){
            return ErrorCode.ERROR_ADDRESS;
        }
        if(this.phone == null){
            return ErrorCode.ERROR_PHONE;
        }
        return ErrorCode.SUCCESS;
    }

    /**
     * 功能描述:  将请求对象转化为商户对象，以储存至数据库
     * @auther: JeffChen
     * @date: 2019/5/9 20:01
     * @return {@link Merchants}
     */
    public Merchants toMerchants(CreateMerchantsRequest createMerchantsRequest){

        Merchants merchants = new Merchants();
        merchants.setAddress(address);
        merchants.setLogoUrl(logoUrl);
        merchants.setPhone(phone);
        merchants.setName(name);
        merchants.setBussinessLicenseUrl(bussinessLicenseUrl);

        return merchants;
    }
}
