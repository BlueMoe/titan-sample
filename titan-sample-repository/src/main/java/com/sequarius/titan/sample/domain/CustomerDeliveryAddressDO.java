package com.sequarius.titan.sample.domain;

import com.sequarius.titan.sample.common.annonation.Entity;
import com.sequarius.titan.sample.common.annonation.Filed;
import java.util.Date;
import lombok.Data;

/**
 * 客户收货地址
 *
 * @author Michael Chow
 * @date 2020/02/17
 */

@Entity(name = "CustomerDeliveryAddressDO", displayName = "客户收货地址")
@Data
public class CustomerDeliveryAddressDO {
    /**
     * id
     */
    @Filed(name = "id", displayName = "id", length = 19)
    private Long id;

    /**
     * 创建日期
     */
    @Filed(name = "createTime", displayName = "创建日期", length = 19)
    private Date createTime;

    /**
     * 更新日期
     */
    @Filed(name = "updateTime", displayName = "更新日期", length = 19)
    private Date updateTime;

    /**
     * 客户编号
     */
    @Filed(name = "fkCustomerId", displayName = "客户编号", length = 19)
    private Long fkCustomerId;

    /**
     * 联系人编号
     */
    @Filed(name = "fkCustomerLinkmanId", displayName = "联系人编号", length = 19)
    private Long fkCustomerLinkmanId;

    /**
     * 收货地址
     */
    @Filed(name = "deliveryAddress", displayName = "收货地址", length = 255)
    private String deliveryAddress;
}