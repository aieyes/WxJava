package cn.binarywang.wx.miniapp.bean.express.local;

import cn.binarywang.wx.miniapp.json.WxMaGsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.chanjar.weixin.common.util.json.GsonParser;

import java.io.Serializable;
import java.util.List;

/**
 * <pre>
 * 配送公司对象
 * </pre>
 * @author <a href="https://github.com/aieyes">aieyes</a>
 * @since 2021-09-24
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WxMaExpressImmediateDelivery implements Serializable {

  private static final long serialVersionUID = -3347327680270921990L;

  /**
   * 快递公司 ID
   */
  @SerializedName("delivery_id")
  private String deliveryId;

  /**
   * 快递公司名称
   */
  @SerializedName("delivery_name")
  private String deliveryName;

  public static List<WxMaExpressImmediateDelivery> fromJson(String json) {
    JsonObject jsonObject = GsonParser.parse(json);
    return WxMaGsonBuilder.create().fromJson(jsonObject.get("list").toString(),
      new TypeToken<List<WxMaExpressImmediateDelivery>>() {
      }.getType());
  }
}
