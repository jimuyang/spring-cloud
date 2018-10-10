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
public interface ShopCategoryDao {

    @Select("")
    MGoodsInfo selectById(Long goodsId);



}
