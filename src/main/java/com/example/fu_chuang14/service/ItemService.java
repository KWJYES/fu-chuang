package com.example.fu_chuang14.service;

import com.example.fu_chuang14.pojo.Item;
import com.example.fu_chuang14.vo.ResultVo;
import org.springframework.stereotype.Service;

@Service
public interface ItemService {
    ResultVo getItemByAccount(String account);
    ResultVo getItemByAccountAndImageId(String account,int imageId);

    ResultVo addItem(Item item);

    ResultVo deleteItem(Item item);
}
