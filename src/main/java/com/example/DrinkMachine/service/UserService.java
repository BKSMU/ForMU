package com.example.DrinkMachine.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.DrinkMachine.dto.ItemDto;
import com.example.DrinkMachine.entity.Item;
import com.example.DrinkMachine.repository.ItemRepository;

/**
 * ユーザー情報 Service
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserService {
	
	 /**
     * アイテム情報 Repository
     */
    @Autowired
    ItemRepository itemRepository;
    
    /**
     * アイテム情報新規登録
     * @param item アイテム情報
     */
    @PostMapping
    public void insert(ItemDto itemDto) {
    	itemRepository.save(createItem(itemDto));
    }
    
    /**
     * アイテムTBLエンティティの生成
     * @param itemRequest アイテム情報dto
     * @return アイテムTBLエンティティ
     */
    private Item createItem(ItemDto itemDto) {
    	
    	//登録日時
        Date now = new Date();
        
        Item item = new Item();
        item.setName(itemDto.getName());
        item.setUnitPrice(itemDto.getUnitPrice());
        item.setCount(itemDto.getCount());
        item.setIsPr(itemDto.getIsPr());
        item.setRecordDate(now);
        return item;
    }

}
