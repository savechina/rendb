package org.renyan.rendb.data;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * key value data use map value pair
 * Created by weirenyan on 14-4-29.
 */
public interface MapData extends Iterable {

    String get(String key);

    int set(String key, String value);

    int del(String key);

    long incr(String key, long by);

    int multi_set(Map<String, String> values);

    int multi_del(Set<String> keys);


    //    /* key value */
//
//    virtual int set(const Bytes &key, const Bytes &val) = 0;
//    virtual int del(const Bytes &key) = 0;
//    virtual int incr(const Bytes &key, int64_t by, std::string *new_val) = 0;
//    virtual int multi_set(const std::vector<Bytes> &kvs, int offset=0) = 0;
//    virtual int multi_del(const std::vector<Bytes> &keys, int offset=0) = 0;
//
//    virtual int get(const Bytes &key, std::string *val) = 0;
//    // return (start, end]
//    virtual KIterator* scan(const Bytes &start, const Bytes &end, uint64_t limit) = 0;
//    virtual KIterator* rscan(const Bytes &start, const Bytes &end, uint64_t limit) = 0;


    //	/* key value */
//
//    virtual int set(const Bytes &key, const Bytes &val);
//    virtual int del(const Bytes &key);
//    virtual int incr(const Bytes &key, int64_t by, std::string *new_val);
//    virtual int multi_set(const std::vector<Bytes> &kvs, int offset=0);
//    virtual int multi_del(const std::vector<Bytes> &keys, int offset=0);
//
//    virtual int get(const Bytes &key, std::string *val);
//    // return (start, end]
//    virtual KIterator* scan(const Bytes &start, const Bytes &end, uint64_t limit);
//    virtual KIterator* rscan(const Bytes &start, const Bytes &end, uint64_t limit);
}
