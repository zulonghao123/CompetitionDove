package cn.yingchuang.command.config;

/**
 * Created by Administrator on 2018/3/22 0022.
 */
public class AlipayConfig {
    // 商户appid
    public static String APPID = "2016091000480101";
    // 私钥 pkcs8格式的
    public static String RSA_PRIVATE_KEY = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCKqIAxJhcgq2Vrt6s54v9IyytDzD2RBg7drWOq/eTr+dEaRglPAyOt/fz+DeJQNLyOqbY8B503QqHcImJcGl7UNiSGBeqN7w4UdHjuETiDVHkdFSgJHkxJnodUEmfXFJmngjllxPijGzmXwhlZg7Q5bmEoX/MHs/Ftjx6rg7tNHoDuhzhj/yzyhXwN5ZfVFQb06fPlSOfYt0K+zLLB88tAyZ6N6YntE5A04aq5I5dzFMYmlR6hYwVAxqtu5wn1vGssineRcqqndOlMMnhcrBip/S8x4pnoOph9AX5QXZCljEM3O141FrJn3I7Vs1c/zOC59VrVwiEtMNaf+iKwCTwzAgMBAAECggEAR3cFa0+IiAwO3+/wTouSrAAbMnxoFwEaVGLzhcQKYx2FCpeiYJjroNfRt1eMl2426QjLpjD+dObg6cbHD1WAHrwxIuqVs8XMafqGAZ3alMXLDpRC6EA3bZJJiala3938O/vAfZWB2P9FNdSSoDJjh14+sUKSzhuOibtEQX5J4TrdleIA/pgeScqwg7K02PyA96KeM8hiakI3zks2rwhw/ImUf88BxTv+L4DcuEJAsYFsRPPbrNv9kP8a9qPvT/xjlh2Iu3Pe8hdBXaxFkFTwAnwrXZHKVFanlbTdjpQvmrVgne4APcNKwNeYVjX4RaWyj9zI76DBVNXrAV9jsKBOUQKBgQDXvEpbaGcnrrE81kVM7hv04jL9Tmk+MjGRbkMzRyXjuQ8OVZ5d8udy8dMVqcOIZMs+ImPGtCyHTdLcLvKX//1qZHaP3rN9YBaUmCV+DoNjlWhHOLYHbnjJXdtUIoAMEPfM945agRJJhV1mIwGgPrzLejk0qa2CbK2PGIFGbG7A/wKBgQCkiYEY0jwkebzqscnpaN1wM7OCLKiXyisnlkU4SButzUiZZR51oIvLcajEAqpmjGYyR/J20/KFbfPqfYTedcVnI2j+mBwm2iew7nTYQZ6lxoCkLKvp394f2W9aKGUxpTNZ3QoVAAG87weR+GrwgCVgzHrjhS4vHjGUgX839/dQzQKBgQDQ30Cu15poVT7MxDg8j50Jr6fmkHBdA4PyZmsxzoTkwlvNaR/3niJwq6nPo5npCI2vDuTDkdY6+iJZhCrk97iHtdUE3n2xucKjA9vo/GxBknpv2nyDHXZcoD6mavDGvfbtwBFXlvf5ruIK7YG5gISSDTgtwMp5KHexv+wKHxnsSQKBgHxpBFZSUOt7qV8Eg5mbkyRN04OwZOIxGaRbOYeu7k7ik+x4yylB9bIlBOkA4vubWYLXZ/x1kkFVvEMoGZlkD5lG6xLmzRKLjct44pzKMT1D9O0uYeb7QSdv74SKWsnJEiT2v7LVSHsleeHjpminXJvuwVTb1OoHuJGDwT/+nOBZAoGAG+g5PUueMdUHx3Xfpj7YaaTphHvN2ap6h3sTpM9hanuaDz21LsCody3FbkE94/sHKl6mFOfvy44QucGzUBbLpc+ek+ZZmivTEISG4RIUVeVLjnIn0wgRD2G3uMoQop60Frfp4RD4EDK47oDbejeefM8/LFu1onUknusWPbqINw8=";
    // 服务器异步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://chenqiang.vicp.io:24493/alipay/notifyUrl";
    // 页面跳转同步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问 商户可以自定义同步跳转地址
    public static String return_url ="http://chenqiang.vicp.io:24493/main/queryAllMain";
    // 请求网关地址
    public static String URL = "https://openapi.alipaydev.com/gateway.do";
    // 编码
    public static String CHARSET = "gbk";
    // 返回格式
    public static String FORMAT = "json";
    // 支付宝公钥
    public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAiqiAMSYXIKtla7erOeL/SMsrQ8w9kQYO3a1jqv3k6/nRGkYJTwMjrf38/g3iUDS8jqm2PAedN0Kh3CJiXBpe1DYkhgXqje8OFHR47hE4g1R5HRUoCR5MSZ6HVBJn1xSZp4I5ZcT4oxs5l8IZWYO0OW5hKF/zB7PxbY8eq4O7TR6A7oc4Y/8s8oV8DeWX1RUG9Onz5Ujn2LdCvsyywfPLQMmejemJ7ROQNOGquSOXcxTGJpUeoWMFQMarbucJ9bxrLIp3kXKqp3TpTDJ4XKwYqf0vMeKZ6DqYfQF+UF2QpYxDNzteNRayZ9yO1bNXP8zgufVa1cIhLTDWn/oisAk8MwIDAQAB";
    // 日志记录目录
    public static String log_path = "/log";
    // RSA2
    public static String SIGNTYPE = "RSA2";

}
