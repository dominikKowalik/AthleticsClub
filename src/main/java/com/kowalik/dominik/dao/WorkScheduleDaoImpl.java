package com.kowalik.dominik.dao;

import com.kowalik.dominik.model.WorkSchedule;

/**
 * Created by dominik on 2016-12-26.
 */
public class WorkScheduleDaoImpl implements DaoInterface<WorkSchedule> {
    @Override
    public String getClassName() {
        return WorkSchedule.class.getName();
    }
}
