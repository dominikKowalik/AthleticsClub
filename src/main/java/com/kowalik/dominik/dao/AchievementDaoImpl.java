package com.kowalik.dominik.dao;

import com.kowalik.dominik.model.Achievement;

/**
 * Created by dominik on 2016-12-26.
 */
public class AchievementDaoImpl implements DaoInterface<Achievement> {
    @Override
    public String getClassName() {
        return Achievement.class.getName();
    }
}
