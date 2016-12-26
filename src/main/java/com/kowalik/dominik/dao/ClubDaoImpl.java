package com.kowalik.dominik.dao;

import com.kowalik.dominik.model.Club;
import org.springframework.stereotype.Repository;

/**
 * Created by dominik on 2016-12-22.
 */

@Repository("clubDaoImpl")
public class ClubDaoImpl implements DaoInterface<Club> {
    @Override
    public String getClassName() {
        return Club.class.getName();
    }
}
