package com.mszlu.blog.controller;

import com.mszlu.blog.common.aop.LogAnnotation;
import com.mszlu.blog.common.cache.Cache;
import com.mszlu.blog.service.ArticleService;
import com.mszlu.blog.vo.Result;
import com.mszlu.blog.vo.params.ArticleParam;
import com.mszlu.blog.vo.params.PageParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//json数据进行交互
@RestController
@RequestMapping("articles")
public class ArticleController {
    @Autowired
    private ArticleService arcticleService;

    @LogAnnotation(module="文章",operator="获取文章列表")
    @PostMapping
    public Result listArcticle(@RequestBody PageParams pageParams){
        return arcticleService.listArcticle(pageParams);
    }

    @PostMapping("hot")
//    @PostMapping
    @Cache(expire = 5 * 60 * 1000,name = "hot_article")
    public Result hotArticle(){
        int limit = 5;
        return arcticleService.hotArticle(limit);
    }

    @PostMapping("new")
//    @PostMapping
    public Result newArticles(){
        int limit = 5;
        return arcticleService.newArticles(limit);
    }

    @PostMapping("listArchives")
    public Result listArchives(){
        return arcticleService.listArchives();
    }

    @PostMapping("view/{id}")
    public Result findArticleById(@PathVariable("id") long id){
        return arcticleService.findArticleById(id);
    }

    @PostMapping("publish")
    public Result publish(@RequestBody ArticleParam articleParam){
        return arcticleService.publish(articleParam);
    }

}
