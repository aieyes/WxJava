package cn.binarywang.wx.miniapp.bean.express.local.request;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * <pre>
 * 门店
 * </pre>
 * @author <a href="https://github.com/aieyes">aieyes</a>
 * @since 2021-09-24
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WxMaExpressLocalOrderShop implements Serializable {
  private static final long serialVersionUID = 4104149582198383635L;

  @SerializedName("wxa_path")
  private String wxaPath;
  @SerializedName("img_url")
  private String imgUrl;
  @SerializedName("goods_name")
  private String goodsName;
  @SerializedName("goods_count")
  private Double goodsCount;
  @SerializedName("wxa_appid")
  private String wxaAppid;

}
