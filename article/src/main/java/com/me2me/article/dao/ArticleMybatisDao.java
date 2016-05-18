package com.me2me.article.dao;

import com.me2me.article.mapper.ArticleMapper;
import com.me2me.article.mapper.ArticleTypeMapper;
import com.me2me.article.model.Article;
import com.me2me.article.model.ArticleExample;
import com.me2me.article.model.ArticleType;
import com.me2me.article.model.ArticleTypeExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 上海拙心网络科技有限公司出品
 * Author: 赵朋扬
 * Date: 2016/5/17.
 */
@Repository
public class ArticleMybatisDao {

    @Autowired
    private ArticleMapper articleMapper;

    @Autowired
    private ArticleTypeMapper articleTypeMapper;

    public List<Article> articleTimeline(){
        ArticleExample example = new ArticleExample();
        example.setOrderByClause("create_time desc");
        return articleMapper.selectByExampleWithBLOBs(example);
    }

    public void save(Article article){
        articleMapper.insertSelective(article);
    }

    public List<ArticleType> loadArticleTypes(){
        ArticleTypeExample example = new ArticleTypeExample();
        return articleTypeMapper.selectByExample(example);
    }

}