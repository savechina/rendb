package org.renyan.rendb.util;

/**
 * Created by weirenyan on 14-4-28.
 */
public enum DataType {
    SYNC_LOG('1', "同步日志"),
    KV('k', "Key/Value数据类型"),
    KV_SIZE('K', "Key/value数量"),
    HASH('h', "Hash数据类型"),
    HASH_SIZE('H', "Hash数据数量"),
    QUEUE('q', "列表类型"),
    QUEUE_SIZE('Q', "列表长度"),
    ZSET('S', "Zip Sorted Set"),
    ZSCORE('z', "zset score"),
    ZSIZE('Z', "zset size");

    private char type;
    private String desc;

    private DataType(char type, String desc) {
        this.type = type;
        this.desc = desc;
    }


    public char getType() {
        return type;
    }

    public String getDesc() {
        return desc;
    }

    public char getMinPrefix() {
        return HASH.getType();
    }

    public char getMaxPrefix() {
        return ZSET.getType();
    }
}
