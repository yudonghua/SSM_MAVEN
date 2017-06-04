package com.mvn_ssm.api.service.impl;

import com.mvn_ssm.api.bean.DealerDO;
import com.mvn_ssm.api.dao.DealerDOMapper;
import com.mvn_ssm.api.service.DealerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 商户服务类，实现接口DealerService中的内容
 *
 * @author CongQianhao
 * @since 2017/5/28
 */
@Service
public class DealerServiceImpl implements DealerService {

    @Autowired
    private DealerDOMapper dealerDOMapper;

    @Override
    public boolean login(String username, String password) {
        DealerDO dealerDO = dealerDOMapper.getDealerByUsername(username);
        if (dealerDO != null && dealerDO.getDealerPassword().equals(password)) {
            return true;
        }
        return false;
    }

    @Override
    public String getPassword(String username) {
        return dealerDOMapper.getDealerByUsername(username).getDealerPassword();
    }
}
