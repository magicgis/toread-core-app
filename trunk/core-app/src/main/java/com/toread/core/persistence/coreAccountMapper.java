package com.toread.core.persistence;

import com.toread.core.domain.coreAccount;
import com.toread.core.domain.coreAccountExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface coreAccountMapper {
    int countByExample(coreAccountExample example);

    int deleteByExample(coreAccountExample example);

    int deleteByPrimaryKey(BigDecimal accountUnid);

    int insert(coreAccount record);

    int insertSelective(coreAccount record);

    List<coreAccount> selectByExample(coreAccountExample example);

    coreAccount selectByPrimaryKey(BigDecimal accountUnid);

    int updateByExampleSelective(@Param("record") coreAccount record, @Param("example") coreAccountExample example);

    int updateByExample(@Param("record") coreAccount record, @Param("example") coreAccountExample example);

    int updateByPrimaryKeySelective(coreAccount record);

    int updateByPrimaryKey(coreAccount record);
}