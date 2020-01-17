package com.accp.mapper;

import com.accp.domain.Huiyuan;
import com.accp.domain.HuiyuanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HuiyuanMapper {
    int countByExample(HuiyuanExample example);

    int deleteByExample(HuiyuanExample example);

    int insert(Huiyuan record);

    int insertSelective(Huiyuan record);

    List<Huiyuan> selectByExample(HuiyuanExample example);

    int updateByExampleSelective(@Param("record") Huiyuan record, @Param("example") HuiyuanExample example);

    int updateByExample(@Param("record") Huiyuan record, @Param("example") HuiyuanExample example);
}