package cn.binarywang.wx.miniapp.bean.express.local.request;

import cn.binarywang.wx.miniapp.json.WxMaGsonBuilder;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * <pre>
 * 预下单请求
 * </pre>
 * @author <a href="https://github.com/aieyes">aieyes</a>
 * @since 2021-09-24
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WxMaExpressLocalAddOrderRequest implements Serializable {

  private static final long serialVersionUID = 456280320994819434L;

  /**
   * 预下单接口返回的参数，配送公司可保证在一段时间内运费不变
   * (一般情况下不需要下预配送单)
   */
  @SerializedName("delivery_token")
  private String deliveryToken;
  @SerializedName("shop_id")
  private String shopid;
  @SerializedName("shop_order_id")
  private String shopOrderId;
  @SerializedName("shop_no")
  private String shopNo;
  @SerializedName("delivery_sign")
  private String deliverySign;
  @SerializedName("delivery_id")
  private String deliveryId;
  @SerializedName("openid")
  private String openid;
  @SerializedName("sender")
  private WxMaExpressLocalOrderPerson sender;
  @SerializedName("receiver")
  private WxMaExpressLocalOrderPerson receiver;
  @SerializedName("cargo")
  private WxMaExpressLocalOrderCargo cargo;
  @SerializedName("order_info")
  private WxMaExpressLocalOrderInfo orderInfo;
  @SerializedName("shop")
  private WxMaExpressLocalOrderShop shop;
  @SerializedName("sub_biz_id")
  private String subBizId;

  public String toJson() {
    return WxMaGsonBuilder.create().toJson(this);
  }
}
