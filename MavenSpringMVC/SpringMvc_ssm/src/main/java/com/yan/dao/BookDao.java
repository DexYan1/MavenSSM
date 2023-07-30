package com.yan.dao;

import com.yan.domain.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * 数据层-开发
 * @Date: 2023/7/23 - 19:17
 * @Description: com.yan.dao
 * @version: 1.0
 */
public interface BookDao {

    //@Insert("insert into tbl_book values(null,#{type},#{name},#{description})")
    @Insert("insert into tbl_book (type,name,description) values(#{type},#{name},#{description})")
    int save(Book book);

    @Delete("delete from tbl_book where id = #{id}")
    int delete(Integer id);

    @Update("update tbl_book set type = #{type}, name = #{name}, description = #{description} where id = #{id}")
    int update(Book book);

    @Select("select * from tbl_book where id=${id};")
    Book getById(Integer id);

    @Select("select * from tbl_book;")
    List<Book> getAll();
}
