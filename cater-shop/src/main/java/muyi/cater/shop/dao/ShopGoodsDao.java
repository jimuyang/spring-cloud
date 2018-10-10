package muyi.cater.shop.dao;

import muyi.cater.shop.domain.model.MGoodsInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Jimu Yang.
 */
@Mapper
public interface ShopGoodsDao {

    @Select("select * from `tb_shop_goods_info` where id = #{goodsId}")
    MGoodsInfo selectById(Long goodsId);

}
