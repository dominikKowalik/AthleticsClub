package com.kowalik.dominik.dao;

import com.kowalik.dominik.model.Account;
import org.springframework.stereotype.Repository;

/**
 * Created by dominik on 2016-12-26.
 */

@Repository("clubDaoImpl")
public class AccountDaoImpl implements DaoInterface<Account> {
    @Override
    public String getClassName() {
        return this.getClass().getName();
    }
}
