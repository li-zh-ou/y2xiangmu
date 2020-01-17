package com.accp.mapper;

import com.accp.domain.Carbank;
import com.accp.domain.CarbankExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarbankMapper {
    int countByExample(CarbankExample example);

    int deleteByExample(CarbankExample example);

    int deleteByPrimaryKey(Integer carbankid);

    int insert(Carbank record);

    int insertSelective(Carbank record);

    List<Carbank> selectByExample(CarbankExample example);

    Carbank selectByPrimaryKey(Integer carbankid);

    int updateByExampleSelective(@Param("record") Carbank record, @Param("example") CarbankExample example);

    int updateByExample(@Param("record") Carbank record, @Param("example") CarbankExample example);

    int updateByPrimaryKeySelective(Carbank record);

    int updateByPrimaryKey(Carbank record);
}