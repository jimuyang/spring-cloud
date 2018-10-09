package muyi.cater.restaurant.dao;

import muyi.cater.restaurant.domain.model.MGoodsInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Jimu Yang.
 */
@Mapper
public interface ProductCategoryDao {

    @Select("")
    MGoodsInfo selectById(Long goodsId);



}
