package com.budofa.store.service;

import com.budofa.store.controler.model.RoleDTO;
import com.budofa.store.model.Role;
import com.budofa.store.repository.RoleRepository;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl extends BaseServiceImpl<Role, RoleDTO, RoleRepository>
        implements RoleService {

}
