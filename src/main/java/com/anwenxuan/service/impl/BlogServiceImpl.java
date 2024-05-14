package com.anwenxuan.service.impl;

import com.anwenxuan.entity.Blog;
import com.anwenxuan.mapper.BlogMapper;
import com.anwenxuan.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zzx
 * @since 2024-05-13
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
