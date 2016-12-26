package com.kowalik.dominik.dao;

import com.kowalik.dominik.model.Voivodeship;

/**
 * Created by dominik on 2016-12-26.
 */
public class VoivodeshipDaoImpl implements DaoInterface<Voivodeship>{
    @Override
    public String getClassName() {
        return Voivodeship.class.getName();
    }
}
