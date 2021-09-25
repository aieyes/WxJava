package cn.binarywang.wx.miniapp.bean.express.local.request;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * <pre>
 * 货物信息
 * </pre>
 * @author <a href="https://github.com/aieyes">aieyes</a>
 * @since 2021-09-24
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WxMaExpressLocalOrderCargo implements Serializable {
  private static final long serialVersionUID = -1111544731680363629L;

  @SerializedName("goods_value")
  private Double goodsValue;
  @SerializedName("goods_height")
  private Double goodsHeight;
  @SerializedName("goods_length")
  private Double goodsLength;
  @SerializedName("goods_width")
  private Double goodsWidth;
  @SerializedName("goods_weight")
  private Double goodsWeight;
  @SerializedName("goods_detail")
  private WxMaExpressLocalOrderCargoGoodsDetail goodsDetail;
  @SerializedName("goods_pickup_info")
  private String goodsPickupInfo;
  @SerializedName("goods_delivery_info")
  private String goodsDeliveryInfo;
  @SerializedName("cargo_first_class")
  private String cargoFirstClass;
  @SerializedName("cargo_second_class")
  private String cargoSecondClass;

}
