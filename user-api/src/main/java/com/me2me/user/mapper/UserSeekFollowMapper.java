package com.me2me.user.mapper;

import com.me2me.user.model.UserSeekFollow;
import com.me2me.user.model.UserSeekFollowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserSeekFollowMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_seek_follow
     *
     * @mbggenerated Sat Apr 22 13:54:59 CST 2017
     */
    int countByExample(UserSeekFollowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_seek_follow
     *
     * @mbggenerated Sat Apr 22 13:54:59 CST 2017
     */
    int deleteByExample(UserSeekFollowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_seek_follow
     *
     * @mbggenerated Sat Apr 22 13:54:59 CST 2017
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_seek_follow
     *
     * @mbggenerated Sat Apr 22 13:54:59 CST 2017
     */
    int insert(UserSeekFollow record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_seek_follow
     *
     * @mbggenerated Sat Apr 22 13:54:59 CST 2017
     */
    int insertSelective(UserSeekFollow record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_seek_follow
     *
     * @mbggenerated Sat Apr 22 13:54:59 CST 2017
     */
    List<UserSeekFollow> selectByExample(UserSeekFollowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_seek_follow
     *
     * @mbggenerated Sat Apr 22 13:54:59 CST 2017
     */
    UserSeekFollow selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_seek_follow
     *
     * @mbggenerated Sat Apr 22 13:54:59 CST 2017
     */
    int updateByExampleSelective(@Param("record") UserSeekFollow record, @Param("example") UserSeekFollowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_seek_follow
     *
     * @mbggenerated Sat Apr 22 13:54:59 CST 2017
     */
    int updateByExample(@Param("record") UserSeekFollow record, @Param("example") UserSeekFollowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_seek_follow
     *
     * @mbggenerated Sat Apr 22 13:54:59 CST 2017
     */
    int updateByPrimaryKeySelective(UserSeekFollow record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_seek_follow
     *
     * @mbggenerated Sat Apr 22 13:54:59 CST 2017
     */
    int updateByPrimaryKey(UserSeekFollow record);
    
    List<UserSeekFollow> getUserSeekFollowWithUid(@Param("uid") long uid, @Param("sinceId") long sinceId, @Param("pageSize") int pageSize);
}