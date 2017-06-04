package com.mvn_ssm.api.dao;

import com.mvn_ssm.api.bean.DealerDO;
import org.apache.ibatis.annotations.Param;

public interface DealerDOMapper {
    DealerDO getDealerByUsername(@Param("username") String username);
    /*List<DealerDO> isExist(Map<String, String> userMap);
    void insertDealer(DealerDO dealerInfo);*/
}