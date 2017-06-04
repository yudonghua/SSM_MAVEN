package com.mvn_ssm.api.service;

import java.util.List;
import java.util.Map;

/**
 * Created by Dell on 2017/6/4.
 */
public interface IndexService {
    List<Map> getItems();
    Map getItem(Long id);
}
