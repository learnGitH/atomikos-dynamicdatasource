package com.frank.xa.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.frank.xa.BaseMapper;
import com.frank.xa.entity.User;

/**
 * @author Frank_Lei
 * @Description
 * @CreateTime 2020年06月19日 15:57:00
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
