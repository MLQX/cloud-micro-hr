package org.example.microhr.service;


import org.example.microhr.model.MailSendLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

public interface MailSendLogService {

    public Integer updateMailSendLogStatus(String msgId, Integer status);

    public Integer insert(MailSendLog mailSendLog) ;

    public List<MailSendLog> getMailSendLogsByStatus();

    public Integer updateCount(String msgId, Date date);
}
