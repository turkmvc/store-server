package com.budofa.store.controler.secured;

import com.budofa.store.controler.model.BaseDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

public interface BaseSecuredController<T extends BaseDTO> {


    @RequestMapping(method = RequestMethod.GET)
    List<T> get();

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    T get(@PathVariable Long id);

    @RequestMapping(method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    void save(@RequestBody T t);


    @RequestMapping(method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    void update(@Valid @RequestBody T t);

    @RequestMapping(method = RequestMethod.DELETE,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    void delete(@RequestBody T t);
}
