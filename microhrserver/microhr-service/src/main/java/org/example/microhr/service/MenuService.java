package org.example.microhr.service;


import org.example.microhr.model.Menu;

import java.util.List;


public interface MenuService {

    public List<Menu> getMenusByHrId() ;

    public List<Menu> getAllMenusWithRole();

    public List<Menu> getAllMenus();

    public List<Integer> getMidsByRid(Integer rid);

    public boolean updateMenuRole(Integer rid, Integer[] mids) ;
}
