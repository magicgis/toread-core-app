package com.toread.core.persistence;

import com.toread.core.domain.CoreAccount;
import com.toread.core.domain.CoreAccountExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoreAccountMapper {
    int countByExample(CoreAccountExample example);

    int deleteByExample(CoreAccountExample example);

    int deleteByPrimaryKey(BigDecimal accountUnid);

    int insert(CoreAccount record);

    int insertSelective(CoreAccount record);

    List<CoreAccount> selectByExample(CoreAccountExample example);

    CoreAccount selectByPrimaryKey(BigDecimal accountUnid);

    int updateByExampleSelective(@Param("record") CoreAccount record, @Param("example") CoreAccountExample example);

    int updateByExample(@Param("record") CoreAccount record, @Param("example") CoreAccountExample example);

    int updateByPrimaryKeySelective(CoreAccount record);

    int updateByPrimaryKey(CoreAccount record);
}