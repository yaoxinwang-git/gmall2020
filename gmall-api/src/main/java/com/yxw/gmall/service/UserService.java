package com.yxw.gmall.service;

import com.yxw.gmall.bean.UmsMember;
import com.yxw.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;


public interface UserService {

    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
