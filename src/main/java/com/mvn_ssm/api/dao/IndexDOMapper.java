package com.mvn_ssm.api.dao;

import java.util.List;
import java.util.Map;

/**
 * Created by Dell on 2017/6/4.
 */
public interface IndexDOMapper {
    List<Map> getItems();
    Map getItem(Long id);
    Map getMap(Map map);
}
