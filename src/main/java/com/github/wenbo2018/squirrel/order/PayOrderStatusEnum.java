package com.github.wenbo2018.squirrel.order;

/**
 * Created by shenwenbo on 2018/11/23.
 */
public enum PayOrderStatusEnum {

    ORDER_INITIAL("已提交订单", 0),
    ORDER_PENDING_PAP("买家待付款", 1),
    ORDER_MERCHANT_SHIPPING("卖家已发货", 2),
    ORDER_USER_PAY("买家已付款", 3),
    ORDER_MERCHANT_CANCEL("订单取消", 4),
    ORDER_USER_RECEIVE("买家已收货", 5),
    ORDER_SUCCESS("交易成功", 6),
    ORDER_FAIL("交易失败", 7);

    private String desc;
    private int code;


    PayOrderStatusEnum(String desc, int code) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
