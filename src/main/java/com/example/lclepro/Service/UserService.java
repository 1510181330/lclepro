package com.example.lclepro.Service;

import com.example.lclepro.Bean.LcleCustomer;
import com.example.lclepro.Bean.LcleCustomerExample;
import com.example.lclepro.Bean.LcleFreeclass;
import com.example.lclepro.Bean.Msg;
import com.example.lclepro.Mapper.LcleCustomerMapper;
import com.example.lclepro.Mapper.LcleFreeclassMapper;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    LcleCustomerMapper lcleCustomerMapper;

    @Autowired
    LcleFreeclassMapper lcleFreeclassMapper;

    private List<String> vaules;


    //判断用户是否存在，成员存在，返回密码，不存在返回null
    public String isUser(String username){
        System.out.println("username； "+username);
        LcleCustomerExample example = new LcleCustomerExample();
        LcleCustomerExample.Criteria criteria = example.createCriteria();
        //检索没有被删除的所有成员
        criteria.andDeletedEqualTo(0);
        List<LcleCustomer> customers = lcleCustomerMapper.selectByExample(example);
        for(LcleCustomer lcleCustomer:customers){
            System.out.println(lcleCustomer.getUsername());
            if(lcleCustomer.getUsername().equals(username)){
                return lcleCustomer.getPassword();
            }
        }
        return null;
    }

    public Msg getAllCustomers(){
        LcleCustomerExample example = new LcleCustomerExample();
        LcleCustomerExample.Criteria criteria = example.createCriteria();
        //检索没有被删除的所有成员
        criteria.andDeletedEqualTo(0);
        List<LcleCustomer> customers = lcleCustomerMapper.selectByExample(example);
        List<LcleCustomer> row1 = new LinkedList<>();
        List<LcleCustomer> row2 = new LinkedList<>();
        List<LcleCustomer> row3 = new LinkedList<>();
        List<LcleCustomer> row4 = new LinkedList<>();
        List<LcleCustomer> row5 = new LinkedList<>();
        for(LcleCustomer emp:customers){
            emp.setPassword(null);
            if(emp.getDepname().equals("学风督察部")){
                row1.add(emp);
            }
            if(emp.getDepname().equals("信息管理部")){
                row2.add(emp);
            }
            if(emp.getDepname().equals("组织宣传部")){
                row3.add(emp);
            }
            if(emp.getDepname().equals("思想教育部")){
                row4.add(emp);
            }
            if(emp.getDepname().equals("办公室")){
                row5.add(emp);
            }
        }
        if(customers != null){
            return Msg.success().add("row1", row1).add("row2", row2).add("row3", row3).add("row4", row4).add("row5", row5);
        }
        else {
            return Msg.fail().add("error", "网络开小差了，请稍后重试");
        }
    }

    public List<LcleCustomer> selectByContion(){
        LcleCustomerExample example = new LcleCustomerExample();
        LcleCustomerExample.Criteria criteria = example.createCriteria();
        //保证成员未被删除
        criteria.andDeletedEqualTo(0);

        List<LcleCustomer> result = lcleCustomerMapper.selectByExample(example);
        for(LcleCustomer emp : result){
            emp.setPassword("");
        }
        return result;
    }

    public LcleCustomer selectCustomerByName(String username){
        LcleCustomerExample example = new LcleCustomerExample();
        LcleCustomerExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(username);
        List<LcleCustomer> customer = lcleCustomerMapper.selectByExample(example);
        return customer.get(0);
    }

    public boolean updateUserInfo(JSONObject object){
        System.out.println("更新方法执行！");
        String username = (String)object.get("username");
        Long id = (Long) object.get("id");
        Integer uid = id.intValue();
        String password = (String)object.get("password");
        String depname = (String)object.get("depname");
        String phone = (String)object.get("phone");
        String qq = (String)object.get("qq");
        LcleCustomer emp = lcleCustomerMapper.selectByPrimaryKey(uid);
        emp.setId(uid);
        emp.setUsername(username);
        emp.setPassword(password);
        emp.setDepname(depname);
        emp.setUpdateTime(LocalDateTime.now());
        emp.setPhone(phone);
        emp.setQq(qq);
        int result = lcleCustomerMapper.updateByPrimaryKey(emp);
        if(result>0){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean addUser(JSONObject object){
        String username = (String)object.get("username");
        String password = (String)object.get("password");
        String depname = (String)object.get("depname");
        String phone = (String)object.get("phone");
        String qq = (String)object.get("qq");
        LcleCustomer emp = new LcleCustomer();
        emp.setUsername(username);
        emp.setPassword(password);
        emp.setDepname(depname);
        emp.setAddTime(LocalDateTime.now());
        LocalDateTime usetime = LocalDateTime.now();
        emp.setUpdateTime(usetime);
        emp.setPhone(phone);
        emp.setQq(qq);
        emp.setDeleted(0);
        emp.setSex(1);
        emp.setRole("user");
        int result = lcleCustomerMapper.insert(emp);
        if(result>0){
            //给每个用户初始化一个空课信息
            //先利用加入时间的唯一性，获取到用户，进而获取到用户的id
            LcleCustomerExample example = new LcleCustomerExample();
            LcleCustomerExample.Criteria criteria = example.createCriteria();
            criteria.andAddTimeEqualTo(usetime);
            LcleCustomer zhu = lcleCustomerMapper.selectByExample(example).get(0);
            LcleFreeclass record = new LcleFreeclass();
            record.setDeleted(0);
            record.setCustomerId(zhu.getId());
            record.setUpdateTime(LocalDateTime.now());
            record.setC11(0);
            record.setC12(0);
            record.setC13(0);
            record.setC14(0);
            record.setC21(0);
            record.setC22(0);
            record.setC23(0);
            record.setC24(0);
            record.setC31(0);
            record.setC32(0);
            record.setC33(0);
            record.setC34(0);
            record.setC41(0);
            record.setC42(0);
            record.setC43(0);
            record.setC44(0);
            record.setC51(0);
            record.setC52(0);
            record.setC53(0);
            record.setC54(0);
            lcleFreeclassMapper.insert(record);
            return true;
        }
        else {
            return false;
        }
    }
}
