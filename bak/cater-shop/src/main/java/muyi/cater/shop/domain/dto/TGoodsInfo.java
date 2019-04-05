package muyi.cater.shop.domain.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Jimu Yang.
 */
@Data
public class TGoodsInfo {

    private Long goodsId;

    private String goodsName;

    private Long categoryId;

    private BigDecimal price;

    private String description;

}
