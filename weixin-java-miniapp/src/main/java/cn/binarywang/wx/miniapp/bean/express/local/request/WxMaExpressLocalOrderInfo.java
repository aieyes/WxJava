package cn.binarywang.wx.miniapp.bean.express.local.request;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * <pre>
 * 订单信息
 * </pre>
 * @author <a href="https://github.com/aieyes">aieyes</a>
 * @since 2021-09-24
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WxMaExpressLocalOrderInfo implements Serializable {
  private static final long serialVersionUID = 8944890320078017298L;

  @SerializedName("delivery_service_code")
  private String deliveryServiceCode;
  @SerializedName("order_type")
  private Integer orderType;
  @SerializedName("expected_delivery_time")
  private Long expectedDeliveryTime;
  @SerializedName("expected_finish_time")
  private Long expectedFinishTime;
  @SerializedName("expected_pick_time")
  private Long expectedPickTime;
  @SerializedName("poi_seq")
  private String poiSeq;
  @SerializedName("note")
  private String note;
  @SerializedName("order_time")
  private Long orderTime;
  @SerializedName("is_insured")
  private Integer isInsured;
  @SerializedName("declared_value")
  private Double declaredValue;
  @SerializedName("tips")
  private Double tips;
  @SerializedName("is_direct_delivery")
  private Integer isDirectDelivery;
  @SerializedName("cash_on_delivery")
  private Double cashOnDelivery;
  @SerializedName("cash_on_pickup")
  private Double cashOnPickup;
  @SerializedName("rider_pick_method")
  private Integer riderPickMethod;
  @SerializedName("is_finish_code_needed")
  private Integer isFinishCodeNeeded;
  @SerializedName("is_pickup_code_needed")
  private Integer isPickupCodeNeeded;

}
