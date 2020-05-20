package com.yxw.gmall.user.controller;

import com.yxw.gmall.bean.UmsMember;
import com.yxw.gmall.bean.UmsMemberReceiveAddress;
import com.yxw.gmall.service.UserService;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
       List<UmsMember> umsMembers =  userService.getAllUser();
        return umsMembers;
    }

    @RequestMapping("getReceiveAddressByMemberId")
    @ResponseBody
    //public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(@RequestBody String memberId){
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId){
        List<UmsMemberReceiveAddress> umsMemberReceiveAddress =  userService.getReceiveAddressByMemberId(memberId);
        return umsMemberReceiveAddress;
    }

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "hello user";
    }

}
