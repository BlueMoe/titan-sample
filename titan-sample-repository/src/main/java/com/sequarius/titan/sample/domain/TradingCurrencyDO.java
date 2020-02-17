package com.sequarius.titan.sample.domain;

import com.sequarius.titan.sample.common.annonation.Entity;
import com.sequarius.titan.sample.common.annonation.Filed;
import java.util.Date;
import lombok.Data;

/**
 * 交易货币类型
 *
 * @author Michael Chow
 * @date 2020/02/17
 */

@Entity(name = "TradingCurrencyDO", displayName = "交易货币类型")
@Data
public class TradingCurrencyDO {
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
     * 交易货币名称
     */
    @Filed(name = "name", displayName = "交易货币名称", length = 20)
    private String name;
}