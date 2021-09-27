package cn.binarywang.wx.miniapp.api;

import cn.binarywang.wx.miniapp.bean.express.local.WxMaExpressImmediateDelivery;
import cn.binarywang.wx.miniapp.bean.express.local.request.WxMaExpressAbnormalConfirmRequest;
import cn.binarywang.wx.miniapp.bean.express.local.request.WxMaExpressLocalAddOrderRequest;
import cn.binarywang.wx.miniapp.bean.express.local.request.WxMaExpressLocalCancelOrderRequest;
import cn.binarywang.wx.miniapp.bean.express.local.request.WxMaExpressLocalOrderMockUpdateRequest;
import cn.binarywang.wx.miniapp.bean.express.local.result.WxMaExpressLocalBaseResult;
import cn.binarywang.wx.miniapp.bean.express.local.result.WxMaExpressLocalCancelOrderResult;
import cn.binarywang.wx.miniapp.bean.express.local.result.WxMaExpressLocalAddOrderResult;
import cn.binarywang.wx.miniapp.bean.express.local.result.WxMaExpressLocalPreAddOrderResult;
import me.chanjar.weixin.common.error.WxErrorException;

import java.util.List;

/**
 * @author <a href="https://github.com/aieyes">aieyes</a>
 * @since 2021-09-24
 */
public interface WxMaExpressLocalService {

  /**
   * 初始化
   */
  void init(String appKey, String appSecret);

  /**
   * 获取已支持的配送公司列表接口
   * <a href="https://developers.weixin.qq.com/miniprogram/dev/api-backend/open-api/immediate-delivery/by-business/immediateDelivery.getAllImmeDelivery.html">查看文档</a>
   *
   * @return 配送公司列表
   * @throws WxErrorException 获取失败时返回
   */
  List<WxMaExpressImmediateDelivery> getAllImmeDelivery() throws WxErrorException;

  WxMaExpressLocalBaseResult abnormalConfirm(WxMaExpressAbnormalConfirmRequest o) throws WxErrorException;

  WxMaExpressLocalAddOrderResult addOrder(WxMaExpressLocalAddOrderRequest o) throws WxErrorException;

  WxMaExpressLocalPreAddOrderResult preAddOrder(WxMaExpressLocalAddOrderRequest o) throws WxErrorException;

  WxMaExpressLocalCancelOrderResult cancelOrder(WxMaExpressLocalCancelOrderRequest o) throws WxErrorException;

  WxMaExpressLocalBaseResult mockUpdateOrder(WxMaExpressLocalOrderMockUpdateRequest o) throws WxErrorException;

  WxMaExpressLocalBaseResult realMockUpdateOrder(WxMaExpressLocalOrderMockUpdateRequest o) throws WxErrorException;
}
