package cn.binarywang.wx.miniapp.api.impl;

import cn.binarywang.wx.miniapp.api.WxMaExpressLocalService;
import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.bean.express.local.WxMaExpressImmediateDelivery;
import cn.binarywang.wx.miniapp.bean.express.local.request.WxMaExpressAbnormalConfirmRequest;
import cn.binarywang.wx.miniapp.bean.express.local.request.WxMaExpressLocalAddOrderRequest;
import cn.binarywang.wx.miniapp.bean.express.local.request.WxMaExpressLocalCancelOrderRequest;
import cn.binarywang.wx.miniapp.bean.express.local.request.WxMaExpressLocalOrderMockUpdateRequest;
import cn.binarywang.wx.miniapp.bean.express.local.result.WxMaExpressLocalBaseResult;
import cn.binarywang.wx.miniapp.bean.express.local.result.WxMaExpressLocalCancelOrderResult;
import cn.binarywang.wx.miniapp.bean.express.local.result.WxMaExpressLocalAddOrderResult;
import cn.binarywang.wx.miniapp.bean.express.local.result.WxMaExpressLocalPreAddOrderResult;
import com.google.common.base.Strings;
import com.google.gson.JsonObject;
import lombok.RequiredArgsConstructor;
import me.chanjar.weixin.common.error.WxErrorException;
import me.chanjar.weixin.common.util.crypto.SHA1;

import java.util.List;

import static cn.binarywang.wx.miniapp.constant.WxMaApiUrlConstants.ExpressLocal.*;

/**
 * @author <a href="https://github.com/aieyes">aieyes</a>
 * @since 2021-09-24
 */
@RequiredArgsConstructor
public class WxMaExpressLocalServiceImpl implements WxMaExpressLocalService {
  private final WxMaService service;

  /**
   * 第三方的appKey(实际上就是shopId)
   */
  private String appKey;

  /**
   * 第三方的appSecret
   */
  private String appSecret;

  public String getAppKey() {
    return appKey;
  }

  public void setAppKey(String appKey) {
    this.appKey = appKey;
  }

  public String getAppSecret() {
    return appSecret;
  }

  public void setAppSecret(String appSecret) {
    this.appSecret = appSecret;
  }

  @Override
  public void init(String appKey, String appSecret) {
    this.appKey = appKey;
    this.appSecret = appSecret;
  }

  private String buildDeliverySign(String shopOrderId) {
    if (Strings.isNullOrEmpty(shopOrderId)) {
      return SHA1.gen(appKey, appSecret);
    }
    return SHA1.gen(appKey, shopOrderId, appSecret);
  }

  @Override
  public List<WxMaExpressImmediateDelivery> getAllImmeDelivery() throws WxErrorException {
    String responseContent = this.service.post(GET_ALL_DELIVERY_URL, new JsonObject());
    return WxMaExpressImmediateDelivery.fromJson(responseContent);
  }

  @Override
  public WxMaExpressLocalBaseResult abnormalConfirm(WxMaExpressAbnormalConfirmRequest o) throws WxErrorException {
    o.setShopId(appKey);
    o.setDeliverySign(buildDeliverySign(o.getShopOrderId()));
    String responseContent = this.service.post(ABNORMAL_CONFIRM_URL, new JsonObject());
    return WxMaExpressLocalBaseResult.fromJson(responseContent);
  }

  @Override
  public WxMaExpressLocalAddOrderResult addOrder(WxMaExpressLocalAddOrderRequest o) throws WxErrorException {
    o.setShopId(appKey);
    o.setDeliverySign(buildDeliverySign(o.getShopOrderId()));
    String responseContent = this.service.post(ADD_ORDER_URL, o.toJson());
    return WxMaExpressLocalAddOrderResult.fromJson(responseContent);
  }

  @Override
  public WxMaExpressLocalPreAddOrderResult preAddOrder(WxMaExpressLocalAddOrderRequest o) throws WxErrorException {
    o.setShopId(appKey);
    o.setDeliverySign(buildDeliverySign(o.getShopOrderId()));
    String responseContent = this.service.post(PRE_ADD_ORDER_URL, o.toJson());
    return WxMaExpressLocalPreAddOrderResult.fromJson(responseContent);
  }

  @Override
  public WxMaExpressLocalCancelOrderResult cancelOrder(WxMaExpressLocalCancelOrderRequest o) throws WxErrorException {
    o.setShopId(appKey);
    o.setDeliverySign(buildDeliverySign(o.getShopOrderId()));
    String responseContent = this.service.post(ORDER_CANCEL_URL, o.toJson());
    return WxMaExpressLocalCancelOrderResult.fromJson(responseContent);
  }

  @Override
  public WxMaExpressLocalBaseResult mockUpdateOrder(WxMaExpressLocalOrderMockUpdateRequest o) throws WxErrorException {
    o.setShopId(appKey);
    o.setDeliverySign(buildDeliverySign(o.getShopOrderId()));
    String responseContent = this.service.post(MOCK_UPDATE_ORDER, o.toJson());
    return WxMaExpressLocalBaseResult.fromJson(responseContent);
  }

  @Override
  public WxMaExpressLocalBaseResult realMockUpdateOrder(WxMaExpressLocalOrderMockUpdateRequest o) throws WxErrorException {
    o.setShopId(appKey);
    o.setDeliverySign(buildDeliverySign(o.getShopOrderId()));
    String responseContent = this.service.post(REAL_MOCK_UPDATE_ORDER_URL, o.toJson());
    return WxMaExpressLocalBaseResult.fromJson(responseContent);
  }

}
