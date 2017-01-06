package com.me2me.activity.mapper;

import com.me2me.activity.model.AkingDomList;
import com.me2me.activity.model.AkingDomListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AkingDomListMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_kingdom_list
     *
     * @mbggenerated Fri Jan 06 16:58:28 CST 2017
     */
    int countByExample(AkingDomListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_kingdom_list
     *
     * @mbggenerated Fri Jan 06 16:58:28 CST 2017
     */
    int deleteByExample(AkingDomListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_kingdom_list
     *
     * @mbggenerated Fri Jan 06 16:58:28 CST 2017
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_kingdom_list
     *
     * @mbggenerated Fri Jan 06 16:58:28 CST 2017
     */
    int insert(AkingDomList record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_kingdom_list
     *
     * @mbggenerated Fri Jan 06 16:58:28 CST 2017
     */
    int insertSelective(AkingDomList record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_kingdom_list
     *
     * @mbggenerated Fri Jan 06 16:58:28 CST 2017
     */
    List<AkingDomList> selectByExample(AkingDomListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_kingdom_list
     *
     * @mbggenerated Fri Jan 06 16:58:28 CST 2017
     */
    AkingDomList selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_kingdom_list
     *
     * @mbggenerated Fri Jan 06 16:58:28 CST 2017
     */
    int updateByExampleSelective(@Param("record") AkingDomList record, @Param("example") AkingDomListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_kingdom_list
     *
     * @mbggenerated Fri Jan 06 16:58:28 CST 2017
     */
    int updateByExample(@Param("record") AkingDomList record, @Param("example") AkingDomListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_kingdom_list
     *
     * @mbggenerated Fri Jan 06 16:58:28 CST 2017
     */
    int updateByPrimaryKeySelective(AkingDomList record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_kingdom_list
     *
     * @mbggenerated Fri Jan 06 16:58:28 CST 2017
     */
    int updateByPrimaryKey(AkingDomList record);
}