package cn.binarywang.wx.miniapp.bean.scheme;

import cn.binarywang.wx.miniapp.json.WxMaGsonBuilder;
import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Data;

/**
 * @author : aieyes
 * @date : 2022-11-23
 */
@Data
@Builder(builderMethodName = "newBuilder")
public class WxMaGenerateNfcSchemeRequest {
  /**
   * 跳转到的目标小程序信息。
   * <pre>
   * 是否必填：否
   * </pre>
   */
  @SerializedName("jump_wxa")
  private JumpWxa jumpWxa;

  /**
   * scheme对应的设备sn，仅一机一码时填写
   * <pre>
   * 是否必填：否
   * </pre>
   */
  @SerializedName("sn")
  private String sn;

  /**
   * scheme对应的设备model_id
   * <pre>
   * 是否必填：是
   * </pre>
   */
  @SerializedName("model_id")
  private String modelId;

  public String toJson() {
    return WxMaGsonBuilder.create().toJson(this);
  }
}
