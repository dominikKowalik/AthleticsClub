package com.kowalik.dominik.dao;

import com.kowalik.dominik.model.Position;

/**
 * Created by dominik on 2016-12-26.
 */
public class PositionDaoImpl implements DaoInterface<Position> {
    @Override
    public String getClassName() {
        return Position.class.getName();
    }
}
