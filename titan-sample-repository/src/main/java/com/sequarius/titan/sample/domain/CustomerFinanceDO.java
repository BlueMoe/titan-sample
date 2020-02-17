package com.sequarius.titan.sample.domain;

import com.sequarius.titan.sample.common.annonation.Entity;
import com.sequarius.titan.sample.common.annonation.Filed;
import java.util.Date;
import lombok.Data;

/**
 * 客户财务信息
 *
 * @author Michael Chow
 * @date 2020/02/17
 */

@Entity(name = "CustomerFinanceDO", displayName = "客户财务信息")
@Data
public class CustomerFinanceDO {
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
     * 银行帐号
     */
    @Filed(name = "bankNumber", displayName = "银行帐号", length = 20)
    private String bankNumber;

    /**
     * 开户行地址
     */
    @Filed(name = "bankAddress", displayName = "开户行地址", length = 255)
    private String bankAddress;

    /**
     * 付款方式
     */
    @Filed(name = "fkPayTypeId", displayName = "付款方式", length = 19)
    private Long fkPayTypeId;

    /**
     * 月结日期
     */
    @Filed(name = "monthlyBalanceDate", displayName = "月结日期", length = 19)
    private Long monthlyBalanceDate;

    /**
     * 交易货币类型id
     */
    @Filed(name = "fkTradingCurrencyId", displayName = "交易货币类型id", length = 19)
    private Long fkTradingCurrencyId;
}