package com.sequarius.titan.sample.domain;

import com.sequarius.titan.sample.common.annonation.Entity;
import com.sequarius.titan.sample.common.annonation.Filed;
import java.util.Date;
import lombok.Data;

/**
 * 客户开票信息
 *
 * @author Michael Chow
 * @date 2020/02/17
 */

@Entity(name = "CustomerInvoiceInfoDO", displayName = "客户开票信息")
@Data
public class CustomerInvoiceInfoDO {
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
     * 纳税人名称
     */
    @Filed(name = "taxpayer", displayName = "纳税人名称", length = 255)
    private String taxpayer;

    /**
     * 纳税人识别号
     */
    @Filed(name = "tin", displayName = "纳税人识别号", length = 30)
    private String tin;

    /**
     * 纳税人地址
     */
    @Filed(name = "address", displayName = "纳税人地址", length = 255)
    private String address;

    /**
     * 纳税人电话
     */
    @Filed(name = "tel", displayName = "纳税人电话", length = 20)
    private String tel;

    /**
     * 纳税人开户行
     */
    @Filed(name = "bank", displayName = "纳税人开户行", length = 255)
    private String bank;

    /**
     * 纳税人账号
     */
    @Filed(name = "bankNumber", displayName = "纳税人账号", length = 255)
    private String bankNumber;
}