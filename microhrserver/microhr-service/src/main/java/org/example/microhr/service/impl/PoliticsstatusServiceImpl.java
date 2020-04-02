package org.example.microhr.service.impl;

import org.example.microhr.mapper.PoliticsstatusMapper;
import org.example.microhr.model.Politicsstatus;
import org.example.microhr.service.PoliticsstatusService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("politicsstatusService")
public class PoliticsstatusServiceImpl implements PoliticsstatusService {
    @Autowired
    PoliticsstatusMapper politicsstatusMapper;
    public List<Politicsstatus> getAllPoliticsstatus() {
        return politicsstatusMapper.getAllPoliticsstatus();
    }
}
