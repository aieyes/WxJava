package cn.binarywang.wx.miniapp.bean.express.local.request;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * <pre>
 * 配送单发件人/接收人
 * </pre>
 * @author <a href="https://github.com/aieyes">aieyes</a>
 * @since 2021-09-24
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WxMaExpressLocalOrderPerson implements Serializable {
  private static final long serialVersionUID = 140473772263527349L;

  /**
   * 发件人/收件人姓名
   * <pre>
   * 是否必填： 是
   * 描述： 不超过64字节
   * </pre>
   */
  @SerializedName("name")
  private String name;

  /**
   * 发件人/收件人地区或市
   * <pre>
   * 是否必填： 是
   * 描述： 比如："广州市"，不超过64字节
   * </pre>
   */
  @SerializedName("city")
  private String city;

  /**
   * 发件人/收件人参考地址
   * <pre>
   * 是否必填： 是
   * 描述：地址(街道、小区、大厦等，用于定位)
   * </pre>
   */
  @SerializedName("address")
  private String address;

  /**
   * 发件人/收件人详细地址
   * <pre>
   * 是否必填： 是
   * 描述：地址详情(楼号、单元号、层号)
   * </pre>
   */
  @SerializedName("address_detail")
  private String addressDetail;

  /**
   * 电话/手机
   * <pre>
   * 是否必填： 是
   * 描述：电话/手机号，最长不超过64个字符
   * </pre>
   */
  @SerializedName("phone")
  private String phone;

  /**
   * 经度
   * <pre>
   * 是否必填： 是
   * 描述：火星坐标或百度坐标，和 coordinate_type 字段配合使用，确到小数点后6位
   * </pre>
   */
  @SerializedName("lng")
  private Double lng;

  /**
   * 纬度
   * <pre>
   * 是否必填： 是
   * 描述：火星坐标或百度坐标，和 coordinate_type 字段配合使用，精确到小数点后6位
   * </pre>
   */
  @SerializedName("lat")
  private Double lat;

  /**
   * 坐标类型
   * <pre>
   * 是否必填： 否
   * 描述：0：火星坐标（高德，腾讯地图均采用火星坐标） 1：百度坐标
   * </pre>
   */
  @SerializedName("coordinate_type")
  private Integer coordinateType;

}
