package com.kowalik.dominik.dao;

import com.kowalik.dominik.model.Discipline;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by dominik on 2016-12-26.
 */

@Repository("disciplineDaoImpl")
public class DisciplineDaoImpl implements DaoInterface<Discipline> {
    @Override
    public String getClassName() {
        return Discipline.class.toString();
    }
}
