package cn.binarywang.wx.miniapp.bean.express.local.result;

import cn.binarywang.wx.miniapp.json.WxMaGsonBuilder;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * <pre>
 * 基本结果
 * </pre>
 * @author <a href="https://github.com/aieyes">aieyes</a>
 * @since 2021-09-24
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WxMaExpressLocalBaseResult implements Serializable {

  private static final long serialVersionUID = -4793781723192195986L;

  @SerializedName("errcode")
  private Integer errCode;

  @SerializedName("errmsg")
  private String errMsg;

  @SerializedName("resultcode")
  private Integer resultCode;

  @SerializedName("resultmsg")
  private String resultMsg;

  public static WxMaExpressLocalBaseResult fromJson(String json) {
    return WxMaGsonBuilder.create().fromJson(json,
      new TypeToken<WxMaExpressLocalBaseResult>() {
      }.getType());
  }
}
