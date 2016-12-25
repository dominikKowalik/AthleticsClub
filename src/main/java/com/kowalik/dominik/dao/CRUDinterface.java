package com.kowalik.dominik.dao;

import java.util.List;

/**
 * Created by dominik on 2016-12-24.
 */

/**
 * interface that force implementation methods included in classes from dao package
 * @param <t>
 */
public interface CRUDinterface <t>{
    public void save(t p);
    public List<t> list();
}
