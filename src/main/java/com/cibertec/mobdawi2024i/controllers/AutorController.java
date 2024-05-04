package com.cibertec.mobdawi2024i.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.mobdawi2024i.entities.AutorEntity;
import com.cibertec.mobdawi2024i.services.AutorServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/autores")
public class AutorController extends BaseControllerImpl<AutorEntity, AutorServiceImpl>{

}
