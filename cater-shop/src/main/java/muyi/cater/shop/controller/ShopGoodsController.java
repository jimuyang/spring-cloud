package muyi.cater.shop.controller;

import muyi.cater.shop.domain.dto.TGoodsInfo;
import muyi.cater.shop.service.GoodsService;
import muyi.common.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Jimu Yang.
 */
@RestController
@RequestMapping("/goods")
public class ShopGoodsController {

    @Autowired
    private GoodsService goodsService;

    @GetMapping("/{id}")
    public TGoodsInfo getGoodsInfo(@PathVariable("id") Long goodsId) {
        try {
            return this.goodsService.getGoodsInfo(goodsId);
        } catch (BusinessException be) {
            return null;
        }
    }

    @GetMapping("/message")
    public Object getMessage() {
        return "This is the message from ShopServer";
    }

}
