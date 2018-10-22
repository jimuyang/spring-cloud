package muyi.cater.shop.service;

import muyi.cater.shop.domain.dto.TGoodsInfo;
import muyi.common.BusinessException;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Jimu Yang.
 */
public interface GoodsService {

    /**
     * 获取商品详情
     * @param goodsId
     * @return
     * @throws BusinessException
     */
    TGoodsInfo getGoodsInfo(Long goodsId) throws BusinessException;

    /**
     * 检查商品库存
     * @param goodsId
     * @param num
     * @return
     * @throws BusinessException
     */
    boolean checkStock(Long goodsId, int num) throws BusinessException;

    /**
     * 扣减商品库存
     * @param goodsId
     * @param num
     * @return
     * @throws BusinessException
     */
    int reduceStock(Long goodsId, int num) throws BusinessException;
}
