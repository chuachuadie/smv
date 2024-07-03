package com.cnas.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cnas.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {


    //这个Mapper接口中可以继承BaseMapper，也可以直接写注解查询，如下：
    @Select("select * from user where name = #{name}")
    @ResultType(User.class)
    List<User> getUserListByName(@Param("name") String name);

    @Select("select * from user where id = #{id}")
    @ResultType(User.class)
    User getUserById(@Param("id") String id);

    @Select("select name from user where id = #{id}")
    String getUserNameById(@Param("id") String id);

}


