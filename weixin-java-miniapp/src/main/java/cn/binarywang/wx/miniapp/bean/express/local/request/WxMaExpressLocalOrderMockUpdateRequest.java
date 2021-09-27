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
 * 模拟撇送公司更新订单状态
 * </pre>
 * @author <a href="https://github.com/aieyes">aieyes</a>
 * @since 2021-09-24
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WxMaExpressLocalOrderMockUpdateRequest implements Serializable {
  private static final long serialVersionUID = -3683239300148016034L;

  @SerializedName("shopid")
  private String shopId;
  @SerializedName("shop_order_id")
  private String shopOrderId;
  @SerializedName("action_time")
  private Long actionTime;
  @SerializedName("order_status")
  private Integer orderStatus;
  @SerializedName("action_msg")
  private String actionMsg;
  /**
   * 真实发送给运力公司模拟时才需要，即 realMockUpdateOrder 接口
   * 目前只支持顺丰和达达
   */
  @SerializedName("delivery_sign")
  private String deliverySign;

  public String toJson() {
    return WxMaGsonBuilder.create().toJson(this);
  }

}
