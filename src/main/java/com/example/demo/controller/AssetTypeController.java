package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.AssetType;
import com.example.demo.service.AssetTypeService;

@RestController
@RequestMapping("assettype")
public class AssetTypeController {

	private AssetTypeService atypeserv;

	/**
	 * @param atypeserv
	 */
	public AssetTypeController(AssetTypeService atypeserv) {
		super();
		this.atypeserv = atypeserv;
	}
	
	
	@PostMapping("/")
	public AssetType saveAssetType(@RequestBody AssetType atype) {
	
		AssetType assettype = atypeserv.saveAssetType(atype);
		if(assettype!=null) {
			return assettype;
		}
		else {
			return null;
		}
	}
	
	@GetMapping("/")
	public List<AssetType> getAllAssetTypes() {
		List<AssetType> atypelist = atypeserv.getAllAssetTypes();
		if(atypelist.size()>0) {
			return atypelist;
		}
		else {
			return atypelist;
		}
	}
	   
	@GetMapping("/{id}")
	public AssetType getAssetTypeById(@PathVariable Integer id) {
		 AssetType atype = atypeserv.getAssetTypeById(id);
		if(atype!=null) {
			return atype;
		}
		else {
			return atype;
		}
	}
	
	
	@PutMapping("/")
	public int updateAssetType(@RequestBody AssetType atype) {
	
		int res = atypeserv.updateAssetType(atype);
		if(res>0) {
			return 1;
		}
		else {
			return 0;
		}
	}
}
