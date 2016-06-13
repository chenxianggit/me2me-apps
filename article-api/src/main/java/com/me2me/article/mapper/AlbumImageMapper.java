package com.me2me.article.mapper;

import com.me2me.article.model.AlbumImage;
import com.me2me.article.model.AlbumImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AlbumImageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table album_image
     *
     * @mbggenerated Fri May 27 14:31:45 CST 2016
     */
    int countByExample(AlbumImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table album_image
     *
     * @mbggenerated Fri May 27 14:31:45 CST 2016
     */
    int deleteByExample(AlbumImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table album_image
     *
     * @mbggenerated Fri May 27 14:31:45 CST 2016
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table album_image
     *
     * @mbggenerated Fri May 27 14:31:45 CST 2016
     */
    int insert(AlbumImage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table album_image
     *
     * @mbggenerated Fri May 27 14:31:45 CST 2016
     */
    int insertSelective(AlbumImage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table album_image
     *
     * @mbggenerated Fri May 27 14:31:45 CST 2016
     */
    List<AlbumImage> selectByExample(AlbumImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table album_image
     *
     * @mbggenerated Fri May 27 14:31:45 CST 2016
     */
    AlbumImage selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table album_image
     *
     * @mbggenerated Fri May 27 14:31:45 CST 2016
     */
    int updateByExampleSelective(@Param("record") AlbumImage record, @Param("example") AlbumImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table album_image
     *
     * @mbggenerated Fri May 27 14:31:45 CST 2016
     */
    int updateByExample(@Param("record") AlbumImage record, @Param("example") AlbumImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table album_image
     *
     * @mbggenerated Fri May 27 14:31:45 CST 2016
     */
    int updateByPrimaryKeySelective(AlbumImage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table album_image
     *
     * @mbggenerated Fri May 27 14:31:45 CST 2016
     */
    int updateByPrimaryKey(AlbumImage record);
}