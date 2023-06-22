package com.pennant.prodmtr.Dao.Impl;

import java.util.List;

import com.pennant.prodmtr.model.Dto.FunctionalUnitdto;
import com.pennant.prodmtr.model.Entity.FunctionalUnit;

public interface FunctionalunitDAO {
	public List<FunctionalUnitdto> getFunctionalunitByModId(Integer modId) ;
	public void save(FunctionalUnit funit);
}
