package cn.yingchuang.controller;

import com.alibaba.fastjson.JSON;
import com.cloopen.rest.sdk.CCPRestSmsSDK;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by Administrator on 2018/3/20 0020.
 */

    @Controller
    @RequestMapping("text")
    public class test {
        @RequestMapping("text1")
        public String text1(){
            return "text";
        }

        @ResponseBody
        @RequestMapping( value = "toText",method = RequestMethod.POST,
                produces = {"application/json;charset=utf-8"})
        public String  test(String phone,String code) {
            HashMap<String, Object> result = null;
            CCPRestSmsSDK restAPI = new CCPRestSmsSDK();
            restAPI.init("app.cloopen.com", "8883");
            // 初始化服务器地址和端口，生产环境配置成app.cloopen.com，端口是8883.
            restAPI.setAccount("8aaf0708623beece01624244046003a7", "34090b9d3d8c46f8b4e83eb346353924");
            // 初始化主账号名称和主账号令牌，登陆云通讯网站后，可在控制首页中看到开发者主账号ACCOUNT SID和主账号令牌AUTH TOKEN。
            restAPI.setAppId("8aaf0708623beece0162424404b803ad");
            // 请使用管理控制台中已创建应用的APPID。
            result = restAPI.sendTemplateSMS("phone","1" ,new String[]{"12345","1"});
            System.out.println("SDKTestGetSubAccounts result=" + result);
            if("000000".equals(result.get("statusCode"))){
                //正常返回输出data包体信息（map）
                HashMap<String,Object> data = (HashMap<String, Object>) result.get("data");
                Set<String> keySet = data.keySet();
                for(String key:keySet){
                    Object object = data.get(key);
                    System.out.println(key +" = "+object);
                }
                return JSON.toJSONString("发送成功");
            }else{
                //异常返回输出错误码和错误信息
                System.out.println("错误码=" + result.get("statusCode") +" 错误信息= "+result.get("statusMsg"));
                return JSON.toJSONString("发送失败");

            }
        }

    }

