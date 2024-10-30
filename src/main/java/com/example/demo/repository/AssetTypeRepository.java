package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.AssetType;

@Repository("assettyperepo")
public interface AssetTypeRepository extends JpaRepository<AssetType, Integer> {

	
	@Query("UPDATE AssetType a SET a.asset_type=:assettype WHERE a.asset_type_id=:id")
	@Transactional
	@Modifying
	public int updateAssetType(String assettype,Integer id);
}
