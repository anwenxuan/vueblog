package com.anwenxuan.service.impl;

import com.anwenxuan.entity.User;
import com.anwenxuan.mapper.UserMapper;
import com.anwenxuan.service.UserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
