package com.me2me.live.mapper;

import com.me2me.live.model.LiveDisplayProtocol;
import com.me2me.live.model.LiveDisplayProtocolExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LiveDisplayProtocolMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live_display_protocol
     *
     * @mbggenerated Mon Sep 26 16:32:06 CST 2016
     */
    int countByExample(LiveDisplayProtocolExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live_display_protocol
     *
     * @mbggenerated Mon Sep 26 16:32:06 CST 2016
     */
    int deleteByExample(LiveDisplayProtocolExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live_display_protocol
     *
     * @mbggenerated Mon Sep 26 16:32:06 CST 2016
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live_display_protocol
     *
     * @mbggenerated Mon Sep 26 16:32:06 CST 2016
     */
    int insert(LiveDisplayProtocol record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live_display_protocol
     *
     * @mbggenerated Mon Sep 26 16:32:06 CST 2016
     */
    int insertSelective(LiveDisplayProtocol record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live_display_protocol
     *
     * @mbggenerated Mon Sep 26 16:32:06 CST 2016
     */
    List<LiveDisplayProtocol> selectByExample(LiveDisplayProtocolExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live_display_protocol
     *
     * @mbggenerated Mon Sep 26 16:32:06 CST 2016
     */
    LiveDisplayProtocol selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live_display_protocol
     *
     * @mbggenerated Mon Sep 26 16:32:06 CST 2016
     */
    int updateByExampleSelective(@Param("record") LiveDisplayProtocol record, @Param("example") LiveDisplayProtocolExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live_display_protocol
     *
     * @mbggenerated Mon Sep 26 16:32:06 CST 2016
     */
    int updateByExample(@Param("record") LiveDisplayProtocol record, @Param("example") LiveDisplayProtocolExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live_display_protocol
     *
     * @mbggenerated Mon Sep 26 16:32:06 CST 2016
     */
    int updateByPrimaryKeySelective(LiveDisplayProtocol record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live_display_protocol
     *
     * @mbggenerated Mon Sep 26 16:32:06 CST 2016
     */
    int updateByPrimaryKey(LiveDisplayProtocol record);
}