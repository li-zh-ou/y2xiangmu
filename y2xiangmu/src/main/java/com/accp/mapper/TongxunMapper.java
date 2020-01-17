package com.accp.mapper;

import com.accp.domain.Tongxun;
import com.accp.domain.TongxunExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TongxunMapper {
    int countByExample(TongxunExample example);

    int deleteByExample(TongxunExample example);

    int insert(Tongxun record);

    int insertSelective(Tongxun record);

    List<Tongxun> selectByExample(TongxunExample example);

    int updateByExampleSelective(@Param("record") Tongxun record, @Param("example") TongxunExample example);

    int updateByExample(@Param("record") Tongxun record, @Param("example") TongxunExample example);
}