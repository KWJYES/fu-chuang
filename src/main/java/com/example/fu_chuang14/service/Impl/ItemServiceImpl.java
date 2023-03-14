package com.example.fu_chuang14.service.Impl;

import com.example.fu_chuang14.dao.ItemDao;
import com.example.fu_chuang14.pojo.Item;
import com.example.fu_chuang14.service.ItemService;
import com.example.fu_chuang14.vo.CodeMsg;
import com.example.fu_chuang14.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    ItemDao itemDao;

    @Override
    public ResultVo getItemByAccount(String account) {
        List<Item> items=itemDao.findByAccount(account);
        if (items.size()==0){
            return ResultVo.error(CodeMsg.SELECT_ERROR);
        }else {
            return ResultVo.success(items);
        }
    }

    @Override
    public ResultVo getItemByAccountAndImageId(String account, int imageId) {
        List<Item> items=itemDao.findByAccountAndImageId(account,imageId);
        if (items.size()==0){
            return ResultVo.error(CodeMsg.SELECT_ERROR);
        }else {
            return ResultVo.success(items);
        }
    }

    @Override
    public ResultVo addItem(Item item) {
        itemDao.insert(item);
        return ResultVo.success(CodeMsg.SUCCESS);
    }

    @Override
    public ResultVo deleteItem(Item item) {
        itemDao.delete(item);
        return ResultVo.success(CodeMsg.SUCCESS);
    }


}
