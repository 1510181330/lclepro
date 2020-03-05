package com.example.lclepro.Service;

import com.example.lclepro.Bean.LcleCustomer;
import com.example.lclepro.Bean.LcleFreeclass;
import com.example.lclepro.Bean.LcleFreeclassExample;
import com.example.lclepro.Mapper.LcleFreeclassMapper;
import com.example.lclepro.Utils.FreeclassUtils;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class FreeclassService {

    @Autowired
    private LcleFreeclassMapper freeclassMapper;

    public boolean addFreeclass(JSONObject object, Integer uid){
        FreeclassUtils utils = new FreeclassUtils();
        List<String> day1 = (List<String>)object.get("day1");
        List<String> day2 = (List<String>)object.get("day2");
        List<String> day3 = (List<String>)object.get("day3");
        List<String> day4 = (List<String>)object.get("day4");
        List<String> day5 = (List<String>)object.get("day5");
        //先获取到现有记录，使用id对记录进行更新即可
        LcleFreeclassExample example = new LcleFreeclassExample();
        LcleFreeclassExample.Criteria criteria = example.createCriteria();
        criteria.andCustomerIdEqualTo(uid);
        LcleFreeclass before = freeclassMapper.selectByExample(example).get(0);
        LcleFreeclass record = new LcleFreeclass();
        record.setId(before.getId());
        record.setDeleted(0);
        record.setCustomerId(uid);
        record.setUpdateTime(LocalDateTime.now());
        LcleFreeclass after = utils.JsonToFreeclass(record, day1, day2, day3, day4, day5);
        freeclassMapper.updateByPrimaryKey(after);
        return true;
    }
}
