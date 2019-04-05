package muyi.cater.order.domain.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Jimu Yang.
 * @date: 2018/10/13 下午2:25
 */
@Data
public class MOrder {

    private Long id;

    private Long userId;

    private Long shopId;

    private String userName;

    private String address;

    private String mobile;

    private Integer status;

    private BigDecimal totalAmount;

    private BigDecimal payAmount;

    private Date createdAt;

    private Date updatedAt;

    private Integer isDeleted;
}
