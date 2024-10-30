package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity 
@Table(name="tbl_assettype")
@SequenceGenerator(name = "assetype_seq",allocationSize = 1,initialValue = 1)
public class AssetType {
	
	@Id @GeneratedValue(generator = "assetype_seq" , strategy = GenerationType.AUTO)
	private Integer asset_type_id;

	private String asset_type;

	public Integer getAsset_type_id() {
		return asset_type_id;
	}

	public void setAsset_type_id(Integer asset_type_id) {
		this.asset_type_id = asset_type_id;
	}

	public String getAsset_type() {
		return asset_type;
	}

	public void setAsset_type(String asset_type) {
		this.asset_type = asset_type;
	}

	/**
	 * @param asset_type_id
	 * @param asset_type
	 */
	public AssetType(Integer asset_type_id, String asset_type) {
		super();
		this.asset_type_id = asset_type_id;
		this.asset_type = asset_type;
	}

	/**
	 * 
	 */
	public AssetType() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "AssetType [asset_type_id=" + asset_type_id + ", asset_type=" + asset_type + "]";
	}
	
	
}
