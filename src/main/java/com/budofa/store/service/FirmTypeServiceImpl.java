package com.budofa.store.service;

import com.budofa.store.controler.model.FirmTypeDTO;
import com.budofa.store.model.FirmType;
import com.budofa.store.repository.FirmTypeRepository;
import org.springframework.stereotype.Service;

@Service
public class FirmTypeServiceImpl extends BaseServiceImpl<FirmType, FirmTypeDTO, FirmTypeRepository> implements FirmTypeService {

}
