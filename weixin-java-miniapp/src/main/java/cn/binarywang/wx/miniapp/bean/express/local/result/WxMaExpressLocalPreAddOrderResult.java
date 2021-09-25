package cn.binarywang.wx.miniapp.bean.express.local.result;

import cn.binarywang.wx.miniapp.json.WxMaGsonBuilder;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <pre>
 * 预下单返回的结果
 * </pre>
 * @author <a href="https://github.com/aieyes">aieyes</a>
 * @since 2021-09-24
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WxMaExpressLocalPreAddOrderResult extends WxMaExpressLocalBaseResult {
  private static final long serialVersionUID = 1663611419915250144L;

  @SerializedName("fee")
  private Double fee;
  @SerializedName("deliverfee")
  private Double deliverfee;
  @SerializedName("couponfee")
  private Double couponfee;
  @SerializedName("tips")
  private Double tips;
  @SerializedName("insurancefee")
  private Double insurancefee;
  @SerializedName("distance")
  private Double distance;
  @SerializedName("dispatch_duration")
  private Integer dispatchDuration;
  @SerializedName("delivery_token")
  private String deliveryToken;

  public static WxMaExpressLocalPreAddOrderResult fromJson(String json) {
    return WxMaGsonBuilder.create().fromJson(json,
      new TypeToken<WxMaExpressLocalPreAddOrderResult>() {
      }.getType());
  }
}
