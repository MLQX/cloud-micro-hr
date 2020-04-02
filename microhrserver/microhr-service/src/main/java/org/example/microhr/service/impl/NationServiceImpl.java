package org.example.microhr.service.impl;

import org.example.microhr.mapper.NationMapper;
import org.example.microhr.model.Nation;
import org.example.microhr.service.NationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("nationService")
public class NationServiceImpl implements NationService {
    @Autowired
    NationMapper nationMapper;
    public List<Nation> getAllNations() {
        return nationMapper.getAllNations();
    }
}
