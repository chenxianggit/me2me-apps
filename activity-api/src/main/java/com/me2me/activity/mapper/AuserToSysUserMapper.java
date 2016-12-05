package com.me2me.activity.mapper;

import com.me2me.activity.model.AuserToSysUser;
import com.me2me.activity.model.AuserToSysUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuserToSysUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_user_to_sysuser
     *
     * @mbggenerated Mon Dec 05 10:24:34 CST 2016
     */
    int countByExample(AuserToSysUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_user_to_sysuser
     *
     * @mbggenerated Mon Dec 05 10:24:34 CST 2016
     */
    int deleteByExample(AuserToSysUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_user_to_sysuser
     *
     * @mbggenerated Mon Dec 05 10:24:34 CST 2016
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_user_to_sysuser
     *
     * @mbggenerated Mon Dec 05 10:24:34 CST 2016
     */
    int insert(AuserToSysUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_user_to_sysuser
     *
     * @mbggenerated Mon Dec 05 10:24:34 CST 2016
     */
    int insertSelective(AuserToSysUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_user_to_sysuser
     *
     * @mbggenerated Mon Dec 05 10:24:34 CST 2016
     */
    List<AuserToSysUser> selectByExample(AuserToSysUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_user_to_sysuser
     *
     * @mbggenerated Mon Dec 05 10:24:34 CST 2016
     */
    AuserToSysUser selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_user_to_sysuser
     *
     * @mbggenerated Mon Dec 05 10:24:34 CST 2016
     */
    int updateByExampleSelective(@Param("record") AuserToSysUser record, @Param("example") AuserToSysUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_user_to_sysuser
     *
     * @mbggenerated Mon Dec 05 10:24:34 CST 2016
     */
    int updateByExample(@Param("record") AuserToSysUser record, @Param("example") AuserToSysUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_user_to_sysuser
     *
     * @mbggenerated Mon Dec 05 10:24:34 CST 2016
     */
    int updateByPrimaryKeySelective(AuserToSysUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_user_to_sysuser
     *
     * @mbggenerated Mon Dec 05 10:24:34 CST 2016
     */
    int updateByPrimaryKey(AuserToSysUser record);
}