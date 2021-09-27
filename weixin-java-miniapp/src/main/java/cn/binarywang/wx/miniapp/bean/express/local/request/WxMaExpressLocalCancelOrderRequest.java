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
 * 取消下单请求
 * </pre>
 * @author <a href="https://github.com/aieyes">aieyes</a>
 * @since 2021-09-24
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WxMaExpressLocalCancelOrderRequest implements Serializable {
  private static final long serialVersionUID = 6304115970314913392L;

  @SerializedName("shopid")
  private String shopId;
  @SerializedName("shop_order_id")
  private String shopOrderId;
  @SerializedName("shop_no")
  private String shopNo;
  @SerializedName("delivery_sign")
  private String deliverySign;
  @SerializedName("delivery_id")
  private String deliveryId;
  @SerializedName("waybill_id")
  private String waybillId;
  @SerializedName("cancel_reason_id")
  private Integer cancelReasonId;
  @SerializedName("cancel_reason")
  private String cancelReason;

  public String toJson() {
    return WxMaGsonBuilder.create().toJson(this);
  }
}
