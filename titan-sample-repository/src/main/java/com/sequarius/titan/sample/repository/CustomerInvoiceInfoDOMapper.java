package com.sequarius.titan.sample.repository;

import com.sequarius.titan.sample.domain.CustomerInvoiceInfoDO;
import com.sequarius.titan.sample.domain.CustomerInvoiceInfoDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CustomerInvoiceInfoDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_invoice_info
     *
     * @mbg.generated Mon Feb 17 15:26:31 CST 2020
     */
    long countByExample(CustomerInvoiceInfoDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_invoice_info
     *
     * @mbg.generated Mon Feb 17 15:26:31 CST 2020
     */
    int deleteByExample(CustomerInvoiceInfoDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_invoice_info
     *
     * @mbg.generated Mon Feb 17 15:26:31 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_invoice_info
     *
     * @mbg.generated Mon Feb 17 15:26:31 CST 2020
     */
    int insert(CustomerInvoiceInfoDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_invoice_info
     *
     * @mbg.generated Mon Feb 17 15:26:31 CST 2020
     */
    int insertSelective(CustomerInvoiceInfoDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_invoice_info
     *
     * @mbg.generated Mon Feb 17 15:26:31 CST 2020
     */
    List<CustomerInvoiceInfoDO> selectByExample(CustomerInvoiceInfoDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_invoice_info
     *
     * @mbg.generated Mon Feb 17 15:26:31 CST 2020
     */
    CustomerInvoiceInfoDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_invoice_info
     *
     * @mbg.generated Mon Feb 17 15:26:31 CST 2020
     */
    int updateByExampleSelective(@Param("record") CustomerInvoiceInfoDO record, @Param("example") CustomerInvoiceInfoDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_invoice_info
     *
     * @mbg.generated Mon Feb 17 15:26:31 CST 2020
     */
    int updateByExample(@Param("record") CustomerInvoiceInfoDO record, @Param("example") CustomerInvoiceInfoDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_invoice_info
     *
     * @mbg.generated Mon Feb 17 15:26:31 CST 2020
     */
    int updateByPrimaryKeySelective(CustomerInvoiceInfoDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_invoice_info
     *
     * @mbg.generated Mon Feb 17 15:26:31 CST 2020
     */
    int updateByPrimaryKey(CustomerInvoiceInfoDO record);
}