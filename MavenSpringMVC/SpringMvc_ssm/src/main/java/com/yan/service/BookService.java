package com.yan.service;

import com.yan.domain.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 业务层-开发
 * @Date: 2023/7/23 - 19:16
 * @Description: com.yan.service
 * @version: 1.0
 */
@Transactional //表示所有方法进行事务管理
public interface BookService {

    /**
     * 保存
     * @param book
     * @return
     */
    boolean save(Book book);

    /**
     * 修改
     * @param book
     * @return
     */
    boolean update(Book book);

    /**
     * 按id删除
     * @param id
     * @return
     */
    boolean delete(Integer id);

    /**
     * 按id查询
     * @param id
     * @return
     */
    Book getById(Integer id);

    /**
     * 查询全部
     * @return
     */
    List<Book> getAll();
}
