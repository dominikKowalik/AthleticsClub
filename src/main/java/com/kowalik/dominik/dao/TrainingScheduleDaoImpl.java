package com.kowalik.dominik.dao;

import com.kowalik.dominik.model.TrainingSchedule;

/**
 * Created by dominik on 2016-12-26.
 */
public class TrainingScheduleDaoImpl implements DaoInterface<TrainingSchedule> {
    @Override
    public String getClassName() {
        return TrainingSchedule.class.getName();
    }
}
