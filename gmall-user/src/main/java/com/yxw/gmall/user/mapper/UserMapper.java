package com.yxw.gmall.user.mapper;


import com.yxw.gmall.bean.UmsMember;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Component
public interface UserMapper extends Mapper<UmsMember> {
    //List<UmsMember> selectAllUser();
}
