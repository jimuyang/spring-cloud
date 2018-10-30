package muyi.cater.order.client;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author: Jimu Yang
 * @date: 2018/10/30 11:22 PM
 * @descricption: want more.
 */
@Data
public class TGoodsInfo {


    private Long goodsId;

    private String goodsName;

    private Long categoryId;

    private BigDecimal price;

    private String description;

}
