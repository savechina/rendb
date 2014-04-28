package org.renyan.rendb;

/**
 * Created by weirenyan on 14-4-28.
 */
public interface Hash {
    byte[] hget(byte[] name, byte[] key);

//    hset_one

//    static int hset_one(DbImpl *ssdb, const Bytes &name, const Bytes &key, const Bytes &val);
//    static int hdel_one(DbImpl *ssdb, const Bytes &name, const Bytes &key);
//    static int incr_hsize(DbImpl *ssdb, const Bytes &name, int64_t incr);
}
