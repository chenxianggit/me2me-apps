package com.me2me.content.dao;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * 上海拙心网络科技有限公司出品
 * Author: 代宝磊
 * Date: 2016/5/10
 * Time :11:51
 */
@Repository
@Slf4j
public class LiveForContentJdbcDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public JSONArray getTopicCoreCircle(long topicId) {

        String sql = "select core_circle from topic where id=?";
        List<Map<String,Object>> list = jdbcTemplate.queryForList(sql,topicId);
        if(list.size()>0){
            return JSON.parseArray((String)list.get(0).get("core_circle"));
        }
        return  null;
    }
    
    /**
     * 记录删除日志
     * @param type	类型
     * @param oid	操作对象ID
     * @param uid	删除人UID
     */
    public void insertDeleteLog(int type, long oid, long uid){
    	StringBuilder sb = new StringBuilder();
    	sb.append("insert into delete_log(type,oid,uid,del_time) values(");
    	sb.append(type).append(",").append(oid).append(",");
    	sb.append(uid).append(",now())");
    	String sql = sb.toString();
    	jdbcTemplate.execute(sql);
    }
    
    public List<Map<String,Object>> getTopicListByIds(List<Long> ids){
    	if(null == ids || ids.size() == 0){
    		return null;
    	}
    	StringBuilder sb = new StringBuilder();
    	sb.append("select id,uid,core_circle from topic where id in (");
    	for(int i=0;i<ids.size();i++){
    		if(i > 0){
    			sb.append(",");
    		}
    		sb.append(ids.get(i).longValue());
    	}
    	sb.append(")");
        String sql = sb.toString();
        return jdbcTemplate.queryForList(sql);
    }
}
