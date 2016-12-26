package com.kowalik.dominik.dao;

import com.kowalik.dominik.model.TrainingSchedule;
import org.springframework.stereotype.Repository;

/**
 * Created by dominik on 2016-12-26.
 */

@Repository("trainingScheduleDaoImpl")
public class TrainingScheduleDaoImpl implements DaoInterface<TrainingSchedule> {
    @Override
    public String getClassName() {
        return TrainingSchedule.class.getName();
    }
}
