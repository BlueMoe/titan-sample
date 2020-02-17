package com.sequarius.titan.sample.domain;

import com.sequarius.titan.sample.common.annonation.Entity;
import com.sequarius.titan.sample.common.annonation.Filed;
import java.util.Date;
import lombok.Data;

/**
 * 客户信息
 *
 * @author Michael Chow
 * @date 2020/02/17
 */

@Entity(name = "CustomerDO", displayName = "客户信息")
@Data
public class CustomerDO {
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
     * 客户代号
     */
    @Filed(name = "customerCode", displayName = "客户代号", length = 10)
    private String customerCode;

    /**
     * 客户名
     */
    @Filed(name = "customerName", displayName = "客户名", length = 255)
    private String customerName;

    /**
     * 客户简称
     */
    @Filed(name = "shortName", displayName = "客户简称", length = 20)
    private String shortName;

    /**
     * 营业执照号码
     */
    @Filed(name = "businessNo", displayName = "营业执照号码", length = 20)
    private String businessNo;

    /**
     * 国家
     */
    @Filed(name = "country", displayName = "国家", length = 255)
    private String country;

    /**
     * 省
     */
    @Filed(name = "province", displayName = "省", length = 255)
    private String province;

    /**
     * 城市
     */
    @Filed(name = "city", displayName = "城市", length = 255)
    private String city;

    /**
     * 法人
     */
    @Filed(name = "corporation", displayName = "法人", length = 255)
    private String corporation;

    /**
     * 是否为境外客户
     */
    @Filed(name = "foreignCustomer", displayName = "是否为境外客户", length = 1)
    private Boolean foreignCustomer;

    /**
     * 负责人
     */
    @Filed(name = "principal", displayName = "负责人", length = 255)
    private String principal;

    /**
     * 电话
     */
    @Filed(name = "tel", displayName = "电话", length = 20)
    private String tel;

    /**
     * 手机
     */
    @Filed(name = "mobileNumber", displayName = "手机", length = 20)
    private String mobileNumber;

    /**
     * 传真
     */
    @Filed(name = "fax", displayName = "传真", length = 20)
    private String fax;

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

    /**
     * 客户网站
     */
    @Filed(name = "website", displayName = "客户网站", length = 255)
    private String website;

    /**
     * 是否停用
     */
    @Filed(name = "disable", displayName = "是否停用", length = 1)
    private Boolean disable;

    /**
     * 客户类型id
     */
    @Filed(name = "fkCustomerTypeId", displayName = "客户类型id", length = 19)
    private Long fkCustomerTypeId;

    /**
     * 客户级别
     */
    @Filed(name = "customerLevel", displayName = "客户级别", length = 19)
    private Long customerLevel;

    /**
     * 业务经理
     */
    @Filed(name = "fkBusinessManager", displayName = "业务经理", length = 19)
    private Long fkBusinessManager;

    /**
     * 业务助理
     */
    @Filed(name = "fkBusinessAssistant", displayName = "业务助理", length = 19)
    private Long fkBusinessAssistant;
}