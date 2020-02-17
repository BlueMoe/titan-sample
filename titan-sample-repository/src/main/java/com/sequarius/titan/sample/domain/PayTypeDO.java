package com.sequarius.titan.sample.domain;

import com.sequarius.titan.sample.common.annonation.Entity;
import com.sequarius.titan.sample.common.annonation.Filed;
import java.util.Date;
import lombok.Data;

/**
 * 付款类型
 *
 * @author Michael Chow
 * @date 2020/02/17
 */

@Entity(name = "PayTypeDO", displayName = "付款类型")
@Data
public class PayTypeDO {
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
     * 付款类型名称
     */
    @Filed(name = "name", displayName = "付款类型名称", length = 20)
    private String name;
}