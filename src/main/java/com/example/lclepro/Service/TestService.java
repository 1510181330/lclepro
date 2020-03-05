package com.example.lclepro.Service;

import com.example.lclepro.Bean.LcleCustomer;
import com.example.lclepro.Bean.LcleCustomerExample;
import com.example.lclepro.Bean.Msg;
import com.example.lclepro.Mapper.LcleCustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.time.LocalDateTime;
import java.util.List;

@Service
public class TestService {

    @Autowired
    LcleCustomerMapper lcleCustomerMapper;

    public List<LcleCustomer> getAllCustomers(){
        LcleCustomerExample example = new LcleCustomerExample();
        LcleCustomerExample.Criteria criteria = example.createCriteria();
        //检索没有被删除的所有成员
        criteria.andDeletedEqualTo(0);
        List<LcleCustomer> customers = lcleCustomerMapper.selectByExample(example);

        if(customers != null){
            return customers;
        }
        else {
            return null;
        }
    }

    public Integer addCustomer(LcleCustomer lcleCustomer){
        lcleCustomer.setAddTime(LocalDateTime.now());
        lcleCustomer.setUpdateTime(LocalDateTime.now());
        lcleCustomer.setDeleted(0);
        Integer result = lcleCustomerMapper.insert(lcleCustomer);
        return result;
    }

    public void delCustomer(Integer Id){
        if(Id != null){
            lcleCustomerMapper.deleteByPrimaryKey(Id);
        }
    }
}
