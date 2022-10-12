package com.yukio.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yukio.model.TbUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.Collection;

@Mapper
public interface TbUserMapper extends BaseMapper<TbUser> {
    Integer insertBatchSomeColumn(Collection<TbUser> entityList);
}
