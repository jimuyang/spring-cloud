package muyi.cater.shop.service;

import muyi.cater.shop.domain.dto.TGoodsInfo;
import muyi.common.BusinessException;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Jimu Yang.
 */
public interface GoodsService {
    TGoodsInfo getGoodsInfo(Long goodsId) throws BusinessException;
}
