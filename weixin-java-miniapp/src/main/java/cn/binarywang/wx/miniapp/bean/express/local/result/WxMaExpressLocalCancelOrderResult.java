package cn.binarywang.wx.miniapp.bean.express.local.result;

import cn.binarywang.wx.miniapp.json.WxMaGsonBuilder;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <pre>
 * 配送单取消结果
 * </pre>
 * @author <a href="https://github.com/aieyes">aieyes</a>
 * @since 2021-09-24
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WxMaExpressLocalCancelOrderResult extends WxMaExpressLocalBaseResult {
  private static final long serialVersionUID = 6924089746770303535L;

  @SerializedName("deduct_fee")
  private Double deductFee;
  @SerializedName("desc")
  private String desc;

  public static WxMaExpressLocalCancelOrderResult fromJson(String json) {
    return WxMaGsonBuilder.create().fromJson(json,
      new TypeToken<WxMaExpressLocalCancelOrderResult>() {
      }.getType());
  }

}
