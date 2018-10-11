package muyi.cater.shop.service;

import muyi.cater.shop.BusinessException;
import muyi.cater.shop.domain.dto.TGoodsInfo;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Jimu Yang.
 */
public interface GoodsService {
    TGoodsInfo getGoodsInfo(Long goodsId) throws BusinessException;
}
