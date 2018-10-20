package muyi.cater.shop.service.impl;

import muyi.cater.shop.dao.ShopGoodsDao;
import muyi.cater.shop.domain.dto.TGoodsInfo;
import muyi.cater.shop.domain.model.MGoodsInfo;
import muyi.cater.shop.service.GoodsService;
import muyi.common.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Jimu Yang.
 */
@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private ShopGoodsDao shopGoodsDao;

    @Override
    public TGoodsInfo getGoodsInfo(Long goodsId) throws BusinessException {
        MGoodsInfo mGoodsInfo = this.shopGoodsDao.selectById(goodsId);
        if (mGoodsInfo == null) {
            return null;
        }
        TGoodsInfo tGoodsInfo = new TGoodsInfo();
        tGoodsInfo.setGoodsId(mGoodsInfo.getId());
        tGoodsInfo.setGoodsName(mGoodsInfo.getName());
        tGoodsInfo.setDescription(mGoodsInfo.getDesc());
        tGoodsInfo.setPrice(mGoodsInfo.getPrice());
        tGoodsInfo.setCategoryId(mGoodsInfo.getCategoryId());
        return tGoodsInfo;
    }


}
