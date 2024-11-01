package com.example.tienda.services;


import com.example.tienda.models.proveedoresModel;
import com.example.tienda.repositories.IUproveedores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProveedoresService {
    @Autowired
    IUproveedores IUproveedores;

    //create or update
    public void saveOrupdate(proveedoresModel proveedoresModel) {
        IUproveedores.save(proveedoresModel);

    }

    //read
    public List<proveedoresModel> getProveedores() {
        return IUproveedores.findAll();
    }

    //read by id
    public Optional<proveedoresModel> getProveedor(Long id) {
        return IUproveedores.findById(id);
    }

    // delete by id

    public void deleteProveedor(Long id) {
        IUproveedores.deleteById(id);
    }

}




