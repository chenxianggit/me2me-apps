package com.me2me.content.mapper;

import com.me2me.content.model.BillBoardRelation;
import com.me2me.content.model.BillBoardRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BillBoardRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table billboard_relation
     *
     * @mbggenerated Mon Mar 20 13:48:53 CST 2017
     */
    int countByExample(BillBoardRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table billboard_relation
     *
     * @mbggenerated Mon Mar 20 13:48:53 CST 2017
     */
    int deleteByExample(BillBoardRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table billboard_relation
     *
     * @mbggenerated Mon Mar 20 13:48:53 CST 2017
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table billboard_relation
     *
     * @mbggenerated Mon Mar 20 13:48:53 CST 2017
     */
    int insert(BillBoardRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table billboard_relation
     *
     * @mbggenerated Mon Mar 20 13:48:53 CST 2017
     */
    int insertSelective(BillBoardRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table billboard_relation
     *
     * @mbggenerated Mon Mar 20 13:48:53 CST 2017
     */
    List<BillBoardRelation> selectByExample(BillBoardRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table billboard_relation
     *
     * @mbggenerated Mon Mar 20 13:48:53 CST 2017
     */
    BillBoardRelation selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table billboard_relation
     *
     * @mbggenerated Mon Mar 20 13:48:53 CST 2017
     */
    int updateByExampleSelective(@Param("record") BillBoardRelation record, @Param("example") BillBoardRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table billboard_relation
     *
     * @mbggenerated Mon Mar 20 13:48:53 CST 2017
     */
    int updateByExample(@Param("record") BillBoardRelation record, @Param("example") BillBoardRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table billboard_relation
     *
     * @mbggenerated Mon Mar 20 13:48:53 CST 2017
     */
    int updateByPrimaryKeySelective(BillBoardRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table billboard_relation
     *
     * @mbggenerated Mon Mar 20 13:48:53 CST 2017
     */
    int updateByPrimaryKey(BillBoardRelation record);
}