package consts;

/**
 * Created by duhongxing on 2018/8/31.
 */

public class RequestConst {
    public static final String httpHost = "http://192.168.1.25:8100";
    //注册post
    public static final String registeUrl = "/qingyi/account/register";
    //登录post
//    header：
//
//    Authorization：Basic cWluZ3lpc2U6Z1gxZkJhdDNiVg==
//
//    body：username／password／grant_type=password／captcha
    public static final String loginRequest ="/qingyi/account/login";
    //图形验证码 get
    public static final String imgloadUrl = httpHost +"/qingyi/account/recaptcha/captcha.jpg";
    //商品列表get /qingyi/goods/list/:curPage/:limit
    public static final String goodsListUrl = "/qingyi/goods/list/";
    //地址列表get /qingyi/goods/list/by/area/:area/:curPage/:limit
    public static final String areaListUrl = "/qingyi/goods/list/by/area/";
    //获取商品详情get qingyi/goods/list/item/details/:id
    public static final String cityListUrl = "qingyi/goods/list/item/details";
    //    省份／市／区域 get
    ///qingyi/area/provinces
    public static final String areasUrl = "/qingyi/area/provinces";
    //忘记密码 post  body : {account:account}
    public static final String forgotPassUrl = "qingyi/account/fogetpass";
    //根据城市获取区域 get 如：石家庄 返回：桥西区／桥东区 等
    //qingyi/get/citys/by/city/:city
    public static final String cityAreaUrl = "qingyi/get/citys/by/city/";
}
