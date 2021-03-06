package com.yxw.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.yxw.gmall.bean.PmsBaseAttrInfo;
import com.yxw.gmall.manage.mapper.PmsBaseAttrInfoMapper;
import com.yxw.gmall.manage.mapper.PmsBaseAttrValueMapper;
import com.yxw.gmall.service.AttrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;

import java.util.List;

@Service
public class AttrServiceImpl implements AttrService {

    @Autowired
    PmsBaseAttrInfoMapper pmsBaseAttrInfoMapper;
    @Autowired
    PmsBaseAttrValueMapper pmsBaseAttrValueMapper;

    @Override
    public List<PmsBaseAttrInfo> attrInfoList(String catalog3Id) {

        PmsBaseAttrInfo pmsBaseAttrInfo = new PmsBaseAttrInfo();
        pmsBaseAttrInfo.setCatalog3Id(catalog3Id);
        List<PmsBaseAttrInfo> pmsBaseAttrInfos = pmsBaseAttrInfoMapper.select(pmsBaseAttrInfo);
        return pmsBaseAttrInfos;
    }
}
