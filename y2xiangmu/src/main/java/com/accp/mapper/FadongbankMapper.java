package com.accp.mapper;

import com.accp.domain.Fadongbank;
import com.accp.domain.FadongbankExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FadongbankMapper {
    int countByExample(FadongbankExample example);

    int deleteByExample(FadongbankExample example);

    int deleteByPrimaryKey(Integer fabankid);

    int insert(Fadongbank record);

    int insertSelective(Fadongbank record);

    List<Fadongbank> selectByExample(FadongbankExample example);

    Fadongbank selectByPrimaryKey(Integer fabankid);

    int updateByExampleSelective(@Param("record") Fadongbank record, @Param("example") FadongbankExample example);

    int updateByExample(@Param("record") Fadongbank record, @Param("example") FadongbankExample example);

    int updateByPrimaryKeySelective(Fadongbank record);

    int updateByPrimaryKey(Fadongbank record);
}