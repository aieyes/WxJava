package cn.binarywang.wx.miniapp.bean.express.local.request;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * <pre>
 * 商品
 * </pre>
 * @author <a href="https://github.com/aieyes">aieyes</a>
 * @since 2021-09-24
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WxMaExpressLocalOrderCargoGoods implements Serializable {
  private static final long serialVersionUID = -4793964291014848498L;

  @SerializedName("goods_count")
  private Double goodsCount;

  @SerializedName("goods_name")
  private String goodsName;

  @SerializedName("goods_price")
  private Double goodsPrice;

  @SerializedName("goods_unit")
  private String goodsUnit;

}
