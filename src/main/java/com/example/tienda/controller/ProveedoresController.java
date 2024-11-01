package com.example.tienda.controller;

import com.example.tienda.models.proveedoresModel;
import com.example.tienda.services.ProveedoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="api/proveedores")

public class ProveedoresController {
    @Autowired
    private ProveedoresService proveedoresService;

    // read
    @GetMapping
    public List<proveedoresModel> getAllProveedores(){
        return proveedoresService.getProveedores();
    }

    // read by id
    @GetMapping("/{proveedorId}")
    public Optional<proveedoresModel> getProveedoreById(@PathVariable("proveedorId") Long proveedorId) {
        return proveedoresService.getProveedor(proveedorId);

    }
    // creat or update
    @PostMapping
    public void saveupdate(@RequestBody proveedoresModel proveedoresModel){
        proveedoresService.saveOrupdate(proveedoresModel);
    }
    // delete
    @DeleteMapping("/{proveedoId}")
    public void deleteproveedor(@PathVariable("proveedorId") Long proveedorId) {
        proveedoresService.deleteProveedor(proveedorId);

    }
}
