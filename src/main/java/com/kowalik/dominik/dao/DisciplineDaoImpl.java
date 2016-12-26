package com.kowalik.dominik.dao;

import com.kowalik.dominik.model.Discipline;

/**
 * Created by dominik on 2016-12-26.
 */
public class DisciplineDaoImpl implements DaoInterface<Discipline> {
    @Override
    public String getClassName() {
        return Discipline.class.toString();
    }
}
