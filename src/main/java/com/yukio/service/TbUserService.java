package com.yukio.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yukio.mapper.TbUserMapper;
import com.yukio.model.TbUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class TbUserService extends ServiceImpl<TbUserMapper, TbUser> {

    @Resource
    private TbUserMapper ictPlanMapper;

    public void add(TbUser tbUser) {
        super.baseMapper.insert(tbUser);
    }

    public void process() {
        List<TbUser> userList = new ArrayList<>();
        userList.add(TbUser.builder().userName("test1").id(1).sex("1").build());
        userList.add(TbUser.builder().userName("test2").id(2).sex("2").build());
        ictPlanMapper.insertBatchSomeColumn(userList);
    }

}
