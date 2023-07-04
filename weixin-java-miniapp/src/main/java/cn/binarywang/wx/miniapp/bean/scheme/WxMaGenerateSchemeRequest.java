package cn.binarywang.wx.miniapp.bean.scheme;

import cn.binarywang.wx.miniapp.json.WxMaGsonBuilder;
import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Data;

/**
 * @author : cofedream
 * created on  : 2021-01-26
 */
@Data
@Builder(builderMethodName = "newBuilder")
public class WxMaGenerateSchemeRequest {
  /**
   * 跳转到的目标小程序信息。
   * <pre>
   * 是否必填：否
   * </pre>
   */
  @SerializedName("jump_wxa")
  private JumpWxa jumpWxa;

  /**
   * 生成的scheme码类型，到期失效：true，永久有效：false。
   * <pre>
   * 是否必填：否
   * </pre>
   */
  @SerializedName("is_expire")
  private Boolean isExpire;

  /**
   * 到期失效的scheme码的失效时间，为Unix时间戳。生成的到期失效scheme码在该时间前有效。最长有效期为1年。生成到期失效的scheme时必填。
   * <pre>
   * 是否必填：否
   * </pre>
   */
  @SerializedName("expire_time")
  private Long expireTime;

  /**
   * 到期失效的 scheme 码失效类型，失效时间：0，失效间隔天数：1
   *  <pre>
   * 是否必填：否
   * </pre>
   */
  @SerializedName("expire_type")
  private Integer expireType;

  /**
   * 到期失效的 scheme 码的失效间隔天数。
   * <pre>
   * 生成的到期失效 scheme 码在该间隔时间到达前有效。最长间隔天数为365天。is_expire 为 true 且 expire_type 为 1 时必填   * <pre>
   * 是否必填：否
   * </pre>
   */
  @SerializedName("expire_interval")
  private Integer expireInterval;

  public String toJson() {
    return WxMaGsonBuilder.create().toJson(this);
  }

}
