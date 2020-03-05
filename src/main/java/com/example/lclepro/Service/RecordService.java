package com.example.lclepro.Service;

import com.example.lclepro.Mapper.LcleRecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordService {

    @Autowired
    private LcleRecordMapper recordMapper;

    public List<String> selectAllGradle(){
        List<String> result = recordMapper.selectAllGradle();
        return result;
    }

    //检索指定年级的班级名称
    public List<String> selectClassname(Integer gradle){
        return recordMapper.selectClassname(gradle);
    }
}
