package com.kowalik.dominik.dao;

import com.kowalik.dominik.model.Address;


/**
 * Created by dominik on 2016-12-26.
 */
public class AddressDaoImpl implements DaoInterface<Address> {
    @Override
    public String getClassName() {
        return Address.class.getName();
    }
}
