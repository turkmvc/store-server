package com.budofa.store.controler.secured;

import com.budofa.store.controler.model.RoleDTO;
import com.budofa.store.model.Role;
import com.budofa.store.service.RoleService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.lang.reflect.Type;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600) //TODO fix before production. this is for allow CORS
@RestController
@RequestMapping(path = "/secure/role")
public class RoleController implements BaseSecuredController<RoleDTO> {

    @Autowired
    private RoleService roleService;

    @Override
    public List<RoleDTO> get() {
        ModelMapper modelMapper = new ModelMapper();
        Type targetListType = new TypeToken<List<RoleDTO>>() {}.getType();
        return modelMapper.map(roleService.findAll(), targetListType);
    }

    @Override
    public RoleDTO get(@PathVariable Long id) {
        return roleService.find(id);
    }

    @Override
    public void save(@RequestBody RoleDTO roleDTO) {
        roleService.persist(roleDTO);
    }

    @Override
    public void update(@Valid @RequestBody RoleDTO roleDTO) {

        //TODO try to implement update function in base service
        Role role = roleService.findOne(roleDTO.getId());

        role.setName(roleDTO.getName());
        role.setAbbreviation(roleDTO.getAbbreviation());
        role.setDescription(roleDTO.getDescription());

        roleService.persist(role);
    }

    @Override
    public void delete(@RequestBody RoleDTO roleDTO) {
        roleService.delete(roleDTO.getId());
    }
}
