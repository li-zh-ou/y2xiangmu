package com.accp.mapper;

import com.accp.domain.Zhiquan;
import com.accp.domain.ZhiquanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZhiquanMapper {
    int countByExample(ZhiquanExample example);

    int deleteByExample(ZhiquanExample example);

    int insert(Zhiquan record);

    int insertSelective(Zhiquan record);

    List<Zhiquan> selectByExample(ZhiquanExample example);

    int updateByExampleSelective(@Param("record") Zhiquan record, @Param("example") ZhiquanExample example);

    int updateByExample(@Param("record") Zhiquan record, @Param("example") ZhiquanExample example);
}