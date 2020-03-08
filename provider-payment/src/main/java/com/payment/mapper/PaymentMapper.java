package com.payment.mapper;

import com.payment.po.PaymentPo;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.mapper.common.BaseMapper;

/**
 * @Description:
 * @Auther: zhurongsheng
 * @Date: 2020/3/8 01:49
 */
@Mapper
public interface PaymentMapper extends BaseMapper<PaymentPo> {
}
