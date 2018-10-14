package muyi.cater.order.dao;

import muyi.cater.order.domain.model.MOrder;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Jimu Yang.
 * @date: 2018/10/13 下午2:48
 */
@Mapper
public interface OrderDao {

    @Insert("insert into `tb_order` (user_id, shop_id, user_name, address, mobile, status, total_amount, pay_amount) " +
            "values (#{userId}, #{shopId}, #{userName}, #{address}, #{status}, #{totalAmount}, #{payAmount}); ")
    @Options(useGeneratedKeys = true, keyColumn = "id")
    int insertOrder(MOrder mOrder);

    @Select("select * from `tb_order` where id = #{orderId};")
    MOrder selectById(Long orderId);

}



