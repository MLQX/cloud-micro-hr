package org.example.microhr.service;


import org.example.microhr.model.Nation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface NationService {

    public List<Nation> getAllNations();
}
