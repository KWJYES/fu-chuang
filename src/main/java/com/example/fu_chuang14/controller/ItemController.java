package com.example.fu_chuang14.controller;


import com.example.fu_chuang14.dao.ItemDao;
import com.example.fu_chuang14.pojo.Item;
import com.example.fu_chuang14.service.ItemService;
import com.example.fu_chuang14.vo.ResultVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/item")
@EnableAutoConfiguration
public class ItemController {

    @Autowired
    private ItemService itemService;


    @PostMapping(value = "/add")
    public ResultVo addItem(@RequestBody Item item){
        return itemService.addItem(item);
    }

    @PostMapping(value = "/delete")
    public ResultVo delete(@RequestBody Item item){
        return itemService.deleteItem(item);
    }

    @PostMapping(value = "/findByAccount")
    public ResultVo findByAccount(@Param("account") String account){
        return itemService.getItemByAccount(account);
    }

    @PostMapping(value = "/findByAccountAndImageId")
    public ResultVo findByAccountAndImageId(@Param("account") String account,@Param("imageId") String imageId){
        return itemService.getItemByAccountAndImageId(account,imageId);
    }
}
