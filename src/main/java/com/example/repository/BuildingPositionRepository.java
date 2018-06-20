package com.example.repository;

import com.example.domain.BuildingPosition;
import org.springframework.data.jpa.repository.JpaRepository;

/**
* 楼盘职位
*
* @author Roger
* @email 190642964@qq.com
* @create 2018-6-19 12:08:21
*/
public interface BuildingPositionRepository extends JpaRepository<BuildingPosition,Long> {

}