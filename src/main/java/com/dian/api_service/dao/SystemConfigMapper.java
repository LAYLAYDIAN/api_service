package com.dian.api_service.dao;
import com.dian.api_service.model.SystemConfig;

import java.util.List;

public interface SystemConfigMapper {
    int deleteByPrimaryKey(Integer configId);

    int insert(SystemConfig record);

    int insertSelective(SystemConfig record);

    SystemConfig selectByPrimaryKey(Integer configId);

    int updateByPrimaryKeySelective(SystemConfig record);

    int updateByPrimaryKey(SystemConfig record);

    List<SystemConfig> getAll();
}