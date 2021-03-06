package com.sequarius.titan.sample.repository;

import com.sequarius.titan.sample.domain.PayTypeDO;
import com.sequarius.titan.sample.domain.PayTypeDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PayTypeDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_type
     *
     * @mbg.generated Mon Feb 17 15:26:31 CST 2020
     */
    long countByExample(PayTypeDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_type
     *
     * @mbg.generated Mon Feb 17 15:26:31 CST 2020
     */
    int deleteByExample(PayTypeDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_type
     *
     * @mbg.generated Mon Feb 17 15:26:31 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_type
     *
     * @mbg.generated Mon Feb 17 15:26:31 CST 2020
     */
    int insert(PayTypeDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_type
     *
     * @mbg.generated Mon Feb 17 15:26:31 CST 2020
     */
    int insertSelective(PayTypeDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_type
     *
     * @mbg.generated Mon Feb 17 15:26:31 CST 2020
     */
    List<PayTypeDO> selectByExample(PayTypeDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_type
     *
     * @mbg.generated Mon Feb 17 15:26:31 CST 2020
     */
    PayTypeDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_type
     *
     * @mbg.generated Mon Feb 17 15:26:31 CST 2020
     */
    int updateByExampleSelective(@Param("record") PayTypeDO record, @Param("example") PayTypeDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_type
     *
     * @mbg.generated Mon Feb 17 15:26:31 CST 2020
     */
    int updateByExample(@Param("record") PayTypeDO record, @Param("example") PayTypeDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_type
     *
     * @mbg.generated Mon Feb 17 15:26:31 CST 2020
     */
    int updateByPrimaryKeySelective(PayTypeDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_type
     *
     * @mbg.generated Mon Feb 17 15:26:31 CST 2020
     */
    int updateByPrimaryKey(PayTypeDO record);
}