package org.example.microhr.service;

import org.example.microhr.model.Hr;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;


public interface HrService {


    public UserDetails loadUserByUsername(String username);

    public List<Hr> getAllHrs(String keywords);

    public Integer updateHr(Hr hr);

    public boolean updateHrRole(Integer hrid, Integer[] rids);

    public Integer deleteHrById(Integer id);

    public List<Hr> getAllHrsExceptCurrentHr();

    public Integer updateHyById(Hr hr);

    public boolean updateHrPasswd(String oldpass, String pass, Integer hrid);

    public Integer updateUserface(String url, Integer id);
}
