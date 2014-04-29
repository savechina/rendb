package org.renyan.rendb.data;

/**
 * Created by weirenyan on 14-4-28.
 */
public interface HashData {
    byte[] hget(byte[] name, byte[] key);

//    hset_one

//    static int hset_one(DbImpl *ssdb, const Bytes &name, const Bytes &key, const Bytes &val);
//    static int hdel_one(DbImpl *ssdb, const Bytes &name, const Bytes &key);
//    static int incr_hsize(DbImpl *ssdb, const Bytes &name, int64_t incr);

    //	/* hash */
//
//    virtual int hset(const Bytes &name, const Bytes &key, const Bytes &val) = 0;
//    virtual int hdel(const Bytes &name, const Bytes &key) = 0;
//    virtual int hincr(const Bytes &name, const Bytes &key, int64_t by, std::string *new_val) = 0;
//    //int multi_hset(const Bytes &name, const std::vector<Bytes> &kvs, int offset=0) = 0;
//    //int multi_hdel(const Bytes &name, const std::vector<Bytes> &keys, int offset=0) = 0;
//
//    virtual int64_t hsize(const Bytes &name) = 0;
//    virtual int hget(const Bytes &name, const Bytes &key, std::string *val) = 0;
//    virtual int hlist(const Bytes &name_s, const Bytes &name_e, uint64_t limit,
//                      std::vector<std::string> *list) = 0;
//    virtual HIterator* hscan(const Bytes &name, const Bytes &start, const Bytes &end, uint64_t limit) = 0;
//    virtual HIterator* hrscan(const Bytes &name, const Bytes &start, const Bytes &end, uint64_t limit) = 0;

}
