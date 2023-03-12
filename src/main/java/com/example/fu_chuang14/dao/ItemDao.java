package com.example.fu_chuang14.dao;

import com.example.fu_chuang14.pojo.Item;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface ItemDao {

    @Update("insert into t_item values(#{account},#{imageId},#{name},#{beiZhu},#{moneyCount},#{date},#{type},#{isOUt})")
    void insert(Item item);

//    @Update("update t_item set carbonNum = #{carbonNum} where uname = #{uname} and date = #{date}")
//    void update(Item item);

    @Delete("delete from t_item where account = #{account} and imageId = #{imageId}")
    void delete(Item item);

    @Select("select* from t_item where account = #{account} and imageId = #{imageId}")
    List<Item> findByAccountAndImageId(String account,String imageId);

    @Select("select* from t_item where account = #{account}")
    List<Item> findByAccount(String account);
}
