package com.accp.mapper;

import com.accp.domain.Wxjiedan;
import com.accp.domain.WxjiedanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WxjiedanMapper {
    int countByExample(WxjiedanExample example);

    int deleteByExample(WxjiedanExample example);

    int insert(Wxjiedan record);

    int insertSelective(Wxjiedan record);

    List<Wxjiedan> selectByExample(WxjiedanExample example);

    int updateByExampleSelective(@Param("record") Wxjiedan record, @Param("example") WxjiedanExample example);

    int updateByExample(@Param("record") Wxjiedan record, @Param("example") WxjiedanExample example);
}