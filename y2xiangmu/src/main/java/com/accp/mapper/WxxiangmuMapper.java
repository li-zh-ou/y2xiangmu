package com.accp.mapper;

import com.accp.domain.Wxxiangmu;
import com.accp.domain.WxxiangmuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WxxiangmuMapper {
    int countByExample(WxxiangmuExample example);

    int deleteByExample(WxxiangmuExample example);

    int insert(Wxxiangmu record);

    int insertSelective(Wxxiangmu record);

    List<Wxxiangmu> selectByExample(WxxiangmuExample example);

    int updateByExampleSelective(@Param("record") Wxxiangmu record, @Param("example") WxxiangmuExample example);

    int updateByExample(@Param("record") Wxxiangmu record, @Param("example") WxxiangmuExample example);
}