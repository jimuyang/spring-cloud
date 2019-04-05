package muyi.cater.shop.dao;

import muyi.cater.shop.domain.model.MGoodsInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Jimu Yang.
 */
@Mapper
public interface ShopGoodsDao {

    @Select("select * from `tb_shop_goods_info` where id = #{goodsId}")
    MGoodsInfo selectById(Long goodsId);

    @Update("update `tb_shop_goods_info` set stock = #{stock} where id = #{id}")
    int updateStock(MGoodsInfo mGoodsInfo);
}
