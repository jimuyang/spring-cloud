package muyi.cater.shop.dao;

import muyi.cater.shop.domain.model.MGoodsInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.autoconfigure.core.AutoConfigureCache;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Jimu Yang.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ShopGoodsDaoTest {

    @Autowired
    private ShopGoodsDao shopGoodsDao;

    @Test
    public void testDao() throws Exception {
        MGoodsInfo goodsInfo = this.shopGoodsDao.selectById(1L);
        assertEquals(goodsInfo.getName(), "好喝的稀饭");
    }


}