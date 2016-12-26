package com.kowalik.dominik.dao;

import com.kowalik.dominik.model.Building;
import org.springframework.stereotype.Repository;

/**
 * Created by dominik on 2016-12-26.
 */

@Repository("buildingDaoImpl")
public class BuildingDaoImpl implements DaoInterface<Building> {
    @Override
    public String getClassName() {
        return Building.class.getName();
    }
}
