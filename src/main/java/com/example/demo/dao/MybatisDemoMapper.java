package com.example.demo.dao;

import com.example.demo.pojo.MybatisDemo;
import com.example.demo.pojo.MybatisDemoExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

@Service
public interface MybatisDemoMapper {
    long countByExample(MybatisDemoExample example);

    int deleteByExample(MybatisDemoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MybatisDemo record);

    int insertSelective(MybatisDemo record);

    List<MybatisDemo> selectByExample(MybatisDemoExample example);

    MybatisDemo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MybatisDemo record, @Param("example") MybatisDemoExample example);

    int updateByExample(@Param("record") MybatisDemo record, @Param("example") MybatisDemoExample example);

    int updateByPrimaryKeySelective(MybatisDemo record);

    int updateByPrimaryKey(MybatisDemo record);

    List<MybatisDemo> selectByName(String name);



    List<MybatisDemo> selectByNameByLogic(RowBounds rowBounds,@Param("name")String name);

    List<MybatisDemo> selectByNameByMysql(Map<String,Object> map);
}