package com.example.lclepro.Mapper;

import com.example.lclepro.Bean.LcleFreeclass;
import com.example.lclepro.Bean.LcleFreeclassExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LcleFreeclassMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lcle_freeclass
     *
     * @mbg.generated
     */
    long countByExample(LcleFreeclassExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lcle_freeclass
     *
     * @mbg.generated
     */
    int deleteByExample(LcleFreeclassExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lcle_freeclass
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lcle_freeclass
     *
     * @mbg.generated
     */
    int insert(LcleFreeclass record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lcle_freeclass
     *
     * @mbg.generated
     */
    int insertSelective(LcleFreeclass record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lcle_freeclass
     *
     * @mbg.generated
     */
    List<LcleFreeclass> selectByExample(LcleFreeclassExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lcle_freeclass
     *
     * @mbg.generated
     */
    LcleFreeclass selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lcle_freeclass
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") LcleFreeclass record, @Param("example") LcleFreeclassExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lcle_freeclass
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") LcleFreeclass record, @Param("example") LcleFreeclassExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lcle_freeclass
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LcleFreeclass record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lcle_freeclass
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LcleFreeclass record);
}