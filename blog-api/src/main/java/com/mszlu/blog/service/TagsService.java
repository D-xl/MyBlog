package com.mszlu.blog.service;

import com.mszlu.blog.dao.mapper.ArticleMapper;
import com.mszlu.blog.dao.pojo.Article;
import com.mszlu.blog.dao.pojo.Tag;
import com.mszlu.blog.vo.Result;
import com.mszlu.blog.vo.TagVo;

import java.util.List;

public interface TagsService {


    List<TagVo> findTagsByArticleId(Long id);

    List<TagVo> hots(int limit);

    Result findAll();

    Result findAllDeatil();

    Result findDetailById(Long id);
}

