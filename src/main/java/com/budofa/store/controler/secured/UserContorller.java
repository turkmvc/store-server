package com.budofa.store.controler.secured;

import com.budofa.store.controler.model.UserDTO;
import com.budofa.store.service.UserService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.lang.reflect.Type;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600) //TODO fix before production. this is for allow CORS
@RestController
@RequestMapping("/secure/user")
public class UserContorller implements BaseSecuredController<UserDTO> {

    @Autowired
    private UserService userService;

    @Override
    public List<UserDTO> get() {
        ModelMapper modelMapper = new ModelMapper();
        Type targetListType = new TypeToken<List<UserDTO>>() {}.getType();
        return modelMapper.map(userService.findAll(), targetListType);
    }

    @Override
    public UserDTO get(@PathVariable Long id) {
        return userService.find(id);
    }

    @Override
    public void save(@RequestBody UserDTO userDTO) {
//        userService.persist(userDTO);
    }

    @Override
    public void update(@Valid @RequestBody UserDTO userDTO) {

    }

    @Override
    public void delete(@RequestBody UserDTO userDTO) {
        userService.delete(userDTO.getId());

    }
}