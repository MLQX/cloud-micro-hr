package org.example.microhr.service;

import org.example.microhr.model.Politicsstatus;
import org.example.microhr.model.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

public interface PoliticsstatusService {

    List<Politicsstatus> getAllPoliticsstatus();
}
