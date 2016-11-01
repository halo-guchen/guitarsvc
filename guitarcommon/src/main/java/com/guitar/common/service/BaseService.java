package com.guitar.common.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guitar.common.base.mapper.GuitarMapper;
import com.guitar.common.po.BasePojo;

/**
 * 公用方法做抽取，方便使用
 * 
 * @param <T extends BasePojo>-->公共属性抽取,暂时不用
 */
public abstract class BaseService<T> {
    
    @Autowired
    private GuitarMapper<T> mapper;

    /**
     * 返回具体的Mapper
     * 
     * @return
     */
    private GuitarMapper<T> getMapper(){
        return this.mapper;
    }
//    public abstract Mapper<T> getMapper();

    /**
     * 根据主键ID查询数据
     * 
     * @param id
     * @return
     */
    public T queryById(Long id) {
        return getMapper().selectByPrimaryKey(id);
    }

    /**
     * 查询集合
     * 
     * @param t
     * @return
     */
    public List<T> queryList(T t) {
        return getMapper().select(t);
    }

    /**
     * 分页查询
     * @param t
     * @param page
     * @param rows
     * @return
     */
    public PageInfo<T> queryListPage(T t, Integer page, Integer rows) {
        // 设置分页参数
        PageHelper.startPage(page, rows);
        //查询
        List<T> list = this.queryList(t);
        return new PageInfo<T>(list);
    }
    
    /**
     * 查询数量
     * 
     * @return
     */
    public Integer queryCount(T t){
        return this.getMapper().selectCount(t);
    }
    
    /**
     * 新增数据
     * @param t
     * @return 受影响数据行数
     */
    public Integer save(T t){
        return this.getMapper().insert(t);
    }
    
    /**
     * 新增数据，不为null作为参数插入
     * @param t
     * @return 受影响数据行数
     */
    public Integer saveSelective(T t){
        return this.getMapper().insertSelective(t);
    }
    
    /**
     * 更新数据
     * @param t
     * @return 受影响数据行数
     */
    public Integer update(T t){
        return this.getMapper().updateByPrimaryKey(t);
    }
    
    /**
     * 更新数据，不为null作为参数插入
     * @param t
     * @return 受影响数据行数
     */
    public Integer updateSelective(T t){
        return this.getMapper().updateByPrimaryKeySelective(t);
    }
    
    /**
     * 删除
     * 
     * @param id
     * @return
     */
    public Integer deleteById(Long id){
        return this.getMapper().deleteByPrimaryKey(id);
    }
    
    /**
     * 批量删除
     * @param ids
     * @return
     */
    public Integer deleteByIds(Long[] ids){
        return this.getMapper().deleteByIDS(ids);
    }

}
