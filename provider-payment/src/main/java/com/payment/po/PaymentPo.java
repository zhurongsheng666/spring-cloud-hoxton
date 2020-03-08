package com.payment.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.Options;

import javax.persistence.*;

/**
 * @Description: 流水号
 * @Auther: zhurongsheng
 * @Date: 2020/3/8 01:37
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "t_payment")
public class PaymentPo {

    /**
     * id
     */
    @Id
    @Column(name = "n_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    /**
     * 流水号
     */
    @Column(name = "c_serial")
    private String serial;

    /**
     * 支付名
     */
    @Column(name = "c_name")
    private String name;

    /**
     * 金额
     */
    @Column(name = "n_money")
    private float money;

}
