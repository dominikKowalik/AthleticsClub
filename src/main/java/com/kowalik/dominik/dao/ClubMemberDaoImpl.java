package com.kowalik.dominik.dao;

import com.kowalik.dominik.model.ClubMember;

/**
 * Created by dominik on 2016-12-26.
 */
public class ClubMemberDaoImpl implements DaoInterface<ClubMember> {
    @Override
    public String getClassName() {
        return ClubMember.class.getName();
    }
}
