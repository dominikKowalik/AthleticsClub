package com.kowalik.dominik.dao;

import com.kowalik.dominik.model.Achievement;
import org.springframework.stereotype.Repository;

/**
 * Created by dominik on 2016-12-26.
 */

@Repository("achievementDaoImpl")
public class AchievementDaoImpl implements DaoInterface<Achievement> {
    @Override
    public String getClassName() {
        return Achievement.class.getName();
    }
}
