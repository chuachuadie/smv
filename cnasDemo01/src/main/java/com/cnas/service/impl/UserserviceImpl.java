package com.cnas.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cnas.entity.User;
import com.cnas.mapper.UserMapper;
import com.cnas.service.Userservice;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

@Service
public class UserserviceImpl extends ServiceImpl<UserMapper, User> implements Userservice{
    /**
     * @param entity
     * @return
     */
    @Override
    public boolean save(User entity) {
        return super.save(entity);
    }

    /**
     * @param entityList
     * @return
     */
    @Override
    public boolean saveBatch(Collection<User> entityList) {
        return super.saveBatch(entityList);
    }

    /**
     * @param entityList
     * @return
     */
    @Override
    public boolean saveOrUpdateBatch(Collection<User> entityList) {
        return super.saveOrUpdateBatch(entityList);
    }

    /**
     * @param id
     * @return
     */
    @Override
    public boolean removeById(Serializable id) {
        return super.removeById(id);
    }

    /**
     * @param columnMap
     * @return
     */
    @Override
    public boolean removeByMap(Map<String, Object> columnMap) {
        return super.removeByMap(columnMap);
    }

    /**
     * @param queryWrapper
     * @return
     */
    @Override
    public boolean remove(Wrapper<User> queryWrapper) {
        return super.remove(queryWrapper);
    }

    /**
     * @param idList
     * @return
     */
    @Override
    public boolean removeByIds(Collection<? extends Serializable> idList) {
        return super.removeByIds(idList);
    }

    /**
     * @param entity
     * @return
     */
    @Override
    public boolean updateById(User entity) {
        return super.updateById(entity);
    }

    /**
     * @param updateWrapper
     * @return
     */
    @Override
    public boolean update(Wrapper<User> updateWrapper) {
        return super.update(updateWrapper);
    }

    /**
     * @param entity
     * @param updateWrapper
     * @return
     */
    @Override
    public boolean update(User entity, Wrapper<User> updateWrapper) {
        return super.update(entity, updateWrapper);
    }

    /**
     * @param entityList
     * @return
     */
    @Override
    public boolean updateBatchById(Collection<User> entityList) {
        return super.updateBatchById(entityList);
    }

    /**
     * @param id
     * @return
     */
    @Override
    public User getById(Serializable id) {
        return super.getById(id);
    }

    /**
     * @param idList
     * @return
     */
    @Override
    public List<User> listByIds(Collection<? extends Serializable> idList) {
        return super.listByIds(idList);
    }

    /**
     * @param columnMap
     * @return
     */
    @Override
    public List<User> listByMap(Map<String, Object> columnMap) {
        return super.listByMap(columnMap);
    }

    /**
     * @param queryWrapper
     * @return
     */
    @Override
    public User getOne(Wrapper<User> queryWrapper) {
        return super.getOne(queryWrapper);
    }

    /**
     * @return
     */
    @Override
    public int count() {
        return super.count();
    }

    /**
     * @param queryWrapper
     * @return
     */
    @Override
    public int count(Wrapper<User> queryWrapper) {
        return super.count(queryWrapper);
    }

    /**
     * @param queryWrapper
     * @return
     */
    @Override
    public List<User> list(Wrapper<User> queryWrapper) {
        return super.list(queryWrapper);
    }

    /**
     * @return
     */
    @Override
    public List<User> list() {
        return super.list();
    }
}
