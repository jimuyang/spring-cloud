package muyi.cater.shop.service.impl;

import muyi.cater.shop.dao.ShopGoodsDao;
import muyi.cater.shop.domain.dto.TGoodsInfo;
import muyi.cater.shop.domain.model.MGoodsInfo;
import muyi.cater.shop.enums.ReturnCode;
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

    /**
     * 获取商品详情
     * @param goodsId
     * @return
     * @throws BusinessException
     */
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

    /**
     * 检查商品库存
     * @param goodsId
     * @param num
     * @return
     * @throws BusinessException
     */
    @Override
    public boolean checkStock(Long goodsId, int num) throws BusinessException {
        MGoodsInfo mGoodsInfo = this.shopGoodsDao.selectById(goodsId);
        return mGoodsInfo != null && mGoodsInfo.getStock() > num;
    }

    /**
     * 扣减商品库存
     * @param goodsId
     * @param num
     * @return
     * @throws BusinessException
     */
    @Override
    public int reduceStock(Long goodsId, int num) throws BusinessException {
        MGoodsInfo mGoodsInfo = this.shopGoodsDao.selectById(goodsId);
        if (mGoodsInfo == null) {
            throw new BusinessException(ReturnCode.GOODS_NOT_FOUND);
        }

        if (mGoodsInfo.getStock() < num) {
            throw new BusinessException(ReturnCode.GOODS_LACK_STOCK);
        }

        mGoodsInfo.setStock(mGoodsInfo.getStock() - num);
        int affect = this.shopGoodsDao.updateStock(mGoodsInfo);
        if (affect != 1) {
            throw new BusinessException(ReturnCode.UPDATE_DATABASE_FAILED);
        }
        return affect;
    }

}
