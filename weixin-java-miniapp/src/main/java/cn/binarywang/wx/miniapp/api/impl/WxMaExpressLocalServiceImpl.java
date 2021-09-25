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
import lombok.RequiredArgsConstructor;
import me.chanjar.weixin.common.error.WxErrorException;

import java.util.List;

import static cn.binarywang.wx.miniapp.constant.WxMaApiUrlConstants.ExpressLocal.*;

/**
 * @author <a href="https://github.com/aieyes">aieyes</a>
 * @since 2021-09-24
 */
@RequiredArgsConstructor
public class WxMaExpressLocalServiceImpl implements WxMaExpressLocalService {
  private final WxMaService service;

  @Override
  public List<WxMaExpressImmediateDelivery> getAllImmeDelivery() throws WxErrorException {
    String responseContent = this.service.post(GET_ALL_DELIVERY_URL, "{}");
    return WxMaExpressImmediateDelivery.fromJson(responseContent);
  }

  @Override
  public WxMaExpressLocalBaseResult abnormalConfirm(WxMaExpressAbnormalConfirmRequest o) throws WxErrorException {
    String responseContent = this.service.post(ABNORMAL_CONFIRM_URL, "{}");
    return WxMaExpressLocalBaseResult.fromJson(responseContent);
  }

  @Override
  public WxMaExpressLocalAddOrderResult addOrder(WxMaExpressLocalAddOrderRequest o) throws WxErrorException {
    String responseContent = this.service.post(ADD_ORDER_URL, o.toJson());
    return WxMaExpressLocalAddOrderResult.fromJson(responseContent);
  }

  @Override
  public WxMaExpressLocalPreAddOrderResult preAddOrder(WxMaExpressLocalAddOrderRequest o) throws WxErrorException {
    String responseContent = this.service.post(PRE_ADD_ORDER_URL, o.toJson());
    return WxMaExpressLocalPreAddOrderResult.fromJson(responseContent);
  }

  @Override
  public WxMaExpressLocalCancelOrderResult cancelOrder(WxMaExpressLocalCancelOrderRequest o) throws WxErrorException {
    String responseContent = this.service.post(ORDER_CANCEL_URL, o.toJson());
    return WxMaExpressLocalCancelOrderResult.fromJson(responseContent);
  }

  @Override
  public WxMaExpressLocalBaseResult mockUpdateOrder(WxMaExpressLocalOrderMockUpdateRequest o) throws WxErrorException {
    String responseContent = this.service.post(MOCK_UPDATE_ORDER, o.toJson());
    return WxMaExpressLocalBaseResult.fromJson(responseContent);
  }

  @Override
  public WxMaExpressLocalBaseResult realMockUpdateOrder(WxMaExpressLocalOrderMockUpdateRequest o) throws WxErrorException {
    String responseContent = this.service.post(REAL_MOCK_UPDATE_ORDER_URL, o.toJson());
    return WxMaExpressLocalBaseResult.fromJson(responseContent);
  }

}
