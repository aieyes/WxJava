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
 * 异常件退回商家商家确认收货请求对象
 * </pre>
 * @author <a href="https://github.com/aieyes">aieyes</a>
 * @since 2021-09-24
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WxMaExpressAbnormalConfirmRequest implements Serializable {

  private static final long serialVersionUID = -9118541057372113557L;

  /**
   * 商家id
   * <pre>
   * 是否必填： 是
   * 描述：由配送公司分配的appkey
   * </pre>
   */
  @SerializedName("shop_id")
  private String shopId;

  /**
   * 商家订单唯一ID
   * <pre>
   * 是否必填： 是
   * 描述： 唯一标识订单的 ID，由商户生成
   * </pre>
   */
  @SerializedName("shop_order_id")
  private String shopOrderId;

  /**
   * 门店编号
   * <pre>
   * 是否必填： 是
   * 描述： 商家门店编号，在配送公司登记，闪送必填，值为店铺id
   * </pre>
   */
  @SerializedName("shop_no")
  private String shopNo;

  /**
   * 配送单ID
   * <pre>
   * 是否必填： 是
   * 描述： 配送单ID
   * </pre>
   */
  @SerializedName("waybill_id")
  private String waybillId;

  /**
   * 备注
   * <pre>
   * 是否必填： 否
   * 描述： 备注
   * </pre>
   */
  @SerializedName("remark")
  private String remark;

  /**
   * 签名
   * <pre>
   * 是否必填： 是
   * 描述： 用配送公司提供的appSecret加密的校验串<a href="https://developers.weixin.qq.com/miniprogram/dev/platform-capabilities/industry/immediate-delivery/read_first.html">说明</a>
   * </pre>
   */
  @SerializedName("delivery_sign")
  private String deliverySign;

  public String toJson() {
    return WxMaGsonBuilder.create().toJson(this);
  }
}
