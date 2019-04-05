package muyi.cater.order.domain.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Jimu Yang.
 * @date: 2018/10/13 下午2:40
 */
@Data
public class MOrderDetail {

    private Long id;

    private Long orderId;

    private Long goodsId;

    private String goodsName;

    private Integer quantity;

    private BigDecimal unitPrice;

    private String goodsIcon;

    private Date createdAt;

    private Date updatedAt;

    private Integer isDeleted;

}
