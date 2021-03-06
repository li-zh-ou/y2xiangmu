package com.accp.mapper;

import com.accp.domain.Kehucar;
import com.accp.domain.KehucarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KehucarMapper {
    int countByExample(KehucarExample example);

    int deleteByExample(KehucarExample example);

    int insert(Kehucar record);

    int insertSelective(Kehucar record);

    List<Kehucar> selectByExample(KehucarExample example);

    int updateByExampleSelective(@Param("record") Kehucar record, @Param("example") KehucarExample example);

    int updateByExample(@Param("record") Kehucar record, @Param("example") KehucarExample example);
}