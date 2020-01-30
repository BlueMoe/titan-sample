package com.sequarius.repository;

import com.sequarius.domain.SysRolePermissionDO;
import com.sequarius.domain.SysRolePermissionDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysRolePermissionDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_permission
     *
     * @mbg.generated Thu Jan 30 22:38:08 CST 2020
     */
    long countByExample(SysRolePermissionDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_permission
     *
     * @mbg.generated Thu Jan 30 22:38:08 CST 2020
     */
    int deleteByExample(SysRolePermissionDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_permission
     *
     * @mbg.generated Thu Jan 30 22:38:08 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_permission
     *
     * @mbg.generated Thu Jan 30 22:38:08 CST 2020
     */
    int insert(SysRolePermissionDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_permission
     *
     * @mbg.generated Thu Jan 30 22:38:08 CST 2020
     */
    int insertSelective(SysRolePermissionDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_permission
     *
     * @mbg.generated Thu Jan 30 22:38:08 CST 2020
     */
    List<SysRolePermissionDO> selectByExample(SysRolePermissionDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_permission
     *
     * @mbg.generated Thu Jan 30 22:38:08 CST 2020
     */
    SysRolePermissionDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_permission
     *
     * @mbg.generated Thu Jan 30 22:38:08 CST 2020
     */
    int updateByExampleSelective(@Param("record") SysRolePermissionDO record, @Param("example") SysRolePermissionDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_permission
     *
     * @mbg.generated Thu Jan 30 22:38:08 CST 2020
     */
    int updateByExample(@Param("record") SysRolePermissionDO record, @Param("example") SysRolePermissionDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_permission
     *
     * @mbg.generated Thu Jan 30 22:38:08 CST 2020
     */
    int updateByPrimaryKeySelective(SysRolePermissionDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_permission
     *
     * @mbg.generated Thu Jan 30 22:38:08 CST 2020
     */
    int updateByPrimaryKey(SysRolePermissionDO record);
}