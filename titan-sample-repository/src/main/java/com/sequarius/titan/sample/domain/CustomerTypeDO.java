package com.sequarius.titan.sample.domain;

import com.sequarius.titan.sample.common.annonation.Entity;
import com.sequarius.titan.sample.common.annonation.Filed;
import java.util.Date;
import lombok.Data;

/**
 * 客户类型
 *
 * @author Michael Chow
 * @date 2020/02/17
 */

@Entity(name = "CustomerTypeDO", displayName = "客户类型")
@Data
public class CustomerTypeDO {
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
     * 客户类型名称
     */
    @Filed(name = "name", displayName = "客户类型名称", length = 20)
    private String name;

    /**
     * 客户类型编号
     */
    @Filed(name = "code", displayName = "客户类型编号", length = 20)
    private String code;
}