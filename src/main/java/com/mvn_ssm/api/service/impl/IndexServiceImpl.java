package com.mvn_ssm.api.service.impl;

import com.mvn_ssm.api.dao.IndexDOMapper;
import com.mvn_ssm.api.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 商户服务类，实现接口DealerService中的内容
 *
 * @author CongQianhao
 * @since 2017/5/28
 */
@Service
public class IndexServiceImpl implements IndexService {

    @Autowired
    private IndexDOMapper indexDOMapper;

    @Override
    public List<Map> getItems() {
        return indexDOMapper.getItems();
    }

    @Override
    public Map getItem(Long id) {
        return indexDOMapper.getItem(id);
    }
}
