package com.kowalik.dominik.dao;

import com.kowalik.dominik.model.Voivodeship;
import org.springframework.stereotype.Repository;

/**
 * Created by dominik on 2016-12-26.
 */

@Repository("voivodeshipDaoImpl")
public class VoivodeshipDaoImpl implements DaoInterface<Voivodeship>{
    @Override
    public String getClassName() {
        return Voivodeship.class.getName();
    }
}
