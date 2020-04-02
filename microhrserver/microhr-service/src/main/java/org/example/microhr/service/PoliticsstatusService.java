package org.example.microhr.service;

import org.example.microhr.model.Politicsstatus;
import org.example.microhr.model.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

public interface PoliticsstatusService {

    public List<Position> getAllPositions();

    public Integer addPosition(Position position) ;

    public Integer updatePositions(Position position);

    public Integer deletePositionById(Integer id);

    public Integer deletePositionsByIds(Integer[] ids);
}
