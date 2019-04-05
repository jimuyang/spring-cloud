package muyi.cater.shop.domain.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Jimu Yang.
 */
@Data
public class MGoodsInfo {

    private Long id;

    private String name;

    private Long categoryId;

    private BigDecimal price;

    private String desc;

    private Date createdAt;

    private Date updatedAt;

    private Integer stock;

    private Long shopId;
}
