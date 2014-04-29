package org.renyan.rendb.data.impl;

import org.renyan.rendb.RenDB;
import org.renyan.rendb.data.MapData;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by weirenyan on 14-4-29.
 */
public class MapDataImpl implements MapData {

    public MapDataImpl(RenDB db) {

    }

    @Override
    public String get(String key) {


        return null;
    }

    @Override
    public int set(String key, String value) {
        return 0;
    }

    @Override
    public int del(String key) {
        return 0;
    }

    @Override
    public long incr(String key, long by) {
        return 0;
    }

    @Override
    public int multi_set(Map<String, String> values) {
        return 0;
    }

    @Override
    public int multi_del(Set<String> keys) {
        return 0;
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
