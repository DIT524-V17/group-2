package com.group02.guard;

import java.util.HashMap;

/**
 * Created by jeberlen on 2017-04-03.
 */

public class SensorMap<K,V> extends HashMap<K,V> {

    protected V defaultValue;
    public SensorMap(V defaultValue) {
        this.defaultValue = defaultValue;
    }
    @Override
    public V get(Object k) {
        return containsKey(k) ? super.get(k) : defaultValue;
    }
}
