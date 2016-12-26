package com.kowalik.dominik.dao;

import com.kowalik.dominik.model.Address;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;


/**
 * Created by dominik on 2016-12-26.
 */

@Repository("addressDaoImp")
public class AddressDaoImpl implements DaoInterface<Address> {
    @Override
    public String getClassName() {
        return Address.class.getName();
    }
}
