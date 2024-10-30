package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.models.AssetType;
import com.example.demo.repository.AssetTypeRepository;

@Service("atypeserv")
public class AssetTypeServImpl implements AssetTypeService {

	private AssetTypeRepository assettyperepo;
	
	/**
	 * @param assettyperepo
	 */
	public AssetTypeServImpl(AssetTypeRepository assettyperepo) {
		super();
		this.assettyperepo = assettyperepo;
	}

	@Override
	public AssetType saveAssetType(AssetType atype) {
		// TODO Auto-generated method stub
		return assettyperepo.save(atype);
	}

	@Override
	public List<AssetType> getAllAssetTypes() {
		// TODO Auto-generated method stub
		return assettyperepo.findAll();
	}

	@Override
	public AssetType getAssetTypeById(Integer id) {

		Optional<AssetType> astype = assettyperepo.findById(id);
		if(!astype.isEmpty()) {
			return astype.get();
		}
		else {
			return null;
		}
	}

	@Override
	public int updateAssetType(AssetType atype) {

		return  assettyperepo.updateAssetType(atype.getAsset_type() ,atype.getAsset_type_id());
	}

}
