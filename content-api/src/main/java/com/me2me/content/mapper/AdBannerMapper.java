package com.me2me.content.mapper;

import com.me2me.content.model.AdBanner;
import com.me2me.content.model.AdBannerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdBannerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_banner
     *
     * @mbggenerated Tue Oct 24 11:20:05 CST 2017
     */
    int countByExample(AdBannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_banner
     *
     * @mbggenerated Tue Oct 24 11:20:05 CST 2017
     */
    int deleteByExample(AdBannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_banner
     *
     * @mbggenerated Tue Oct 24 11:20:05 CST 2017
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_banner
     *
     * @mbggenerated Tue Oct 24 11:20:05 CST 2017
     */
    int insert(AdBanner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_banner
     *
     * @mbggenerated Tue Oct 24 11:20:05 CST 2017
     */
    int insertSelective(AdBanner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_banner
     *
     * @mbggenerated Tue Oct 24 11:20:05 CST 2017
     */
    List<AdBanner> selectByExample(AdBannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_banner
     *
     * @mbggenerated Tue Oct 24 11:20:05 CST 2017
     */
    AdBanner selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_banner
     *
     * @mbggenerated Tue Oct 24 11:20:05 CST 2017
     */
    int updateByExampleSelective(@Param("record") AdBanner record, @Param("example") AdBannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_banner
     *
     * @mbggenerated Tue Oct 24 11:20:05 CST 2017
     */
    int updateByExample(@Param("record") AdBanner record, @Param("example") AdBannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_banner
     *
     * @mbggenerated Tue Oct 24 11:20:05 CST 2017
     */
    int updateByPrimaryKeySelective(AdBanner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_banner
     *
     * @mbggenerated Tue Oct 24 11:20:05 CST 2017
     */
    int updateByPrimaryKey(AdBanner record);
    
    /**
     * 获取有正常广告的广告位
     * @return
     */
    List<AdBanner> getNormalBanners(@Param("uid") long uid);
}