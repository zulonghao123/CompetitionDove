package cn.yingchuang.command.config;

/**
 * Created by Administrator on 2018/3/22 0022.
 */
public class AlipayConfig {
    // 商户appid
    public static String APPID = "2016091100489443";
    // 私钥 pkcs8格式的
    public static String RSA_PRIVATE_KEY = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCFEZd9mZEzlgqs2TjxgECwiJGqN2/bzeqtpz8JofCpqMyTc8AuOjVKLHRP4DvyvONhqUHYFR9RxMs70TVCg6jBLdKjnCQ/PtwK8w2iPHz/gwC6dUxrDoWUvCCsTEouzLrI+v1U62LLD/VfiomCUoAaleLxKSMti8vtMGWWAGs8wbkPSMlXtrronQkypJOON1un3Y0/LCzMjiGciuVqUukrOsWm3JGL4RoibiZPFo49Gz4SHNJEduzxZl8sZAwwcaPieXN9W9K3GUjf19pvlpkYtaIpQqi5UETISiqiybtGUkrJR+II4wi74gjNY8wE3dV+tNbN40OCUOF+usS7IG7JAgMBAAECggEAR0W63D0KdpTgtt/KDh/hhiw/yOnUceiCz+wKaYBhRJ3ypO+Uea4XqNjSm43Aziy5pS9g4vm9QrCjIjDV1ABsvLtsXNFe4LksZnj0TncThE+IblYxTg4DIjz5Sw+5lAN37/nvAjLpQVYU2M19BV5m2tZ5LS4Zd2WvHiWT45np1iot33mzoxbDEtLn6JbQmbxUbIS3L9nnOHpZ8I5VvrCr8cSLmtR1oh3dVnhm8Vd9FVYxwfRGf3PT9wpPzvPNuEKRMhzdkiicX716ipMbRiv6Dc1bSgXtYRypILKm0/wBeiBAEkAwS1pePz4x7SBE04woACdIZn6EMOAmVJBTn+SjWQKBgQDL7wiygWQhooa3hglZhea6hBcyzJHekoqQxDOcCrSF+Jkq9pTytrl7OxZZ1oyApcyGgUWhbQCCvBif/C3Qc2SlPW0/UmSjDSsHuTOLOdmF8fSJbb0ThOQLfaBe9xdz7aX7Vkm7jgEvJ56GBgjlksAbrW6u7/P4LiPkZ1Oaa84QtwKBgQCnCt7Kw95NiAfq0SdcZKrI5SnCbXXkFL/pn7OG1OqyeEaxoxQzgRHcvwOvZxdYXiZkqFLryw/hDJPP5Q19VOAAK9oD9BOu9+iqfbkjsLvVVlacQnLYFsEgpVivmjsV1x8lHeVSI7JNYXjJA/zobkmTKYKnmUV+LiW7BqOJHh78fwKBgByRnvlK0Rk5KIA7QcIN1RXZ/Vn7eI/inZDMO6KniUSfX+2534HlATT3QRlSyhoXoABTycpkd8bYzOZUsKJcGARiB5TwWPLSnG2Xj1X4w7VVAPnjqrI6UqwdbEMBgIKYD0GXg/rHWPkfJsEFxWdL2KfH8xKEwPvKkvKjWv3uDk8fAoGAOhph3I286aMDff46frzVWwO7PtHsS+Wby5utSp0M9f84N9nN0Qx4NhyLH5vwVuCI4kJadYIwh8tkLtAxnQLE18ppDy77GcVJvOP2Xh+/djmN7tR+NgPUMZLSAmLXYoVtY+++MJASGTBqXyFv+zlBhlrOA5Ygwf8zSJbKk4tSo+kCgYB3Mvaf7pGMjntPK27Ui9798nkfMdJTwH7Sz32WMPh+axyc5ouzV7DacNybUw6J84nElS5Aca9lGSnoqiXsSALB/aIjxYJil1npCHYqVcPFjfv1XQdUzSbSnRHwVGu59h237qVMpUKCpZFYV8N0ct7XGlJ89NE0Dz9GvTBj2ReoFw==";
    // 服务器异步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://chenqiang.vicp.io:24493/alipay/notifyUrl";
    // 页面跳转同步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问 商户可以自定义同步跳转地址
    public static String return_url ="http://chenqiang.vicp.io:24493/alipay/returnUrl";
    // 请求网关地址
    public static String URL = "https://openapi.alipaydev.com/gateway.do";
    // 编码
    public static String CHARSET = "gbk";
    // 返回格式
    public static String FORMAT = "json";
    // 支付宝公钥
    public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAhRGXfZmRM5YKrNk48YBAsIiRqjdv283qrac/CaHwqajMk3PALjo1Six0T+A78rzjYalB2BUfUcTLO9E1QoOowS3So5wkPz7cCvMNojx8/4MAunVMaw6FlLwgrExKLsy6yPr9VOtiyw/1X4qJglKAGpXi8SkjLYvL7TBllgBrPMG5D0jJV7a66J0JMqSTjjdbp92NPywszI4hnIrlalLpKzrFptyRi+EaIm4mTxaOPRs+EhzSRHbs8WZfLGQMMHGj4nlzfVvStxlI39fab5aZGLWiKUKouVBEyEoqosm7RlJKyUfiCOMIu+IIzWPMBN3VfrTWzeNDglDhfrrEuyBuyQIDAQAB";
    // 日志记录目录
    public static String log_path = "/log";
    // RSA2
    public static String SIGNTYPE = "RSA2";

}
