package com.mszlu.blog.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mszlu.blog.dao.pojo.Tag;

import java.util.List;

public interface TagMapper extends BaseMapper<Tag> {
    List<Tag> findTagsByArticleId(Long id);
    List<Tag> findTagsByTagIds(List<Long> tagIds);
    List<Long> findHotsTagIds(int limit);
}
