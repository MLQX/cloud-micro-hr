package org.example.microhr.service;


import org.example.microhr.model.JobLevel;

import java.util.List;



public interface JobLevelService {


    public List<JobLevel> getAllJobLevels();

    public Integer addJobLevel(JobLevel jobLevel) ;

    public Integer updateJobLevelById(JobLevel jobLevel) ;

    public Integer deleteJobLevelById(Integer id) ;

    public Integer deleteJobLevelsByIds(Integer[] ids);
}
