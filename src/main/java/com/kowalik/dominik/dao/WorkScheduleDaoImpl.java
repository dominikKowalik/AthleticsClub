package com.kowalik.dominik.dao;

import com.kowalik.dominik.model.WorkSchedule;
import org.springframework.stereotype.Repository;

/**
 * Created by dominik on 2016-12-26.
 */

@Repository("workScheduleDaoImpl ")
public class WorkScheduleDaoImpl implements DaoInterface<WorkSchedule> {
    @Override
    public String getClassName() {
        return WorkSchedule.class.getName();
    }
}
