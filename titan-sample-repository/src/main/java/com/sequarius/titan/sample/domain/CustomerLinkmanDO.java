package com.sequarius.titan.sample.domain;

import com.sequarius.titan.sample.common.annonation.Entity;
import com.sequarius.titan.sample.common.annonation.Filed;
import java.util.Date;
import lombok.Data;

/**
 * 客户联系人
 *
 * @author Michael Chow
 * @date 2020/02/17
 */

@Entity(name = "CustomerLinkmanDO", displayName = "客户联系人")
@Data
public class CustomerLinkmanDO {
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
     * 联系人姓名
     */
    @Filed(name = "linkman", displayName = "联系人姓名", length = 60)
    private String linkman;

    /**
     * 部门
     */
    @Filed(name = "department", displayName = "部门", length = 20)
    private String department;

    /**
     * 职务/职位
     */
    @Filed(name = "job", displayName = "职务/职位", length = 20)
    private String job;

    /**
     * 性别
     */
    @Filed(name = "sex", displayName = "性别", length = 6)
    private String sex;

    /**
     * 公司座机
     */
    @Filed(name = "tel", displayName = "公司座机", length = 20)
    private String tel;

    /**
     * 传真
     */
    @Filed(name = "fax", displayName = "传真", length = 20)
    private String fax;

    /**
     * 手机
     */
    @Filed(name = "mobileNumber", displayName = "手机", length = 20)
    private String mobileNumber;

    /**
     * 地址
     */
    @Filed(name = "address", displayName = "地址", length = 255)
    private String address;

    /**
     * 邮政编码
     */
    @Filed(name = "postcode", displayName = "邮政编码", length = 20)
    private String postcode;

    /**
     * 邮箱
     */
    @Filed(name = "email", displayName = "邮箱", length = 255)
    private String email;
}