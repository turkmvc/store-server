package com.budofa.store.service;

import com.budofa.store.controler.model.FirmDTO;
import com.budofa.store.model.Firm;
import com.budofa.store.repository.FirmRepository;
import org.springframework.stereotype.Service;

@Service
public class FirmServiceImpl extends  BaseServiceImpl<Firm, FirmDTO, FirmRepository> implements FirmService{

}
