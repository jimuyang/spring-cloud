package muyi.cater.order.domain.dto;

import lombok.Data;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Jimu Yang.
 * @date: 2018/10/14 下午11:26
 */
@Data
public class TCreateOrder {

    private Long userId;

    private String userName;

    private String mobile;

    private String address;

    private Long shopId;

    private String items;

}
