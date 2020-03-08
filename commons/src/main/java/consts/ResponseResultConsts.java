package consts;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @Auther: zhurongsheng
 * @Date: 2020/3/8 02:01
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResponseResultConsts {

    private Integer code;

    private String msg;

    private Object data;

    /**
     * 响应成功
     */
    public static ResponseResultConsts success(Object data,String msg){
        return new ResponseResultConsts(200, msg,data);
    }

    /**
     * 响应失败
     */
    public static ResponseResultConsts fail(Integer code,String msg){
        return new ResponseResultConsts(code, msg,null);
    }

}
